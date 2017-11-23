package com.niit.collabarate.dao;

import java.util.List;

import com.niit.collabarate.model.Friend;
import com.niit.collabarate.model.User;

public interface FriendDao {

	List<User> suggestedusers(String username);
	void friendRequest(Friend friend);//insert into friend

	List<Friend> pendingRequests(String username);

	void updatePendingRequest(Friend friend);
	List<Friend> listOfFriends(String username);
	
	public List<String> getMutualFriends(String username, String otherUsername);

}
