package com.hcl.services;

import java.util.Optional;

import com.hcl.model.User;


public interface UserService {
	public User save(User user);
	public Optional<User> findByUsername(String userid);
	public boolean verifyLogin(String userid, String pwd);
}
