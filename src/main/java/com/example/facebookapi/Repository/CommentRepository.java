package com.example.facebookapi.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Entity.CommentPK;

@Repository
public interface CommentRepository extends JpaRepository<Comment, CommentPK>{
	
	@SuppressWarnings("unchecked")
	Comment save(Comment comment);
	
	List<Comment> findAllByPostID(UUID postID);
	
}
