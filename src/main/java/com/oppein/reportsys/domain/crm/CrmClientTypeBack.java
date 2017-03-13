package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_type_back database table.
 * 
 */
@Entity
@Table(name="crm_client_type_back")
@NamedQuery(name="CrmClientTypeBack.findAll", query="SELECT c FROM CrmClientTypeBack c")
public class CrmClientTypeBack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	@Column(name="max_price")
	private int maxPrice;

	@Column(name="min_price")
	private int minPrice;

	private String remark;

	private byte status;

	@Lob
	private String subtype;

	private byte type;

	public CrmClientTypeBack() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
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

	public String getSubtype() {
		return this.subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}