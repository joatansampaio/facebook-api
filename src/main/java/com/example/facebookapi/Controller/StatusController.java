package com.example.facebookapi.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Entity.StatusPK;
import com.example.facebookapi.Service.StatusService;

@RestController
@RequestMapping("/api/statusService")
public class StatusController {

	@Autowired
	StatusService statusService;
	
	@PostMapping("/save")
	public Status saveStatus(@RequestBody Status status) {
		return statusService.submitStatusToDB(status);
	}
	
	@GetMapping("/getAllStatus")
	public List<Status> getAllStatus(){
		return statusService.getAllStatus();
	}
	
	@DeleteMapping("/delete/{statusID}")
	public List<Status> deleteStatusByID(@PathVariable("statusID") UUID statusPK){
		StatusPK statusID = new StatusPK(statusPK);
		return statusService.deleteByID(statusID);
	}
	
}
