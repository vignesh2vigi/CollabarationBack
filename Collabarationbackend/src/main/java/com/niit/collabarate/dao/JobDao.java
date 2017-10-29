package com.niit.collabarate.dao;

import java.util.List;

import com.niit.collabarate.model.Job;

public interface JobDao {
	void addJob(Job job);
   List<Job>getAllJobs();
Job getJob(int jobId);
}