package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_user database table.
 * 
 */
@Entity
@Table(name="crm_user")
@NamedQuery(name="CrmUser.findAll", query="SELECT c FROM CrmUser c")
public class CrmUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String authority;

	private String email;

	@Column(name="group_id")
	private int groupId;

	@Column(name="last_time")
	private int lastTime;

	private String name;

	@Column(name="passport_id")
	private int passportId;

	private String phone;

	@Column(name="role_id")
	private int roleId;

	private byte type;

	public CrmUser() {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(int lastTime) {
		this.lastTime = lastTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassportId() {
		return this.passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}