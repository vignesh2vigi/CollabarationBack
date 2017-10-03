package com.niit.collabarate.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabarate.model.User;



@Repository
@Transactional
public  class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean registerUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		return true;
	}

	public boolean isvalidemail(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where email=?");
		query.setString(0, email);
		User user=(User) query.uniqueResult();
		if(user==null)
			return true;
		else
			return false;
	}

	public boolean isvalidusername(String username) {
		
		Session session=sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class, username);
		if(user==null)
			return true;
		else
			return false;
	}

	public User login(User user) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where username=? and password=?");
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
			return (User) query.uniqueResult();
	}

	public void updateuser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
		
	}

	public User getUserbyUsername(String username) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class, username);
		return user;
	}

}