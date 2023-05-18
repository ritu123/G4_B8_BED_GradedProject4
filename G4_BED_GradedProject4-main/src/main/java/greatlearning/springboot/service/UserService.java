package greatlearning.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import greatlearning.springboot.dto.UserRegistrationDto;
import greatlearning.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
