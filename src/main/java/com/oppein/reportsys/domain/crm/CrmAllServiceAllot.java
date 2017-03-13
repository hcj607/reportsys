package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_all_service_allot database table.
 * 
 */
@Entity
@Table(name="crm_all_service_allot")
@NamedQuery(name="CrmAllServiceAllot.findAll", query="SELECT c FROM CrmAllServiceAllot c")
public class CrmAllServiceAllot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="group_name")
	private String groupName;

	@Column(name="source_names")
	private String sourceNames;

	private byte status;

	private byte type;

	private int updatetime;

	@Column(name="user_names")
	private String userNames;

	public CrmAllServiceAllot() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getSourceNames() {
		return this.sourceNames;
	}

	public void setSourceNames(String sourceNames) {
		this.sourceNames = sourceNames;
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

	public int getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public String getUserNames() {
		return this.userNames;
	}

	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}

}