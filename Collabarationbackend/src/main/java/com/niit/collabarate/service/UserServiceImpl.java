package com.niit.collabarate.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.collabarate.dao.UserDAO;
import com.niit.collabarate.model.User;

public class UserServiceImpl implements UserService {
  @Autowired
  private UserDAO userDAO;
	
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.registerUser(user);
	}

	
	public boolean isUsernameValid(String username) {
		// TODO Auto-generated method stub
		return userDAO.isvalidusername(username);
	}

	
	public boolean isEmailValid(String email) {
		// TODO Auto-generated method stub
		return userDAO.isvalidemail(email);
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return userDAO.login(user);
	}


	public void update(User user) {
		// TODO Auto-generated method stub
		userDAO.updateuser(user);

	}

	
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserbyUsername(username);
	}

}
