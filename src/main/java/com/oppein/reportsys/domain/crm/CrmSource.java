package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_source database table.
 * 
 */
@Entity
@Table(name="crm_source")
@NamedQuery(name="CrmSource.findAll", query="SELECT c FROM CrmSource c")
public class CrmSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@Column(name="new")
	private byte new_;

	@Column(name="parent_id")
	private int parentId;

	private byte status;

	public CrmSource() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getNew_() {
		return this.new_;
	}

	public void setNew_(byte new_) {
		this.new_ = new_;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}