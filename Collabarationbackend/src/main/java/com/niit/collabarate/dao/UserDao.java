package com.niit.collabarate.dao;

import java.util.List;

import com.niit.collabarate.model.Job;
import com.niit.collabarate.model.User;

public interface UserDao {
	boolean isUsernamevalid(String username);
	boolean registerUser(User user);
	boolean isEmailvalid(String email);
	User login(User user);
	void update(User user);
	boolean isUpdatedEmailValid(String email,String username);
	User getUserByUsername(String username);
	List<User>getuser();
}