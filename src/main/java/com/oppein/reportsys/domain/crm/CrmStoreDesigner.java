package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_store_designer database table.
 * 
 */
@Entity
@Table(name="crm_store_designer")
@NamedQuery(name="CrmStoreDesigner.findAll", query="SELECT c FROM CrmStoreDesigner c")
public class CrmStoreDesigner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="designer_id")
	private int designerId;

	@Column(name="store_id")
	private int storeId;

	public CrmStoreDesigner() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDesignerId() {
		return this.designerId;
	}

	public void setDesignerId(int designerId) {
		this.designerId = designerId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

}