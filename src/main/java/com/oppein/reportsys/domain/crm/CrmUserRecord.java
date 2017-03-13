package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_user_record database table.
 * 
 */
@Entity
@Table(name="crm_user_record")
@NamedQuery(name="CrmUserRecord.findAll", query="SELECT c FROM CrmUserRecord c")
public class CrmUserRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String authority;

	@Column(name="create_time")
	private int createTime;

	private int newuserid;

	private String type;

	private int userid;

	private byte utype;

	public CrmUserRecord() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public int getNewuserid() {
		return this.newuserid;
	}

	public void setNewuserid(int newuserid) {
		this.newuserid = newuserid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public byte getUtype() {
		return this.utype;
	}

	public void setUtype(byte utype) {
		this.utype = utype;
	}

}