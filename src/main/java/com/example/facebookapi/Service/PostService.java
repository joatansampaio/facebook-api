package com.example.facebookapi.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Entity.PostPK;
import com.example.facebookapi.Repository.PostRepo;

@Service
public class PostService {
	
	@Autowired
	PostRepo postRepo;
	
	public List<Post> submitPostToDB(Post postData){
		
		Instant timeStamp = Instant.now();
		postData.setPostID(new PostPK(UUID.randomUUID()));
		postData.setLikes(0);
		postData.setDataTime(timeStamp);
		postRepo.save(postData);
		List<Post> result = retrievePostFromDB();
		return result;		
	}
	
	public List<Post> retrievePostFromDB(){
		List<Post> result = postRepo.findAll();
		return result;
	}
	
	public List<Post> deletePostFromDB(PostPK postID){
		postRepo.deleteById(postID);
		List<Post> result = retrievePostFromDB();
		return result;	
		
	}
	
}
