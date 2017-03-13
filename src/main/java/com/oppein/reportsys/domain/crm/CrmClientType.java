package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_type database table.
 * 
 */
@Entity
@Table(name="crm_client_type")
@NamedQuery(name="CrmClientType.findAll", query="SELECT c FROM CrmClientType c")
public class CrmClientType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte allot;

	@Column(name="client_id")
	private int clientId;

	@Column(name="new")
	private byte new_;

	private String remark;

	private byte status;

	@Lob
	private String subtype;

	private byte type;

	public CrmClientType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAllot() {
		return this.allot;
	}

	public void setAllot(byte allot) {
		this.allot = allot;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public byte getNew_() {
		return this.new_;
	}

	public void setNew_(byte new_) {
		this.new_ = new_;
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