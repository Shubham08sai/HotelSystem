package com.lcws.user.service.services;

import java.util.List;

import com.lcws.user.service.entities.User;

public interface UserServices {
    //user operations
	//create
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get single user of given userId
	User getUser(String userId);
	
}
