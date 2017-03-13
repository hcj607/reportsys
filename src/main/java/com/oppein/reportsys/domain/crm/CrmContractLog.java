package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_contract_log database table.
 * 
 */
@Entity
@Table(name="crm_contract_log")
@NamedQuery(name="CrmContractLog.findAll", query="SELECT c FROM CrmContractLog c")
public class CrmContractLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="contract_recover_id")
	private int contractRecoverId;

	@Column(name="create_time")
	private int createTime;

	private String remark;

	private byte type;

	public CrmContractLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContractRecoverId() {
		return this.contractRecoverId;
	}

	public void setContractRecoverId(int contractRecoverId) {
		this.contractRecoverId = contractRecoverId;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}