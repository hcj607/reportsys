package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_authority_apply database table.
 * 
 */
@Entity
@Table(name="crm_authority_apply")
@NamedQuery(name="CrmAuthorityApply.findAll", query="SELECT c FROM CrmAuthorityApply c")
public class CrmAuthorityApply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String authority;

	@Lob
	@Column(name="authority_old")
	private String authorityOld;

	@Column(name="create_time")
	private int createTime;

	private String description;

	@Column(name="operate_id")
	private int operateId;

	@Column(name="operate_time")
	private int operateTime;

	private byte status;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	public CrmAuthorityApply() {
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

	public String getAuthorityOld() {
		return this.authorityOld;
	}

	public void setAuthorityOld(String authorityOld) {
		this.authorityOld = authorityOld;
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

	public int getOperateId() {
		return this.operateId;
	}

	public void setOperateId(int operateId) {
		this.operateId = operateId;
	}

	public int getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(int operateTime) {
		this.operateTime = operateTime;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
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