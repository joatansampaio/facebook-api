package com.example.facebookapi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Entity.UserPK;

@Repository
public interface UserRepository extends JpaRepository<User, UserPK>{

	@SuppressWarnings("unchecked")
	User save(User user);
	Optional<User> findById(UserPK userPK);
	
}
