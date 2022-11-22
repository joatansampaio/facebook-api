package com.example.facebookapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Entity.StatusPK;

@Repository
public interface StatusRepository extends JpaRepository<Status, StatusPK>{

	@SuppressWarnings("unchecked")
	Status save(Status status);
	
}
