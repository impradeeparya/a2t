package in.co.a2t.utility;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import in.co.a2t.constant.AppConstant;


public class JwtTokenGenerator {

  public static String generateHMAC256(Map<String, String> parameters)
      throws UnsupportedEncodingException {
    String token = null;
    if (parameters != null && !parameters.isEmpty()) {

      String secret = parameters.remove(AppConstant.JWT_SECRET_KEY);
      String issuer = parameters.remove(AppConstant.JWT_ISSUER_NAME);

      Algorithm algorithm = Algorithm.HMAC256(secret);
      JWTCreator.Builder builder = JWT.create().withIssuer(issuer);
      parameters.forEach(builder::withClaim);
      token = builder.sign(algorithm);
    }
    return token;
  }
}
