package in.co.a2t.service;

import java.util.List;

import in.co.a2t.dto.CreateUserRequest;
import in.co.a2t.dto.DropDown;
import in.co.a2t.dto.UserInfo;

public interface UserProfileSvc {

  void createUserProfile(CreateUserRequest createUserRequest);

  UserInfo userByLoginId(String userId);

  List<DropDown> userTypes();
}
