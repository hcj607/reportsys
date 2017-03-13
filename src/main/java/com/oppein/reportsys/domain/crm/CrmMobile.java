package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_mobile database table.
 * 
 */
@Entity
@Table(name="crm_mobile")
@NamedQuery(name="CrmMobile.findAll", query="SELECT c FROM CrmMobile c")
public class CrmMobile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="area_code")
	private String areaCode;

	private String city;

	@Column(name="mobile_area")
	private String mobileArea;

	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="mobile_type")
	private String mobileType;

	@Column(name="post_code")
	private String postCode;

	private String province;

	private byte state;

	public CrmMobile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileArea() {
		return this.mobileArea;
	}

	public void setMobileArea(String mobileArea) {
		this.mobileArea = mobileArea;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileType() {
		return this.mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public byte getState() {
		return this.state;
	}

	public void setState(byte state) {
		this.state = state;
	}

}