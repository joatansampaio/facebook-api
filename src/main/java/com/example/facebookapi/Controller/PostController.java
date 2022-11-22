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

//Defining controller
@RestController
//Mapping the API service
@RequestMapping("/api/postService")
public class PostController {

	//Reference to the Post Service
	@Autowired
	private PostService postService;

	//Saving post to the database
	@PostMapping("/save")
	public List<Post> submitPost(@RequestBody Post body){
		List<Post> result = postService.submitPostToDB(body);
		return result;
	}
	
	//Getting all posts from the database
	@GetMapping("/retrievePosts")
	public List<Post> retrieveAllPost(){
		List<Post> result = postService.retrievePostFromDB();
		return result;
	}
	
	//Deleting a single post from the database
	@DeleteMapping("/delete/{postID}")
	public List<Post> deleteParticularPost(@PathVariable("postID") UUID postID){
		// This creates a Post Primary Key and passes the UUID into the constructor
		PostPK pk = new PostPK(postID);
		// Delete the selected post and retrieves all the posts from the database
		List<Post> result = postService.deletePostFromDB(pk);
		return result;
	}
	
}
