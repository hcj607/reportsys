package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_client database table.
 * 
 */
@Entity
@Table(name="crm_client")
@NamedQuery(name="CrmClient.findAll", query="SELECT c FROM CrmClient c")
public class CrmClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="act_id")
	private int actId;

	@Column(name="act_name")
	private String actName;

	@Column(name="act_url")
	private String actUrl;

	private String address;

	@Column(name="address_fix")
	private String addressFix;

	private String age;

	@Column(name="apply_number")
	private byte applyNumber;

	@Column(name="call_status")
	private byte callStatus;

	private String city;

	private int comefrom;

	private String community;

	@Column(name="create_remark")
	private String createRemark;

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

	@Column(name="next_time_status")
	private byte nextTimeStatus;

	@Column(name="order_time")
	private int orderTime;

	private int ostype;

	private String phone;

	@Column(name="phone_remark")
	private String phoneRemark;

	@Column(name="product_style")
	private byte productStyle;

	private String province;

	private String qq;

	private String remark;

	private byte repeat;

	private byte sex;

	@Column(name="source_id")
	private int sourceId;

	@Column(name="source_parent_id")
	private int sourceParentId;

	private byte state;

	private byte statu;

	private byte status;

	private String street;

	@Column(name="sync_id")
	private int syncId;

	@Column(name="to_invalid")
	private int toInvalid;

	private byte type;

	@Column(name="update_time")
	private int updateTime;

	private String wechat;

	public CrmClient() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActId() {
		return this.actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getActUrl() {
		return this.actUrl;
	}

	public void setActUrl(String actUrl) {
		this.actUrl = actUrl;
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

	public byte getApplyNumber() {
		return this.applyNumber;
	}

	public void setApplyNumber(byte applyNumber) {
		this.applyNumber = applyNumber;
	}

	public byte getCallStatus() {
		return this.callStatus;
	}

	public void setCallStatus(byte callStatus) {
		this.callStatus = callStatus;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(int comefrom) {
		this.comefrom = comefrom;
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getCreateRemark() {
		return this.createRemark;
	}

	public void setCreateRemark(String createRemark) {
		this.createRemark = createRemark;
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

	public byte getNextTimeStatus() {
		return this.nextTimeStatus;
	}

	public void setNextTimeStatus(byte nextTimeStatus) {
		this.nextTimeStatus = nextTimeStatus;
	}

	public int getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	public int getOstype() {
		return this.ostype;
	}

	public void setOstype(int ostype) {
		this.ostype = ostype;
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

	public byte getRepeat() {
		return this.repeat;
	}

	public void setRepeat(byte repeat) {
		this.repeat = repeat;
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

	public int getSourceParentId() {
		return this.sourceParentId;
	}

	public void setSourceParentId(int sourceParentId) {
		this.sourceParentId = sourceParentId;
	}

	public byte getState() {
		return this.state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public byte getStatu() {
		return this.statu;
	}

	public void setStatu(byte statu) {
		this.statu = statu;
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

	public int getSyncId() {
		return this.syncId;
	}

	public void setSyncId(int syncId) {
		this.syncId = syncId;
	}

	public int getToInvalid() {
		return this.toInvalid;
	}

	public void setToInvalid(int toInvalid) {
		this.toInvalid = toInvalid;
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