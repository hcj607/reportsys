package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_call_remark_data database table.
 * 
 */
//@Entity
//@Table(name="crm_call_remark_data")
//@NamedQuery(name="CrmCallRemarkData.findAll", query="SELECT c FROM CrmCallRemarkData c")
public class CrmCallRemarkData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="client_id")
	private int clientId;

	private String phone;

	private String remark;

	@Column(name="type_id")
	private int typeId;

	public CrmCallRemarkData() {
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}