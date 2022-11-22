package com.example.facebookapi.Entity;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="fbstatus")
public class Status {

	@EmbeddedId
	private StatusPK statusPK;
	
	private UUID userID;
	private String statusImageURL;
	private Instant uploadTime;
	
	public Status() {
		super();
	}
	public Status(StatusPK statusPK, UUID userID, String statusImageURL, Instant uploadTime) {
		super();
		this.statusPK = statusPK;
		this.userID = userID;
		this.statusImageURL = statusImageURL;
		this.uploadTime = uploadTime;
	}
	public StatusPK getStatusPK() {
		return statusPK;
	}
	public void setStatusPK(StatusPK statusPK) {
		this.statusPK = statusPK;
	}
	public UUID getUserID() {
		return userID;
	}
	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	public String getStatusImageURL() {
		return statusImageURL;
	}
	public void setStatusImageURL(String statusImageURL) {
		this.statusImageURL = statusImageURL;
	}
	public Instant getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Instant uploadTime) {
		this.uploadTime = uploadTime;
	}
	
	
	
}
