package com.example.facebookapi.Entity;

import java.util.UUID;

import javax.persistence.Embeddable;

@Embeddable
public class CommentPK {

	private UUID commentPK;
	
	public CommentPK() {
		super();
	}
	
	public CommentPK(UUID commentID) {
		this.commentPK = commentID;
	}

	public UUID getCommentPK() {
		return commentPK;
	}

	public void setCommentPK(UUID commentPK) {
		this.commentPK = commentPK;
	}
	
	
	
}
