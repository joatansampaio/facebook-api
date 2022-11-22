package com.example.facebookapi.Entity;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="fbcomment")
public class Comment {

	@EmbeddedId
	private CommentPK commentPK;
	
	private UUID postID;
	private UUID userID;
	private String description;
	private Instant timestamp;
	
	public Comment() {
		super();
	}
	
	public Comment(CommentPK commentPK,UUID postID, UUID userID, String description, Instant timestamp) {
		super();
		this.commentPK = commentPK;
		this.setPostID(postID);
		this.userID = userID;
		this.description = description;
		this.timestamp = timestamp;
	}
	
	public CommentPK getCommentPK() {
		return commentPK;
	}
	
	public void setCommentPK(CommentPK commentPK) {
		this.commentPK = commentPK;
	}
	
	public UUID getPostID() {
		return postID;
	}

	public void setPostID(UUID postID) {
		this.postID = postID;
	}
	
	public UUID getUserID() {
		return userID;
	}
	
	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Instant getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

}
