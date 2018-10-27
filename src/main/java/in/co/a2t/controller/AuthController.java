package in.co.a2t.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.a2t.dto.ApplicationResponse;
import in.co.a2t.service.AuthSvc;
import in.co.a2t.utility.ResponseUtil;

@RestController
@RequestMapping(value = "/a2t/auth")
public class AuthController {

  private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

  @Autowired
  private AuthSvc authSvc;

  @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
  public ApplicationResponse login(@RequestHeader("Authorization") String token) {

    ApplicationResponse applicationResponse;
    try {
      String userToken = authSvc.login(token);
      applicationResponse =
          userToken != null ? ResponseUtil.successResponse.get() : ResponseUtil.badRequest.get();
      applicationResponse.setPayload(userToken);
    } catch (Exception e) {
      LOGGER.error("Error while login : {}", e);
      applicationResponse = ResponseUtil.internalServerResponse.get();
    }

    return applicationResponse;
  }
}
