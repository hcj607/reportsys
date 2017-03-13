package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_order_service database table.
 * 
 */
@Entity
@Table(name="crm_order_service")
@NamedQuery(name="CrmOrderService.findAll", query="SELECT c FROM CrmOrderService c")
public class CrmOrderService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="order_id")
	private int orderId;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmOrderService() {
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

}