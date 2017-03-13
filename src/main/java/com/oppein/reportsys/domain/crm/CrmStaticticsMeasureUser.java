package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_statictics_measure_user database table.
 * 
 */
@Entity
@Table(name="crm_statictics_measure_user")
@NamedQuery(name="CrmStaticticsMeasureUser.findAll", query="SELECT c FROM CrmStaticticsMeasureUser c")
public class CrmStaticticsMeasureUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="create_time")
	private int createTime;

	@Column(name="group_id")
	private int groupId;

	@Column(name="measure_number")
	private int measureNumber;

	@Column(name="order_number")
	private int orderNumber;

	@Column(name="role_id")
	private int roleId;

	@Column(name="sta_time")
	private int staTime;

	private int status;

	@Column(name="user_id")
	private int userId;

	public CrmStaticticsMeasureUser() {
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

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getMeasureNumber() {
		return this.measureNumber;
	}

	public void setMeasureNumber(int measureNumber) {
		this.measureNumber = measureNumber;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getStaTime() {
		return this.staTime;
	}

	public void setStaTime(int staTime) {
		this.staTime = staTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}