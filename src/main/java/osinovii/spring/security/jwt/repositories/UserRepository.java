package osinovii.spring.security.jwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import osinovii.spring.security.jwt.entities.Role;
import osinovii.spring.security.jwt.entities.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findByUsername(String username);
}

