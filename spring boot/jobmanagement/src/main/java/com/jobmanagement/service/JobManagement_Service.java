package com.jobmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobmanagement.dao.JobManagement_Dao;
import com.jobmanagement.dto.JobManagement;

@Service
public class JobManagement_Service {
	
	
	@Autowired
	JobManagement_Dao dao;
	
	
//	*********************** Save Job Information ***************************
	
	public JobManagement saveJob(JobManagement job) {
		
		return dao.saveJob(job);
		
	}
	
	
//	******************** Update the Job Information ******************************
	
	public JobManagement updataJobInformation(JobManagement jobManagement) {
		
		return dao.updateJobInformation(jobManagement);
		
	}
	

	
//	*********************** Find Job Information By ID ***************************	

	public JobManagement findJobInformationById(int jobid) {
		
		return dao.getJobInformationById(jobid);
		
	}
	
	

}
