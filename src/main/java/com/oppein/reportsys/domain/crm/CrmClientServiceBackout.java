package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_service_backout database table.
 * 
 */
//@Entity
//@Table(name="crm_client_service_backout")
//@NamedQuery(name="CrmClientServiceBackout.findAll", query="SELECT c FROM CrmClientServiceBackout c")
public class CrmClientServiceBackout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="client_id")
	private int clientId;

	private int id;

	private byte main;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmClientServiceBackout() {
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getMain() {
		return this.main;
	}

	public void setMain(byte main) {
		this.main = main;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}