package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client_service_cancel database table.
 * 
 */
@Entity
@Table(name="crm_client_service_cancel")
@NamedQuery(name="CrmClientServiceCancel.findAll", query="SELECT c FROM CrmClientServiceCancel c")
public class CrmClientServiceCancel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="client_id")
	private int clientId;

	@Column(name="service_id")
	private int serviceId;

	public CrmClientServiceCancel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

}