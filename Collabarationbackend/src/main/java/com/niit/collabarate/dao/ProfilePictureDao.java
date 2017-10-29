package com.niit.collabarate.dao;

import com.niit.collabarate.model.ProfilePicture;

public interface ProfilePictureDao {
void uploadProfilePic(ProfilePicture profilePicture);
ProfilePicture getProfilePic(String username);
}
