package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_message_user database table.
 * 
 */
@Entity
@Table(name="crm_message_user")
@NamedQuery(name="CrmMessageUser.findAll", query="SELECT c FROM CrmMessageUser c")
public class CrmMessageUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="message_id")
	private int messageId;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmMessageUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMessageId() {
		return this.messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
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