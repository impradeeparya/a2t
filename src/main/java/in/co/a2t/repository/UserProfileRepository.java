package in.co.a2t.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import in.co.a2t.model.User;

public interface UserProfileRepository extends CrudRepository<User, Long> {

  Optional<User> findByLoginId(String loginId);
}
