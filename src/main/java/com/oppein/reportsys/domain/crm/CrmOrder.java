package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_order database table.
 * 
 */
@Entity
@Table(name="crm_order")
@NamedQuery(name="CrmOrder.findAll", query="SELECT c FROM CrmOrder c")
public class CrmOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="address_fix")
	private String addressFix;

	private String age;

	@Column(name="apply_time")
	private int applyTime;

	private String budget;

	private String city;

	@Column(name="client_id")
	private int clientId;

	private String code;

	private String community;

	@Column(name="create_time")
	private int createTime;

	private String district;

	@Column(name="house_type")
	private byte houseType;

	private byte known;

	@Column(name="last_call_time")
	private int lastCallTime;

	@Column(name="measure_remark")
	private String measureRemark;

	private String name;

	@Column(name="name_remark")
	private String nameRemark;

	@Column(name="next_time")
	private int nextTime;

	@Column(name="operation_status")
	private byte operationStatus;

	private String phone;

	@Column(name="phone_remark")
	private String phoneRemark;

	@Column(name="product_style")
	private byte productStyle;

	private String province;

	private String qq;

	private String remark;

	private byte sex;

	@Column(name="source_id")
	private int sourceId;

	private byte state;

	private byte status;

	private String street;

	private byte transfer;

	private byte type;

	@Column(name="update_time")
	private int updateTime;

	private String wechat;

	public CrmOrder() {
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

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(int applyTime) {
		this.applyTime = applyTime;
	}

	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
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

	public byte getHouseType() {
		return this.houseType;
	}

	public void setHouseType(byte houseType) {
		this.houseType = houseType;
	}

	public byte getKnown() {
		return this.known;
	}

	public void setKnown(byte known) {
		this.known = known;
	}

	public int getLastCallTime() {
		return this.lastCallTime;
	}

	public void setLastCallTime(int lastCallTime) {
		this.lastCallTime = lastCallTime;
	}

	public String getMeasureRemark() {
		return this.measureRemark;
	}

	public void setMeasureRemark(String measureRemark) {
		this.measureRemark = measureRemark;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameRemark() {
		return this.nameRemark;
	}

	public void setNameRemark(String nameRemark) {
		this.nameRemark = nameRemark;
	}

	public int getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(int nextTime) {
		this.nextTime = nextTime;
	}

	public byte getOperationStatus() {
		return this.operationStatus;
	}

	public void setOperationStatus(byte operationStatus) {
		this.operationStatus = operationStatus;
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

	public byte getProductStyle() {
		return this.productStyle;
	}

	public void setProductStyle(byte productStyle) {
		this.productStyle = productStyle;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getSex() {
		return this.sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public int getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public byte getState() {
		return this.state;
	}

	public void setState(byte state) {
		this.state = state;
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

	public byte getTransfer() {
		return this.transfer;
	}

	public void setTransfer(byte transfer) {
		this.transfer = transfer;
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

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

}