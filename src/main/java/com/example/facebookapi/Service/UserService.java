package com.example.facebookapi.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Entity.UserPK;
import com.example.facebookapi.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public User sumbitMetaDataOfUser(User user) {
		
		user.setUserID(new UserPK(UUID.randomUUID()));
		user.setActive(true);
		user.setJoininDate(Instant.now());
		
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public Optional<User> getUserData(UserPK userID) {
		return userRepo.findById(userID);
	}
	
	public List<User> deleteUserByID(UserPK userPK) {
		userRepo.deleteById(userPK);
		return getAllUsers();
	}
	
}
