package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_export_client_phone database table.
 * 
 */
@Entity
@Table(name="crm_export_client_phone")
@NamedQuery(name="CrmExportClientPhone.findAll", query="SELECT c FROM CrmExportClientPhone c")
public class CrmExportClientPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String phone;

	public CrmExportClientPhone() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}