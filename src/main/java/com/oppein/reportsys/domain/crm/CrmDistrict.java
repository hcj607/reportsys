package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_district database table.
 * 
 */
@Entity
@Table(name="crm_district")
@NamedQuery(name="CrmDistrict.findAll", query="SELECT c FROM CrmDistrict c")
public class CrmDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	@Column(name="full_name")
	private String fullName;

	private String name;

	@Column(name="parent_code")
	private String parentCode;

	private int status;

	public CrmDistrict() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}