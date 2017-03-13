package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_orderuser database table.
 * 
 */
@Entity
@Table(name="crm_client_orderuser")
@NamedQuery(name="CrmClientOrderuser.findAll", query="SELECT c FROM CrmClientOrderuser c")
public class CrmClientOrderuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	@Column(name="user_id")
	private int userId;

	public CrmClientOrderuser() {
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}