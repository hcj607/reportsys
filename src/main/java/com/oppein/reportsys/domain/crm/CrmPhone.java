package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_phone database table.
 * 
 */
@Entity
@Table(name="crm_phone")
@NamedQuery(name="CrmPhone.findAll", query="SELECT c FROM CrmPhone c")
public class CrmPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int count;

	private String phone;

	public CrmPhone() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}