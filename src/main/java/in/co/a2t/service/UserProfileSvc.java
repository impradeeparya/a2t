package in.co.a2t.service;

import in.co.a2t.dto.CreateUserRequest;
import in.co.a2t.dto.UserInfo;

public interface UserProfileSvc {

  void createUserProfile(CreateUserRequest createUserRequest);

  UserInfo userById(String userId);
}
