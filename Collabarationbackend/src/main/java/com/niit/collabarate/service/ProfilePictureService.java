package com.niit.collabarate.service;

import com.niit.collabarate.model.ProfilePicture;

public interface ProfilePictureService {
	void uploadProfilePic(ProfilePicture profilePicture);
	ProfilePicture getProfilePic(String username);


}