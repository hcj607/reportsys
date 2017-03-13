package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_menu_back database table.
 * 
 */
@Entity
@Table(name="crm_menu_back")
@NamedQuery(name="CrmMenuBack.findAll", query="SELECT c FROM CrmMenuBack c")
public class CrmMenuBack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte auth;

	@Column(name="create_time")
	private int createTime;

	private String description;

	@Column(name="parent_id")
	private int parentId;

	private byte shortcut;

	private int sort;

	private byte status;

	private byte target;

	private String title;

	private byte type;

	@Column(name="update_time")
	private int updateTime;

	private String url;

	public CrmMenuBack() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAuth() {
		return this.auth;
	}

	public void setAuth(byte auth) {
		this.auth = auth;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public byte getShortcut() {
		return this.shortcut;
	}

	public void setShortcut(byte shortcut) {
		this.shortcut = shortcut;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getTarget() {
		return this.target;
	}

	public void setTarget(byte target) {
		this.target = target;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}