package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_order_agent database table.
 * 
 */
@Entity
@Table(name="crm_order_agent")
@NamedQuery(name="CrmOrderAgent.findAll", query="SELECT c FROM CrmOrderAgent c")
public class CrmOrderAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="order_id")
	private int orderId;

	private byte status;

	@Column(name="user_id")
	private int userId;

	public CrmOrderAgent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

}