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

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Entity.PostPK;
import com.example.facebookapi.Service.PostService;

@RestController
@RequestMapping("/api/postService")
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("/save")
	public Post savePost(@RequestBody Post body){
		return postService.submitPostToDB(body);
	}
	
	@GetMapping("/getAllPosts")
	public List<Post> getAllPosts(){
		return postService.retrievePostFromDB();
	}
	
	@DeleteMapping("/delete/{postID}")
	public List<Post> deletePostByID(@PathVariable("postID") UUID postID){
		PostPK pk = new PostPK(postID);
		return postService.deletePostFromDB(pk);
	}
	
}
