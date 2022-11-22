package com.example.facebookapi.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class StatusPK implements Serializable{

	private UUID statusPK;
	
	public StatusPK() {
		super();
	}

	public StatusPK(UUID statusPK) {
		this.statusPK = statusPK;
	}

	public UUID getStatusPK() {
		return statusPK;
	}

	public void setStatusPK(UUID statusPK) {
		this.statusPK = statusPK;
	}
	
	

}
