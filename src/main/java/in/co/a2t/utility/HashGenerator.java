package in.co.a2t.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.BiFunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashGenerator {

  private static final Logger LOGGER = LoggerFactory.getLogger(HashGenerator.class);
  private static MessageDigest md5Digest = null;
  static {
    try {
      md5Digest = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      LOGGER.error("error while generating sha-1 hashing");
    }
  }


  public static BiFunction<String, String, String> md5 = (cypherText, salt) -> {
    StringBuilder hash = new StringBuilder();
    if (md5Digest != null) {
      cypherText = salt + cypherText;
      byte[] hashedBytes = md5Digest.digest(cypherText.getBytes());
      char[] digits =
          {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      for (int idx = 0; idx < hashedBytes.length; ++idx) {
        byte b = hashedBytes[idx];
        hash.append(digits[(b & 0xf0) >> 4]);
        hash.append(digits[b & 0x0f]);
      }
    }
    return hash.toString();
  };
}
