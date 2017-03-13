package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_service_relate database table.
 * 
 */
@Entity
@Table(name="crm_service_relate")
@NamedQuery(name="CrmServiceRelate.findAll", query="SELECT c FROM CrmServiceRelate c")
public class CrmServiceRelate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="children_id")
	private int childrenId;

	@Column(name="group_id")
	private int groupId;

	@Column(name="service_id")
	private int serviceId;

	private byte status;

	private byte type;

	public CrmServiceRelate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChildrenId() {
		return this.childrenId;
	}

	public void setChildrenId(int childrenId) {
		this.childrenId = childrenId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}