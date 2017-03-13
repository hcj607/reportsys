package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_call database table.
 * 
 */
@Entity
@Table(name="crm_call")
@NamedQuery(name="CrmCall.findAll", query="SELECT c FROM CrmCall c")
public class CrmCall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private short id;

	@Column(name="agent_id")
	private short agentId;

	private String department;

	private String name;

	private String number;

	@Column(name="role_id")
	private short roleId;

	@Column(name="role_name")
	private String roleName;

	@Column(name="station_id")
	private short stationId;

	@Column(name="user_id")
	private short userId;

	private String username;

	public CrmCall() {
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public short getAgentId() {
		return this.agentId;
	}

	public void setAgentId(short agentId) {
		this.agentId = agentId;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public short getRoleId() {
		return this.roleId;
	}

	public void setRoleId(short roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public short getStationId() {
		return this.stationId;
	}

	public void setStationId(short stationId) {
		this.stationId = stationId;
	}

	public short getUserId() {
		return this.userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}