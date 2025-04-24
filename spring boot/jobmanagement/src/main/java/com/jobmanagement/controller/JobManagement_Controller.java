package com.jobmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobmanagement.dto.JobManagement;
import com.jobmanagement.service.JobManagement_Service;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class JobManagement_Controller {
	
	
	@Autowired
	JobManagement_Service jobManagement_Service;

	@PostMapping("/api/jobs")
	public JobManagement saveJob(@RequestBody JobManagement job) {
		
		return jobManagement_Service.saveJob(job);
		
	}
	
	
	@GetMapping("/api/getbyid")
	public JobManagement findJobInformationById(@RequestParam int jobid) {
		
		return jobManagement_Service.findJobInformationById(jobid);
		
	}
	
	
	@PutMapping("/api/updatejobinformation")
	public JobManagement updateJobInformation(@RequestParam JobManagement jobManagement) {
		
		return jobManagement_Service.updataJobInformation(jobManagement);
		
	}
	
	
	
}
