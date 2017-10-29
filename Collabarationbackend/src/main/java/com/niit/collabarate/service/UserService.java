package com.niit.collabarate.service;

import com.niit.collabarate.model.User;

public interface UserService {
	boolean isUsernamevalid(String username);
	boolean registerUser(User user);
	boolean isEmailvalid(String email);
	User login(User user);
	void update(User user);
	User getUserByUsername(String username);
	boolean isUpdatedEmailValid(String email,String username);

}