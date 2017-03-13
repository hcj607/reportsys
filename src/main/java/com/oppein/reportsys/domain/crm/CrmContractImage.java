package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_contract_image database table.
 * 
 */
@Entity
@Table(name="crm_contract_image")
@NamedQuery(name="CrmContractImage.findAll", query="SELECT c FROM CrmContractImage c")
public class CrmContractImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="contract_image")
	private String contractImage;

	@Column(name="contract_image_name")
	private String contractImageName;

	@Column(name="contract_recover_id")
	private int contractRecoverId;

	@Column(name="is_delete")
	private byte isDelete;

	public CrmContractImage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContractImage() {
		return this.contractImage;
	}

	public void setContractImage(String contractImage) {
		this.contractImage = contractImage;
	}

	public String getContractImageName() {
		return this.contractImageName;
	}

	public void setContractImageName(String contractImageName) {
		this.contractImageName = contractImageName;
	}

	public int getContractRecoverId() {
		return this.contractRecoverId;
	}

	public void setContractRecoverId(int contractRecoverId) {
		this.contractRecoverId = contractRecoverId;
	}

	public byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(byte isDelete) {
		this.isDelete = isDelete;
	}

}