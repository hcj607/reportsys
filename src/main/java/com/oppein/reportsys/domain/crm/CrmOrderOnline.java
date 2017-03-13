package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the crm_order_online database table.
 * 
 */
@Entity
@Table(name="crm_order_online")
@NamedQuery(name="CrmOrderOnline.findAll", query="SELECT c FROM CrmOrderOnline c")
public class CrmOrderOnline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte online;

	@Column(name="order_id")
	private int orderId;

	@Column(name="subscription_amount")
	private BigDecimal subscriptionAmount;

	public CrmOrderOnline() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getOnline() {
		return this.online;
	}

	public void setOnline(byte online) {
		this.online = online;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getSubscriptionAmount() {
		return this.subscriptionAmount;
	}

	public void setSubscriptionAmount(BigDecimal subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

}