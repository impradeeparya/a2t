package in.co.a2t.service;

import java.io.UnsupportedEncodingException;

public interface AuthSvc {

  String login(String token) throws UnsupportedEncodingException;
}
