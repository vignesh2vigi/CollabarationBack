package com.niit.collabarate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collabarate.dao.ProfilePictureDao;
import com.niit.collabarate.model.ProfilePicture;
@Service
public class ProfilePictureServiceImpl implements ProfilePictureService {
@Autowired
private ProfilePictureDao profilePictureDao;
	public void uploadProfilePic(ProfilePicture profilePicture) {
		// TODO Auto-generated method stub
		profilePictureDao.uploadProfilePic(profilePicture);
	}
	public ProfilePicture getProfilePic(String username) {
		// TODO Auto-generated method stub
		return profilePictureDao.getProfilePic(username);
	}

}
