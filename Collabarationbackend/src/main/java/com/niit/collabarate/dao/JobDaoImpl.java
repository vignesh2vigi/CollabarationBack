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
public class JobDaoImpl implements JobDao {
@Autowired
	private SessionFactory sessionFactory;
	public void addJob(Job job) {
		Session session=sessionFactory.getCurrentSession();
		// TODO Auto-generated method stub
		session.save(job);
	}
	
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Job");
		return query.list();

	}

	
	public Job getJob(int jobId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		 Job job=(Job)session.get(Job.class,jobId);
		 return job;
	}

}
