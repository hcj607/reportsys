package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_statictics_order database table.
 * 
 */
@Entity
@Table(name="crm_statictics_order")
@NamedQuery(name="CrmStaticticsOrder.findAll", query="SELECT c FROM CrmStaticticsOrder c")
public class CrmStaticticsOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_number")
	private int clientNumber;

	@Column(name="order_number")
	private int orderNumber;

	@Column(name="sta_time")
	private int staTime;

	@Column(name="user_id")
	private int userId;

	public CrmStaticticsOrder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientNumber() {
		return this.clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getStaTime() {
		return this.staTime;
	}

	public void setStaTime(int staTime) {
		this.staTime = staTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}