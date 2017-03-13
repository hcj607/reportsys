package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_agent database table.
 * 
 */
@Entity
@Table(name="crm_client_agent")
@NamedQuery(name="CrmClientAgent.findAll", query="SELECT c FROM CrmClientAgent c")
public class CrmClientAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	private byte status;

	@Column(name="user_id")
	private int userId;

	public CrmClientAgent() {
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

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}