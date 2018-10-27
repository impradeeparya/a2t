package in.co.a2t.service;

import in.co.a2t.dao.UserProfileDao;
import in.co.a2t.dto.CreateUserRequest;
import in.co.a2t.dto.DropDown;
import in.co.a2t.dto.UserInfo;
import in.co.a2t.model.User;
import in.co.a2t.model.UserType;
import in.co.a2t.utility.HashGenerator;
import in.co.a2t.utility.ModelParser;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import static in.co.a2t.constant.AppConstant.SALT;

@Service
public class UserProfileSvcImpl implements UserProfileSvc {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileSvcImpl.class);

  @Autowired
  private UserProfileDao userProfileDao;

  @Autowired
  private Environment environment;


  @Override
  public void createUserProfile(CreateUserRequest createUserRequest) {
    LOGGER.info("creating profile for : {}", createUserRequest);
    User user = createUserRequest.toEntity();
    String hash =
        HashGenerator.md5.apply(createUserRequest.getPassword(), environment.getProperty(SALT));
    user.setPassword(hash);
    userProfileDao.save(user);
  }

  @Override
  public UserInfo userByLoginId(String loginId) {
    Optional<User> user = userProfileDao.findByLoginId(loginId);
    UserInfo userInfo = null;
    if (user.isPresent()) {
      userInfo = toUserInfo.apply(user.get());
    }

    return userInfo;
  }


  private Function<User, UserInfo> toUserInfo = (user) -> {
    UserInfo userInfo = new UserInfo();
    userInfo.setFirstName(user.getName()).setUserType(user.getUserType().getType())
        .setUserTypeId(user.getUserType().getId());
    return userInfo;
  };

  @Override
  public List<DropDown> userTypes() {
    List<UserType> userTypes = userProfileDao.userTypes();
    return ModelParser.userTypeDropDown.apply(userTypes);
  }
}
