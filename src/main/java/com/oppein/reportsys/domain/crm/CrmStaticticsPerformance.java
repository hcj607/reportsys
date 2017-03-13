package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the crm_statictics_performance database table.
 * 
 */
@Entity
@Table(name="crm_statictics_performance")
@NamedQuery(name="CrmStaticticsPerformance.findAll", query="SELECT c FROM CrmStaticticsPerformance c")
public class CrmStaticticsPerformance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private BigDecimal amount;

	@Column(name="create_time")
	private int createTime;

	@Column(name="sta_time")
	private int staTime;

	@Column(name="user_id")
	private int userId;

	public CrmStaticticsPerformance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public int getStaTime() {
		return this.staTime;
	}

	public void setStaTime(int staTime) {
		this.staTime = staTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}