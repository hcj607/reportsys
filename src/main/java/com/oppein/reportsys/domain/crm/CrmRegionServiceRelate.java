package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_region_service_relate database table.
 * 
 */
@Entity
@Table(name="crm_region_service_relate")
@NamedQuery(name="CrmRegionServiceRelate.findAll", query="SELECT c FROM CrmRegionServiceRelate c")
public class CrmRegionServiceRelate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="group_id")
	private int groupId;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	public CrmRegionServiceRelate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}