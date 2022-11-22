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
	UserRepository userRepository;
	
	public User sumbitMetaDataOfUser(User user) {
		UserPK userID = new UserPK(UUID.randomUUID());
		user.setUserID(userID);
		user.setActive(true);
		user.setJoininDate(Instant.now());
		return userRepository.save(user);
	}
	
	public List<User> retrieveAllUserDetails(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserData(UserPK userID) {
		return userRepository.findById(userID);
	}
	
}
