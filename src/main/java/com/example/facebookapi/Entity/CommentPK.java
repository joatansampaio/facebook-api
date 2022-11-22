package com.example.facebookapi.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class CommentPK implements Serializable{

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
