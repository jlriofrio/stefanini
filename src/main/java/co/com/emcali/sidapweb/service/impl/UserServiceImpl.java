package co.com.emcali.sidapweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.emcali.sidapweb.model.User;
import co.com.emcali.sidapweb.repository.UserRepository;
import co.com.emcali.sidapweb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
