package in.co.a2t.dao;

import java.util.List;
import java.util.Optional;

import in.co.a2t.model.User;
import in.co.a2t.model.UserType;

public interface UserProfileDao {

  Optional<User> save(User user);

  Optional<User> findByLoginId(String loginId);

  List<UserType> userTypes();
}
