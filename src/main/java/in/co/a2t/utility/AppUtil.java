package in.co.a2t.utility;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.function.Function;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(AppUtil.class);

  public static Supplier<String> uniqueId = () -> {
    String id = null;
    try {
      SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
      id = String.valueOf(Math.abs(prng.nextInt()));
    } catch (NoSuchAlgorithmException e) {
      LOGGER.error("Error while creating unique {} : {}", e.getMessage(), e);
    }
    return id;
  };

  public static Function<String, String> base64Decode = (encodedText) -> {
    byte[] decodedText = Base64.getDecoder().decode(encodedText);
    return new String(decodedText);
  };
}
