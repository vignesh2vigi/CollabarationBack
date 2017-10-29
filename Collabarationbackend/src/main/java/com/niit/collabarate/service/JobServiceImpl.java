package com.niit.collabarate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collabarate.dao.JobDao;
import com.niit.collabarate.model.Job;
@Service
public class JobServiceImpl implements JobService {
	@Autowired
	private JobDao jobDao;
	public void addJob(Job job) {
		jobDao.addJob(job);

	}
	
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}

	public Job getJob(int jobId) {
		// TODO Auto-generated method stub
		return jobDao.getJob(jobId);
	}

}
