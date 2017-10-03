package com.niit.collabarate.dao;

import com.niit.collabarate.model.User;

public interface UserDAO {
	
	boolean isvalidemail(String email);
	boolean isvalidusername(String username);
	User login(User user);
	void updateuser(User user);
	User getUserbyUsername(String username);
	boolean registerUser(User user);
	
	

}
