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

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Entity.CommentPK;
import com.example.facebookapi.Service.CommentService;

@RestController
@RequestMapping("/api/commentService")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment comment) {
		return commentService.saveComment(comment);
	}
	
	@GetMapping("/getAllComments/{postID}")
	public List<Comment> getAllComments(@PathVariable("postID") UUID postID){
		return commentService.getAllComments(postID);
	}
	
	@DeleteMapping("/delete/{commentID}")
	public boolean deleteCommentByID(@PathVariable UUID commentID){
		CommentPK id = new CommentPK(commentID);
		return commentService.deleteComment(id);
	}
}
