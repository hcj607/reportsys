package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_statictics_apply database table.
 * 
 */
@Entity
@Table(name="crm_statictics_apply")
@NamedQuery(name="CrmStaticticsApply.findAll", query="SELECT c FROM CrmStaticticsApply c")
public class CrmStaticticsApply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="create_time")
	private int createTime;

	@Column(name="original_number")
	private int originalNumber;

	@Column(name="sta_time")
	private int staTime;

	@Column(name="ultima_number")
	private int ultimaNumber;

	@Column(name="valid_number")
	private int validNumber;

	@Column(name="void_number")
	private int voidNumber;

	public CrmStaticticsApply() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public int getOriginalNumber() {
		return this.originalNumber;
	}

	public void setOriginalNumber(int originalNumber) {
		this.originalNumber = originalNumber;
	}

	public int getStaTime() {
		return this.staTime;
	}

	public void setStaTime(int staTime) {
		this.staTime = staTime;
	}

	public int getUltimaNumber() {
		return this.ultimaNumber;
	}

	public void setUltimaNumber(int ultimaNumber) {
		this.ultimaNumber = ultimaNumber;
	}

	public int getValidNumber() {
		return this.validNumber;
	}

	public void setValidNumber(int validNumber) {
		this.validNumber = validNumber;
	}

	public int getVoidNumber() {
		return this.voidNumber;
	}

	public void setVoidNumber(int voidNumber) {
		this.voidNumber = voidNumber;
	}

}