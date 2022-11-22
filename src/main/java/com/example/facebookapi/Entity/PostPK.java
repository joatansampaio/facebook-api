package com.example.facebookapi.Entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class PostPK implements Serializable {

	private UUID postID;

	public PostPK() {
		super();
	}
	
	public PostPK(UUID postID) {
		this.postID = postID;
	}
	
	public UUID getPostID() {
		return postID;
	}

	public void setPostID(UUID postID) {
		this.postID = postID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(postID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostPK other = (PostPK) obj;
		return Objects.equals(postID, other.postID);
	}
	
	
	
	
}
