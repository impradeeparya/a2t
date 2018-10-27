package in.co.a2t.controller;


import in.co.a2t.dto.ApplicationResponse;
import in.co.a2t.dto.CreateUserRequest;
import in.co.a2t.service.UserProfileSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static in.co.a2t.utility.ResponseUtil.internalServerResponse;
import static in.co.a2t.utility.ResponseUtil.successResponse;

@RestController
@RequestMapping(value = "/a2t/user")
public class UserController {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserProfileSvc userProfileSvc;

  @PostMapping(value = "/")
  public ApplicationResponse createUser(@RequestBody CreateUserRequest createUserRequest) {

    LOGGER.info("user profile request received for : {}", createUserRequest);
    ApplicationResponse applicationResponse;
    try {
      userProfileSvc.createUserProfile(createUserRequest);
      applicationResponse = successResponse.get();
      LOGGER.info("successfully profile created for : {}", createUserRequest);
    } catch (Exception e) {
      LOGGER.error("error while creating profile for {} : {}", createUserRequest, e);
      applicationResponse = internalServerResponse.get();
    }

    return applicationResponse;
  }

  @GetMapping(value = "/{userId}")
  public ApplicationResponse userById(@PathVariable("userId") String userId) {
    LOGGER.info("fetching user profile for userId : {}", userId);
    ApplicationResponse applicationResponse = successResponse.get();
    applicationResponse.setPayload(userProfileSvc.userByLoginId(userId));
    return applicationResponse;
  }

}
