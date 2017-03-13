package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_message database table.
 * 
 */
@Entity
@Table(name="crm_message")
@NamedQuery(name="CrmMessage.findAll", query="SELECT c FROM CrmMessage c")
public class CrmMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte category;

	@Lob
	private String content;

	@Column(name="create_time")
	private int createTime;

	private String description;

	@Lob
	@Column(name="receive_id")
	private String receiveId;

	@Column(name="send_id")
	private int sendId;

	private String title;

	private byte type;

	public CrmMessage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getCategory() {
		return this.category;
	}

	public void setCategory(byte category) {
		this.category = category;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReceiveId() {
		return this.receiveId;
	}

	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}

	public int getSendId() {
		return this.sendId;
	}

	public void setSendId(int sendId) {
		this.sendId = sendId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}