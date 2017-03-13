package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the crm_order_measure database table.
 * 
 */
@Entity
@Table(name="crm_order_measure")
@NamedQuery(name="CrmOrderMeasure.findAll", query="SELECT c FROM CrmOrderMeasure c")
public class CrmOrderMeasure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="create_time")
	private int createTime;

	private byte measure;

	@Column(name="measure_time")
	private int measureTime;

	@Column(name="order_id")
	private int orderId;

	private String remark;

	private byte status;

	private byte subscription;

	@Column(name="subscription_amount")
	private BigDecimal subscriptionAmount;

	private byte type;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	public CrmOrderMeasure() {
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

	public byte getMeasure() {
		return this.measure;
	}

	public void setMeasure(byte measure) {
		this.measure = measure;
	}

	public int getMeasureTime() {
		return this.measureTime;
	}

	public void setMeasureTime(int measureTime) {
		this.measureTime = measureTime;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getSubscription() {
		return this.subscription;
	}

	public void setSubscription(byte subscription) {
		this.subscription = subscription;
	}

	public BigDecimal getSubscriptionAmount() {
		return this.subscriptionAmount;
	}

	public void setSubscriptionAmount(BigDecimal subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}