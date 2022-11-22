package com.example.facebookapi.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Entity.StatusPK;
import com.example.facebookapi.Repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	StatusRepository statusRepository;
	
	public Status submitStatusToDB(Status status) {
		//Creating new Primary Key with random UUID
		StatusPK statusPK = new StatusPK(UUID.randomUUID());
		status.setStatusPK(statusPK);
		status.setUploadTime(Instant.now());
		
		return statusRepository.save(status);
	}
	
	public List<Status> getAllStatus() {
		return statusRepository.findAll();
	}
	
	public List<Status> deleteByID(StatusPK statusPK){
		statusRepository.deleteById(statusPK);
		return getAllStatus();
	}
	
}
