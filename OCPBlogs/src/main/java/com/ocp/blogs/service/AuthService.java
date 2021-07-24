package com.ocp.blogs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ocp.blogs.dao.UserDao;
import com.ocp.blogs.dto.RegisterRequest;
import com.ocp.blogs.model.User;

@Service
public class AuthService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public void signup(RegisterRequest registerRequest) {
		User user= new User();
		user.setUsername(registerRequest.getUsername());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(encodePassword(registerRequest.getPassword()));
		
		userDao.save(user);
	}
	
	public String encodePassword(String password) {
		return passwordEncoder.encode(password);
	}

}
