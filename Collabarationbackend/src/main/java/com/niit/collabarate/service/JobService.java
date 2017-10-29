package com.niit.collabarate.service;

import java.util.List;

import com.niit.collabarate.model.Job;

public interface JobService {
	void addJob(Job job);
	List<Job>getAllJobs();
	Job getJob(int jobId);
}