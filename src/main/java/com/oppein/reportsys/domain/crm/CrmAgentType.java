package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_agent_type database table.
 * 
 */
@Entity
@Table(name="crm_agent_type")
@NamedQuery(name="CrmAgentType.findAll", query="SELECT c FROM CrmAgentType c")
public class CrmAgentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="agent_id")
	private int agentId;

	private String remark;

	private byte status;

	private int type;

	public CrmAgentType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
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

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}