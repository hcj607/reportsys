package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the crm_order_contract database table.
 * 
 */
@Entity
@Table(name="crm_order_contract")
@NamedQuery(name="CrmOrderContract.findAll", query="SELECT c FROM CrmOrderContract c")
public class CrmOrderContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String addfile;

	@Column(name="contract_amount")
	private BigDecimal contractAmount;

	@Column(name="contract_category")
	private byte contractCategory;

	@Column(name="contract_combo")
	private byte contractCombo;

	@Column(name="contract_discount")
	private BigDecimal contractDiscount;

	@Column(name="contract_material")
	private String contractMaterial;

	@Column(name="contract_month")
	private int contractMonth;

	@Column(name="contract_number")
	private String contractNumber;

	@Column(name="contract_time")
	private int contractTime;

	@Column(name="contract_type")
	private byte contractType;

	@Column(name="contract_write_time")
	private int contractWriteTime;

	@Column(name="create_time")
	private int createTime;

	@Column(name="order_id")
	private int orderId;

	@Column(name="payment_online")
	private byte paymentOnline;

	private String remark;

	private byte status;

	private byte type;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	public CrmOrderContract() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddfile() {
		return this.addfile;
	}

	public void setAddfile(String addfile) {
		this.addfile = addfile;
	}

	public BigDecimal getContractAmount() {
		return this.contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public byte getContractCategory() {
		return this.contractCategory;
	}

	public void setContractCategory(byte contractCategory) {
		this.contractCategory = contractCategory;
	}

	public byte getContractCombo() {
		return this.contractCombo;
	}

	public void setContractCombo(byte contractCombo) {
		this.contractCombo = contractCombo;
	}

	public BigDecimal getContractDiscount() {
		return this.contractDiscount;
	}

	public void setContractDiscount(BigDecimal contractDiscount) {
		this.contractDiscount = contractDiscount;
	}

	public String getContractMaterial() {
		return this.contractMaterial;
	}

	public void setContractMaterial(String contractMaterial) {
		this.contractMaterial = contractMaterial;
	}

	public int getContractMonth() {
		return this.contractMonth;
	}

	public void setContractMonth(int contractMonth) {
		this.contractMonth = contractMonth;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public int getContractTime() {
		return this.contractTime;
	}

	public void setContractTime(int contractTime) {
		this.contractTime = contractTime;
	}

	public byte getContractType() {
		return this.contractType;
	}

	public void setContractType(byte contractType) {
		this.contractType = contractType;
	}

	public int getContractWriteTime() {
		return this.contractWriteTime;
	}

	public void setContractWriteTime(int contractWriteTime) {
		this.contractWriteTime = contractWriteTime;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public byte getPaymentOnline() {
		return this.paymentOnline;
	}

	public void setPaymentOnline(byte paymentOnline) {
		this.paymentOnline = paymentOnline;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}