package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_redpack_log database table.
 * 
 */
@Entity
@Table(name="crm_redpack_log")
@NamedQuery(name="CrmRedpackLog.findAll", query="SELECT c FROM CrmRedpackLog c")
public class CrmRedpackLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="contract_recover_id")
	private int contractRecoverId;

	@Column(name="create_time")
	private int createTime;

	@Column(name="err_code")
	private String errCode;

	@Column(name="re_openid")
	private String reOpenid;

	@Column(name="result_code")
	private String resultCode;

	@Column(name="return_code")
	private String returnCode;

	@Column(name="return_msg")
	private String returnMsg;

	@Column(name="update_time")
	private int updateTime;

	private String wxappid;

	public CrmRedpackLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContractRecoverId() {
		return this.contractRecoverId;
	}

	public void setContractRecoverId(int contractRecoverId) {
		this.contractRecoverId = contractRecoverId;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getReOpenid() {
		return this.reOpenid;
	}

	public void setReOpenid(String reOpenid) {
		this.reOpenid = reOpenid;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return this.returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public int getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public String getWxappid() {
		return this.wxappid;
	}

	public void setWxappid(String wxappid) {
		this.wxappid = wxappid;
	}

}