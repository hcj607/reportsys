package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_service_dep_group database table.
 * 
 */
@Entity
@Table(name="crm_service_dep_group")
@NamedQuery(name="CrmServiceDepGroup.findAll", query="SELECT c FROM CrmServiceDepGroup c")
public class CrmServiceDepGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="create_time")
	private int createTime;

	@Column(name="department_id")
	private int departmentId;
	@Column(name="group")
	private String group;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="update_time")
	private int updateTime;

	public CrmServiceDepGroup() {
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

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(byte isDelete) {
		this.isDelete = isDelete;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

}