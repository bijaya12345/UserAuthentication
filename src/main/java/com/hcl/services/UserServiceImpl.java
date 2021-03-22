package com.hcl.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.model.User;
import com.hcl.repository.UserCrudRepository;


@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserCrudRepository userCrudRepository;

	@Override
	public User save(User user) {
		return userCrudRepository.save(user);
		
	}

	@Override
	public Optional<User> findByUsername(String username) {
		return userCrudRepository.findById(username);
		
	}

	@Override
	public boolean verifyLogin(String username, String password) {
		if(findByUsername(username).get().getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	
}
