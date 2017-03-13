package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_service_back database table.
 * 
 */
@Entity
@Table(name="crm_client_service_back")
@NamedQuery(name="CrmClientServiceBack.findAll", query="SELECT c FROM CrmClientServiceBack c")
public class CrmClientServiceBack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	private byte main;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmClientServiceBack() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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