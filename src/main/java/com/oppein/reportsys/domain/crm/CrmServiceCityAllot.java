package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_service_city_allot database table.
 * 
 */
@Entity
@Table(name="crm_service_city_allot")
@NamedQuery(name="CrmServiceCityAllot.findAll", query="SELECT c FROM CrmServiceCityAllot c")
public class CrmServiceCityAllot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int city;

	@Column(name="update_time")
	private int updateTime;

	private String user;

	private byte week;

	public CrmServiceCityAllot() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCity() {
		return this.city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public byte getWeek() {
		return this.week;
	}

	public void setWeek(byte week) {
		this.week = week;
	}

}