package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_agent_designer database table.
 * 
 */
@Entity
@Table(name="crm_agent_designer")
@NamedQuery(name="CrmAgentDesigner.findAll", query="SELECT c FROM CrmAgentDesigner c")
public class CrmAgentDesigner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="agent_id")
	private int agentId;

	@Column(name="designer_id")
	private int designerId;

	public CrmAgentDesigner() {
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

	public int getDesignerId() {
		return this.designerId;
	}

	public void setDesignerId(int designerId) {
		this.designerId = designerId;
	}

}