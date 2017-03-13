package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_stat_active_type database table.
 * 
 */
@Entity
@Table(name="crm_stat_active_type")
@NamedQuery(name="CrmStatActiveType.findAll", query="SELECT c FROM CrmStatActiveType c")
public class CrmStatActiveType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="act_id")
	private int actId;

	@Column(name="active_number")
	private int activeNumber;

	@Column(name="contract_amount")
	private int contractAmount;

	@Column(name="contract_number")
	private int contractNumber;

	@Column(name="measure_number")
	private int measureNumber;

	@Column(name="source_id")
	private int sourceId;

	@Column(name="sta_time")
	private int staTime;

	private byte type;

	public CrmStatActiveType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActId() {
		return this.actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public int getActiveNumber() {
		return this.activeNumber;
	}

	public void setActiveNumber(int activeNumber) {
		this.activeNumber = activeNumber;
	}

	public int getContractAmount() {
		return this.contractAmount;
	}

	public void setContractAmount(int contractAmount) {
		this.contractAmount = contractAmount;
	}

	public int getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public int getMeasureNumber() {
		return this.measureNumber;
	}

	public void setMeasureNumber(int measureNumber) {
		this.measureNumber = measureNumber;
	}

	public int getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getStaTime() {
		return this.staTime;
	}

	public void setStaTime(int staTime) {
		this.staTime = staTime;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}