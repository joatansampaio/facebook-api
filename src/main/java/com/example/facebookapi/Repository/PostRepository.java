package com.example.facebookapi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Entity.PostPK;

@Repository
public interface PostRepository extends  JpaRepository<Post, PostPK>{
	
	List<Post> findAll();
	
	@SuppressWarnings("unchecked")
	Post save(Post post);
}
