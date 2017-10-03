package com.niit.collabarate.dao;


import java.util.List;

import com.niit.collabarate.model.Blog;

public interface BlogDAO {

	void saveblog(Blog blog);
	List<Blog> getallblog(int approved);
	
}