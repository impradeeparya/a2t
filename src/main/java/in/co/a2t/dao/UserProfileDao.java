package in.co.a2t.dao;

import java.util.Optional;

import in.co.a2t.model.User;

public interface UserProfileDao {

  Optional<User> save(User user);

  Optional<User> findByLoginId(String loginId);
}
