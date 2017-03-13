package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_statictics_contract database table.
 * 
 */
@Entity
@Table(name="crm_statictics_contract")
@NamedQuery(name="CrmStaticticsContract.findAll", query="SELECT c FROM CrmStaticticsContract c")
public class CrmStaticticsContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="contract_number")
	private int contractNumber;

	@Column(name="create_time")
	private int createTime;

	@Column(name="group_id")
	private int groupId;

	@Column(name="order_number")
	private int orderNumber;

	@Column(name="sta_time")
	private int staTime;

	public CrmStaticticsContract() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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

}