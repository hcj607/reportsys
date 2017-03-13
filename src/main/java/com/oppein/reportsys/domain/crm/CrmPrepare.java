package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_prepare database table.
 * 
 */
@Entity
@Table(name="crm_prepare")
@NamedQuery(name="CrmPrepare.findAll", query="SELECT c FROM CrmPrepare c")
public class CrmPrepare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	@Column(name="create_time")
	private int createTime;

	@Column(name="new_user_id")
	private short newUserId;

	@Column(name="source_id")
	private short sourceId;

	@Column(name="user_id")
	private short userId;

	public CrmPrepare() {
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

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public short getNewUserId() {
		return this.newUserId;
	}

	public void setNewUserId(short newUserId) {
		this.newUserId = newUserId;
	}

	public short getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(short sourceId) {
		this.sourceId = sourceId;
	}

	public short getUserId() {
		return this.userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

}