package mg.tife.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mg.tife.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
	Optional<User> findByUsername(String username);
}
