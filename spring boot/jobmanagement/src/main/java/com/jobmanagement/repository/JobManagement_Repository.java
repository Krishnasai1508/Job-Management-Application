package com.jobmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobmanagement.dto.JobManagement;

public interface JobManagement_Repository extends JpaRepository<JobManagement, Integer>{

}
