package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_activity database table.
 * 
 */
@Entity
@Table(name="crm_activity")
@NamedQuery(name="CrmActivity.findAll", query="SELECT c FROM CrmActivity c")
public class CrmActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="edm_act_id")
	private int edmActId;

	private String name;

	private byte status;

	@Column(name="topic_id")
	private int topicId;

	private int type;

	public CrmActivity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getEdmActId() {
		return this.edmActId;
	}

	public void setEdmActId(int edmActId) {
		this.edmActId = edmActId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getTopicId() {
		return this.topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}