package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_prepare database table.
 * 
 */
@Entity
@Table(name="crm_client_prepare")
@NamedQuery(name="CrmClientPrepare.findAll", query="SELECT c FROM CrmClientPrepare c")
public class CrmClientPrepare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="create_time")
	private int createTime;

	private String name;

	private String phone;

	private byte status;

	@Column(name="user_id")
	private short userId;

	public CrmClientPrepare() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public short getUserId() {
		return this.userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

}