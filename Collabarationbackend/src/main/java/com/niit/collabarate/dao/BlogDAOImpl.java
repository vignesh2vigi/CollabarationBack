package com.niit.collabarate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabarate.model.Blog;

import com.niit.collabarate.dao.BlogDAO;
@Repository
@Transactional
public class BlogDAOImpl implements BlogDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveblog(Blog blog) {
		Session session=sessionFactory.getCurrentSession();
		session.save(blog);
		
	}

	public List<Blog> getallblog(int approved) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from BlogPost where approved="+approved);
		List<Blog> blog=query.list();
		return blog;
	}

}

