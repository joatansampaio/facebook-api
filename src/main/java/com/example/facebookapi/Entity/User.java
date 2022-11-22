package com.example.facebookapi.Entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity(name="fbusers")
public class User implements Serializable{

	@EmbeddedId
	private UserPK userID;
	
	private String userName;
	private String userImage;
	private boolean active;
	
	private Instant joininDate;

	public User() {
		super();
	}

	public UserPK getUserID() {
		return userID;
	}

	public void setUserID(UserPK userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Instant getJoininDate() {
		return joininDate;
	}

	public void setJoininDate(Instant joininDate) {
		this.joininDate = joininDate;
	}
	
	
	
	
}
