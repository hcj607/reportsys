package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_log database table.
 * 
 */
@Entity
@Table(name="crm_client_log")
@NamedQuery(name="CrmClientLog.findAll", query="SELECT c FROM CrmClientLog c")
public class CrmClientLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	@Column(name="create_time")
	private int createTime;

	private String remark;

	private byte type;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	public CrmClientLog() {
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}