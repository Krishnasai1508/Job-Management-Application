package com.jobmanagement.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobmanagement.dto.JobManagement;
import com.jobmanagement.repository.JobManagement_Repository;

@Repository
public class JobManagement_Dao {
	
	@Autowired
	JobManagement_Repository repository;
	

//	*********************** Save Job Information ***************************
	
	public JobManagement saveJob(JobManagement job) {
		
		return repository.save(job);
		
	}

	
//	*********************** Find Job Information By ID ***************************
	
	public JobManagement getJobInformationById(int jobid) {
		
		Optional<JobManagement> o = repository.findById(jobid);
		
		return o.get();
		
	}
	
	
//	******************** Update the Job Information ******************************
	
	public JobManagement updateJobInformation(JobManagement jobManagement) {
		
		return repository.save(jobManagement);
		
	}
	
	
}
