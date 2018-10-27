package in.co.a2t.service;

import static in.co.a2t.constant.AppConstant.SALT;

import java.util.Optional;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import in.co.a2t.dao.UserProfileDao;
import in.co.a2t.dto.CreateUserRequest;
import in.co.a2t.dto.UserInfo;
import in.co.a2t.model.User;
import in.co.a2t.utility.HashGenerator;

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
  public UserInfo userById(String loginId) {
    Optional<User> user = userProfileDao.findByLoginId(loginId);
    UserInfo userInfo = null;
    if (user.isPresent()) {
      userInfo = toUserInfo.apply(user.get());
    }

    return userInfo;
  }


  private Function<User, UserInfo> toUserInfo = (user) -> {
    UserInfo userInfo = new UserInfo();
    userInfo.setFirstName(user.getName());
    return userInfo;
  };
}
