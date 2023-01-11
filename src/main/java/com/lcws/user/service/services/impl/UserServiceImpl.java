package com.lcws.user.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcws.user.service.entities.User;
import com.lcws.user.service.exceptions.ResourceNotFoundException;
import com.lcws.user.service.repositories.UserRepository;
import com.lcws.user.service.services.UserServices;

@Service
public class UserServiceImpl implements UserServices  {
    
	@Autowired
	private UserRepository userRepository;
    
	 
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server!!"+ userId));
	}

}
