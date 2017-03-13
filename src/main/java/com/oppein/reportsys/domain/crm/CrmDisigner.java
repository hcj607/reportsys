package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_disigner database table.
 * 
 */
@Entity
@Table(name="crm_disigner")
@NamedQuery(name="CrmDisigner.findAll", query="SELECT c FROM CrmDisigner c")
public class CrmDisigner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="address_fix")
	private String addressFix;

	private String city;

	@Column(name="create_time")
	private int createTime;

	private String district;

	private String name;

	private String phone;

	@Column(name="phone_remark")
	private String phoneRemark;

	private String province;

	private byte status;

	private String street;

	@Column(name="update_time")
	private int updateTime;

	@Column(name="user_id")
	private int userId;

	public CrmDisigner() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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