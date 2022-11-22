package com.example.facebookapi.Entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class UserPK implements Serializable{

	private UUID userID;

	public UserPK() {
		super();
	}
	
	public UserPK(UUID userID) {
		this.userID = userID;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPK other = (UserPK) obj;
		return Objects.equals(userID, other.userID);
	}
	
	
	
}
