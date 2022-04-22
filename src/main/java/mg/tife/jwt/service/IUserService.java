package mg.tife.jwt.service;

import java.util.Optional;

import mg.tife.jwt.model.User;


public interface IUserService {

	Integer saveUser(User user);
	
	Optional<User> findByUsername(String username);
}