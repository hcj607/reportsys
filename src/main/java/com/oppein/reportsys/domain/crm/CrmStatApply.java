package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_stat_apply database table.
 * 
 */
@Entity
@Table(name="crm_stat_apply")
@NamedQuery(name="CrmStatApply.findAll", query="SELECT c FROM CrmStatApply c")
public class CrmStatApply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="act_id")
	private int actId;

	@Column(name="active_client_number")
	private int activeClientNumber;

	@Column(name="active_number")
	private int activeNumber;

	@Column(name="callback_number")
	private int callbackNumber;

	@Column(name="cancel_number")
	private int cancelNumber;

	@Column(name="client_number")
	private int clientNumber;

	@Column(name="source_id")
	private int sourceId;

	@Column(name="sta_time")
	private int staTime;

	public CrmStatApply() {
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

	public int getActiveClientNumber() {
		return this.activeClientNumber;
	}

	public void setActiveClientNumber(int activeClientNumber) {
		this.activeClientNumber = activeClientNumber;
	}

	public int getActiveNumber() {
		return this.activeNumber;
	}

	public void setActiveNumber(int activeNumber) {
		this.activeNumber = activeNumber;
	}

	public int getCallbackNumber() {
		return this.callbackNumber;
	}

	public void setCallbackNumber(int callbackNumber) {
		this.callbackNumber = callbackNumber;
	}

	public int getCancelNumber() {
		return this.cancelNumber;
	}

	public void setCancelNumber(int cancelNumber) {
		this.cancelNumber = cancelNumber;
	}

	public int getClientNumber() {
		return this.clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
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

}