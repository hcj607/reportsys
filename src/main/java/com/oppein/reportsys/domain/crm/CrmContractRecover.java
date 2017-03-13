package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_contract_recover database table.
 * 
 */
@Entity
@Table(name="crm_contract_recover")
@NamedQuery(name="CrmContractRecover.findAll", query="SELECT c FROM CrmContractRecover c")
public class CrmContractRecover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="agent_status")
	private byte agentStatus;

	@Column(name="client_id")
	private int clientId;

	@Column(name="contract_address")
	private String contractAddress;

	@Column(name="contract_name")
	private String contractName;

	@Column(name="contract_phone")
	private String contractPhone;

	@Column(name="create_time")
	private int createTime;

	@Column(name="is_auto")
	private byte isAuto;

	@Column(name="is_blacklist")
	private byte isBlacklist;

	@Column(name="is_delete")
	private byte isDelete;

	@Column(name="is_pay")
	private byte isPay;

	@Column(name="is_pay2")
	private byte isPay2;

	@Column(name="mch_billno")
	private String mchBillno;

	@Column(name="mch_billno2")
	private String mchBillno2;

	private String openid;

	@Column(name="order_id")
	private int orderId;

	@Column(name="pay_number")
	private String payNumber;

	private String phone;

	private String remark;

	@Column(name="service_status")
	private byte serviceStatus;

	@Column(name="service_status1")
	private byte serviceStatus1;

	@Column(name="service_time")
	private int serviceTime;

	@Column(name="update_time")
	private int updateTime;

	public CrmContractRecover() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAgentStatus() {
		return this.agentStatus;
	}

	public void setAgentStatus(byte agentStatus) {
		this.agentStatus = agentStatus;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getContractAddress() {
		return this.contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractPhone() {
		return this.contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public byte getIsAuto() {
		return this.isAuto;
	}

	public void setIsAuto(byte isAuto) {
		this.isAuto = isAuto;
	}

	public byte getIsBlacklist() {
		return this.isBlacklist;
	}

	public void setIsBlacklist(byte isBlacklist) {
		this.isBlacklist = isBlacklist;
	}

	public byte getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(byte isDelete) {
		this.isDelete = isDelete;
	}

	public byte getIsPay() {
		return this.isPay;
	}

	public void setIsPay(byte isPay) {
		this.isPay = isPay;
	}

	public byte getIsPay2() {
		return this.isPay2;
	}

	public void setIsPay2(byte isPay2) {
		this.isPay2 = isPay2;
	}

	public String getMchBillno() {
		return this.mchBillno;
	}

	public void setMchBillno(String mchBillno) {
		this.mchBillno = mchBillno;
	}

	public String getMchBillno2() {
		return this.mchBillno2;
	}

	public void setMchBillno2(String mchBillno2) {
		this.mchBillno2 = mchBillno2;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getPayNumber() {
		return this.payNumber;
	}

	public void setPayNumber(String payNumber) {
		this.payNumber = payNumber;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(byte serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public byte getServiceStatus1() {
		return this.serviceStatus1;
	}

	public void setServiceStatus1(byte serviceStatus1) {
		this.serviceStatus1 = serviceStatus1;
	}

	public int getServiceTime() {
		return this.serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

}