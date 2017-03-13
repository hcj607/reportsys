package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_agent_order database table.
 * 
 */
//@Entity
//@Table(name="crm_agent_order")
//@NamedQuery(name="CrmAgentOrder.findAll", query="SELECT c FROM CrmAgentOrder c")
public class CrmAgentOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="address_fix")
	private String addressFix;

	private String agent;

	@Column(name="agent_id")
	private int agentId;

	private int city;

	@Column(name="client_id")
	private int clientId;

	private int district;

	@Column(name="order_id")
	private int orderId;

	private String phone;

	private int province;

	private String type;

	@Column(name="type_id")
	private int typeId;

	public CrmAgentOrder() {
	}

	public String getAddressFix() {
		return this.addressFix;
	}

	public void setAddressFix(String addressFix) {
		this.addressFix = addressFix;
	}

	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public int getCity() {
		return this.city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getDistrict() {
		return this.district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getProvince() {
		return this.province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}