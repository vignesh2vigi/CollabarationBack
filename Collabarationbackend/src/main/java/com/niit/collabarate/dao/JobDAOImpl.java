package com.niit.collabarate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabarate.model.Job;



@Repository
@Transactional
public class JobDAOImpl implements JobDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveJob(Job job) {
		Session session=sessionFactory.getCurrentSession();
		session.save(job);

	}

	public List<Job> getalljobs() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Job");
		List<Job> jobs=query.list();
		return jobs;
	}

	public Job getjobbyid(int id) {
		Session session=sessionFactory.getCurrentSession();
		Job job=(Job) session.get(Job.class, id);
		return job;
	}

}
