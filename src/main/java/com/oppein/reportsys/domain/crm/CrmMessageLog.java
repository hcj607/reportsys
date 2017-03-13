package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_message_log database table.
 * 
 */
@Entity
@Table(name="crm_message_log")
@NamedQuery(name="CrmMessageLog.findAll", query="SELECT c FROM CrmMessageLog c")
public class CrmMessageLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String content;

	@Column(name="create_time")
	private int createTime;

	private String phone;

	private String result;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmMessageLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
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