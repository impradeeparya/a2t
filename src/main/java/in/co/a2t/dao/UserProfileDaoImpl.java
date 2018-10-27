package in.co.a2t.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.User;
import in.co.a2t.model.UserType;
import in.co.a2t.repository.UserProfileRepository;
import in.co.a2t.repository.UserTypeRepository;

@Repository
public class UserProfileDaoImpl implements UserProfileDao {

  @Autowired
  private UserProfileRepository userProfileRepository;

  @Autowired
  private UserTypeRepository userTypeRepository;

  @Override
  public Optional<User> save(User user) {
    return Optional.of(userProfileRepository.save(user));
  }

  @Override
  public Optional<User> findByLoginId(String loginId) {
    return userProfileRepository.findByLoginId(loginId);
  }

  @Override
  public List<UserType> userTypes() {
    return (List<UserType>) userTypeRepository.findAll();
  }
}
