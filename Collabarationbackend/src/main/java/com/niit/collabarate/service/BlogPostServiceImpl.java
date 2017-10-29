package com.niit.collabarate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collabarate.dao.BlogPostDao;
import com.niit.collabarate.model.BlogComment;
import com.niit.collabarate.model.BlogPost;


@Service
public class BlogPostServiceImpl implements BlogPostService {
@Autowired
private BlogPostDao blogpostDao;
	
	public void addBlogPost(BlogPost blogPost) {
		// TODO Auto-generated method stub
		blogpostDao.addBlogPost(blogPost);
	}

	
	public List<BlogPost> getBlogs(int approved) {
		// TODO Auto-generated method stub
	 return	blogpostDao.getBlogs(approved);
	}



	public BlogPost geBlogById(int id) {
		// TODO Auto-generated method stub
		return blogpostDao.geBlogById( id);
	}


	public void updateBlogPost(BlogPost blogPost) {
		// TODO Auto-generated method stub
		blogpostDao.updateBlogPost(blogPost);
	}


	
	public void addBlogComment(BlogComment blogComment) {
		// TODO Auto-generated method stub
		blogpostDao.addBlogComment(blogComment);
	}



	public List<BlogComment> getBlogComments(int blogPostId) {
		// TODO Auto-generated method stub
		return blogpostDao.getBlogComments(blogPostId);
	}


	
	

}
