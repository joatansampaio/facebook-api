package com.example.facebookapi.Entity;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@SuppressWarnings("serial")
//Defining the table name
@Entity(name="fbposts")
public class Post implements Serializable{

	//Primary key
	@EmbeddedId
	private PostPK postID;
	
	private UUID userID;
	
	private String userName;
	private String imageURL;
	
	private String description;
	private String postImgURL;
	
	private int likes;
	private Instant dataTime;
	
	public Post() {
		super();
	}

	public Post(PostPK postID, UUID userID, String userName, String imageURL, String description, String postImgURL,
			int likes, Instant dataTime) {
		super();
		this.postID = postID;
		this.userID = userID;
		this.userName = userName;
		this.imageURL = imageURL;
		this.description = description;
		this.postImgURL = postImgURL;
		this.likes = likes;
		this.dataTime = dataTime;
	}

	public PostPK getPostID() {
		return postID;
	}

	public void setPostID(PostPK postID) {
		this.postID = postID;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostImgURL() {
		return postImgURL;
	}

	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Instant getDataTime() {
		return dataTime;
	}

	public void setDataTime(Instant dataTime) {
		this.dataTime = dataTime;
	}
	
	
	
	
	
}
