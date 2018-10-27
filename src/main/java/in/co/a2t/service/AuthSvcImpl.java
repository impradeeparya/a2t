package in.co.a2t.service;

import in.co.a2t.dao.UserProfileDao;
import in.co.a2t.model.User;
import in.co.a2t.utility.AppUtil;
import in.co.a2t.utility.HashGenerator;
import in.co.a2t.utility.JwtTokenGenerator;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import static in.co.a2t.constant.AppConstant.JWT_ISS;
import static in.co.a2t.constant.AppConstant.JWT_ISSUER_NAME;
import static in.co.a2t.constant.AppConstant.JWT_LOGIN_SECRET;
import static in.co.a2t.constant.AppConstant.JWT_SECRET_KEY;
import static in.co.a2t.constant.AppConstant.SALT;

@Service
public class AuthSvcImpl implements AuthSvc {

  @Autowired
  private UserProfileDao userProfileDao;

  @Autowired
  private Environment environment;

  @Override
  public String login(String token) throws UnsupportedEncodingException {
    String userToken = null;
    String credential = AppUtil.base64Decode.apply(token);
    if (credential != null) {
      String[] credentials = credential.split(":");
      Optional<User> userProfile = userProfileDao.findByLoginId(credentials[0]);

      if (userProfile.isPresent()) {
        User profile = userProfile.get();
        if (profile.getPassword()
            .equals(HashGenerator.md5.apply(credentials[1], environment.getProperty(SALT)))) {
          Map<String, String> parameters = new HashMap<>();
          parameters.put("token", profile.getUserId());
          parameters.put(JWT_SECRET_KEY, environment.getProperty(JWT_LOGIN_SECRET));
          parameters.put(JWT_ISSUER_NAME, JWT_ISS);
          userToken = JwtTokenGenerator.generateHMAC256(parameters);
        }
      }
    }
    return userToken;
  }
}
