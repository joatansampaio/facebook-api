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
	StatusRepository statusRepo;
	
	public Status submitStatusToDB(Status status) {
		
		//Creating new Primary Key with random UUID
		status.setStatusPK(new StatusPK(UUID.randomUUID()));
		status.setUploadTime(Instant.now());
		
		return statusRepo.save(status);
	}
	
	public List<Status> getAllStatus() {
		return statusRepo.findAll();
	}
	
	public List<Status> deleteByID(StatusPK statusPK){
		statusRepo.deleteById(statusPK);
		return getAllStatus();
	}
	
}
