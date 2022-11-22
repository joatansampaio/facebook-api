package com.example.facebookapi.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Entity.CommentPK;
import com.example.facebookapi.Repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository commentRepo;
	
	public Comment saveComment(@RequestBody Comment comment) {
		
		comment.setCommentPK(new CommentPK(UUID.randomUUID()));
		comment.setTimestamp(Instant.now());
		
		return commentRepo.save(comment);
	}
	
	public List<Comment> getAllComments(UUID postID){
		return commentRepo.findAllByPostID(postID);
	}
	
	public boolean deleteComment(CommentPK commentPK){
		commentRepo.deleteById(commentPK);
		return true;
	}
}
