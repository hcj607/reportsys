package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_agent database table.
 * 
 */
@Entity
@Table(name="crm_agent")
@NamedQuery(name="CrmAgent.findAll", query="SELECT c FROM CrmAgent c")
public class CrmAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="address_fix")
	private String addressFix;

	private String chief;

	private String city;

	@Column(name="create_time")
	private int createTime;

	private String district;

	private byte level;

	private byte line;

	private String name;

	@Column(name="parent_id")
	private int parentId;

	private String phone;

	@Column(name="phone_remark")
	private String phoneRemark;

	private String province;

	private String qq;

	@Column(name="qq_group")
	private String qqGroup;

	private String remark;

	@Column(name="service_id")
	private int serviceId;

	private byte status;

	private String street;

	@Column(name="update_time")
	private int updateTime;

	@Column(name="user_id")
	private int userId;

	public CrmAgent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressFix() {
		return this.addressFix;
	}

	public void setAddressFix(String addressFix) {
		this.addressFix = addressFix;
	}

	public String getChief() {
		return this.chief;
	}

	public void setChief(String chief) {
		this.chief = chief;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public byte getLine() {
		return this.line;
	}

	public void setLine(byte line) {
		this.line = line;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneRemark() {
		return this.phoneRemark;
	}

	public void setPhoneRemark(String phoneRemark) {
		this.phoneRemark = phoneRemark;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQqGroup() {
		return this.qqGroup;
	}

	public void setQqGroup(String qqGroup) {
		this.qqGroup = qqGroup;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}