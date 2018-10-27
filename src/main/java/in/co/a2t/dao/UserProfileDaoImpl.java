package in.co.a2t.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.User;
import in.co.a2t.repository.UserProfileRepository;

@Repository
public class UserProfileDaoImpl implements UserProfileDao {

  @Autowired
  private UserProfileRepository repository;

  @Override
  public Optional<User> save(User user) {
    return Optional.of(repository.save(user));
  }

  @Override
  public Optional<User> findByLoginId(String loginId) {
    return repository.findByLoginId(loginId);
  }
}
