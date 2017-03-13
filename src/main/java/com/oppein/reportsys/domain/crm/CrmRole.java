package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_role database table.
 * 
 */
@Entity
@Table(name="crm_role")
@NamedQuery(name="CrmRole.findAll", query="SELECT c FROM CrmRole c")
public class CrmRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String authority;

	@Column(name="create_time")
	private int createTime;

	private String name;

	@Column(name="parent_id")
	private int parentId;

	private byte status;

	private byte type;

	@Column(name="update_time")
	private int updateTime;

	public CrmRole() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
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

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

}