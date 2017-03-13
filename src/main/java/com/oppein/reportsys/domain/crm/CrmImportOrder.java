package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_import_order database table.
 * 
 */
@Entity
@Table(name="crm_import_order")
@NamedQuery(name="CrmImportOrder.findAll", query="SELECT c FROM CrmImportOrder c")
public class CrmImportOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="act_id")
	private int actId;

	@Column(name="act_name")
	private String actName;

	@Column(name="act_type")
	private String actType;

	@Column(name="act_type_id")
	private int actTypeId;

	private String address;

	@Column(name="address_fix")
	private String addressFix;

	private String age;

	@Column(name="agent_id")
	private int agentId;

	@Column(name="agent_name")
	private String agentName;

	@Column(name="apply_time")
	private String applyTime;

	@Column(name="apply_time_val")
	private String applyTimeVal;

	@Column(name="budget_1")
	private String budget1;

	@Column(name="budget_2")
	private String budget2;

	@Column(name="budget_3")
	private String budget3;

	@Column(name="budget_4")
	private String budget4;

	@Column(name="call_remark")
	private String callRemark;

	@Column(name="call_remark_1")
	private String callRemark1;

	@Column(name="call_remark_2")
	private String callRemark2;

	@Column(name="call_remark_3")
	private String callRemark3;

	@Column(name="call_remark_4")
	private String callRemark4;

	@Column(name="call_time_1")
	private String callTime1;

	@Column(name="call_time_1_val")
	private String callTime1Val;

	@Column(name="call_time_2")
	private String callTime2;

	@Column(name="call_time_2_val")
	private String callTime2Val;

	@Column(name="call_time_3")
	private String callTime3;

	@Column(name="call_time_3_val")
	private String callTime3Val;

	@Column(name="call_time_4")
	private String callTime4;

	@Column(name="call_time_4_val")
	private String callTime4Val;

	private String cancel;

	private String city;

	private String community;

	@Column(name="contract_amount")
	private String contractAmount;

	@Column(name="contract_category")
	private String contractCategory;

	@Column(name="contract_category_val")
	private String contractCategoryVal;

	@Column(name="contract_combo")
	private String contractCombo;

	@Column(name="contract_combo_val")
	private String contractComboVal;

	@Column(name="contract_discount")
	private String contractDiscount;

	@Column(name="contract_material")
	private String contractMaterial;

	@Column(name="contract_month")
	private String contractMonth;

	@Column(name="contract_month_val")
	private String contractMonthVal;

	@Column(name="contract_number")
	private String contractNumber;

	@Column(name="contract_remark")
	private String contractRemark;

	@Column(name="contract_service")
	private String contractService;

	@Column(name="contract_service_val")
	private String contractServiceVal;

	@Column(name="contract_time")
	private String contractTime;

	@Column(name="contract_time_val")
	private String contractTimeVal;

	@Column(name="contract_type")
	private String contractType;

	@Column(name="contract_type_val")
	private String contractTypeVal;

	private String district;

	@Column(name="house_type")
	private String houseType;

	@Column(name="house_type_val")
	private String houseTypeVal;

	private String known;

	@Column(name="known_val")
	private String knownVal;

	private String measure;

	@Column(name="measure_remark")
	private String measureRemark;

	@Column(name="measure_service")
	private String measureService;

	@Column(name="measure_service_val")
	private String measureServiceVal;

	@Column(name="measure_time")
	private String measureTime;

	@Column(name="measure_time_val")
	private String measureTimeVal;

	@Column(name="measure_val")
	private String measureVal;

	private String name;

	@Column(name="name_remark")
	private String nameRemark;

	private String online;

	@Column(name="online_amount")
	private String onlineAmount;

	@Column(name="online_val")
	private int onlineVal;

	private String phone;

	@Column(name="phone_remark")
	private String phoneRemark;

	@Column(name="product_style")
	private String productStyle;

	@Column(name="product_style_val")
	private String productStyleVal;

	private String province;

	private String remark;

	@Column(name="service_id_1")
	private String serviceId1;

	@Column(name="service_id_1_val")
	private String serviceId1Val;

	@Column(name="service_id_2")
	private String serviceId2;

	@Column(name="service_id_2_val")
	private String serviceId2Val;

	@Column(name="service_id_3")
	private String serviceId3;

	@Column(name="service_id_3_val")
	private String serviceId3Val;

	@Column(name="service_id_4")
	private String serviceId4;

	@Column(name="service_id_4_val")
	private String serviceId4Val;

	private String sex;

	@Column(name="sex_val")
	private String sexVal;

	private String status;

	private String street;

	private String subscription;

	@Column(name="subscription_amount")
	private String subscriptionAmount;

	@Column(name="subscription_val")
	private String subscriptionVal;

	private String type;

	@Column(name="type_remark")
	private String typeRemark;

	@Column(name="type_val")
	private String typeVal;

	public CrmImportOrder() {
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

	public String getActType() {
		return this.actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public int getActTypeId() {
		return this.actTypeId;
	}

	public void setActTypeId(int actTypeId) {
		this.actTypeId = actTypeId;
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

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyTimeVal() {
		return this.applyTimeVal;
	}

	public void setApplyTimeVal(String applyTimeVal) {
		this.applyTimeVal = applyTimeVal;
	}

	public String getBudget1() {
		return this.budget1;
	}

	public void setBudget1(String budget1) {
		this.budget1 = budget1;
	}

	public String getBudget2() {
		return this.budget2;
	}

	public void setBudget2(String budget2) {
		this.budget2 = budget2;
	}

	public String getBudget3() {
		return this.budget3;
	}

	public void setBudget3(String budget3) {
		this.budget3 = budget3;
	}

	public String getBudget4() {
		return this.budget4;
	}

	public void setBudget4(String budget4) {
		this.budget4 = budget4;
	}

	public String getCallRemark() {
		return this.callRemark;
	}

	public void setCallRemark(String callRemark) {
		this.callRemark = callRemark;
	}

	public String getCallRemark1() {
		return this.callRemark1;
	}

	public void setCallRemark1(String callRemark1) {
		this.callRemark1 = callRemark1;
	}

	public String getCallRemark2() {
		return this.callRemark2;
	}

	public void setCallRemark2(String callRemark2) {
		this.callRemark2 = callRemark2;
	}

	public String getCallRemark3() {
		return this.callRemark3;
	}

	public void setCallRemark3(String callRemark3) {
		this.callRemark3 = callRemark3;
	}

	public String getCallRemark4() {
		return this.callRemark4;
	}

	public void setCallRemark4(String callRemark4) {
		this.callRemark4 = callRemark4;
	}

	public String getCallTime1() {
		return this.callTime1;
	}

	public void setCallTime1(String callTime1) {
		this.callTime1 = callTime1;
	}

	public String getCallTime1Val() {
		return this.callTime1Val;
	}

	public void setCallTime1Val(String callTime1Val) {
		this.callTime1Val = callTime1Val;
	}

	public String getCallTime2() {
		return this.callTime2;
	}

	public void setCallTime2(String callTime2) {
		this.callTime2 = callTime2;
	}

	public String getCallTime2Val() {
		return this.callTime2Val;
	}

	public void setCallTime2Val(String callTime2Val) {
		this.callTime2Val = callTime2Val;
	}

	public String getCallTime3() {
		return this.callTime3;
	}

	public void setCallTime3(String callTime3) {
		this.callTime3 = callTime3;
	}

	public String getCallTime3Val() {
		return this.callTime3Val;
	}

	public void setCallTime3Val(String callTime3Val) {
		this.callTime3Val = callTime3Val;
	}

	public String getCallTime4() {
		return this.callTime4;
	}

	public void setCallTime4(String callTime4) {
		this.callTime4 = callTime4;
	}

	public String getCallTime4Val() {
		return this.callTime4Val;
	}

	public void setCallTime4Val(String callTime4Val) {
		this.callTime4Val = callTime4Val;
	}

	public String getCancel() {
		return this.cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getContractAmount() {
		return this.contractAmount;
	}

	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getContractCategory() {
		return this.contractCategory;
	}

	public void setContractCategory(String contractCategory) {
		this.contractCategory = contractCategory;
	}

	public String getContractCategoryVal() {
		return this.contractCategoryVal;
	}

	public void setContractCategoryVal(String contractCategoryVal) {
		this.contractCategoryVal = contractCategoryVal;
	}

	public String getContractCombo() {
		return this.contractCombo;
	}

	public void setContractCombo(String contractCombo) {
		this.contractCombo = contractCombo;
	}

	public String getContractComboVal() {
		return this.contractComboVal;
	}

	public void setContractComboVal(String contractComboVal) {
		this.contractComboVal = contractComboVal;
	}

	public String getContractDiscount() {
		return this.contractDiscount;
	}

	public void setContractDiscount(String contractDiscount) {
		this.contractDiscount = contractDiscount;
	}

	public String getContractMaterial() {
		return this.contractMaterial;
	}

	public void setContractMaterial(String contractMaterial) {
		this.contractMaterial = contractMaterial;
	}

	public String getContractMonth() {
		return this.contractMonth;
	}

	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
	}

	public String getContractMonthVal() {
		return this.contractMonthVal;
	}

	public void setContractMonthVal(String contractMonthVal) {
		this.contractMonthVal = contractMonthVal;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractRemark() {
		return this.contractRemark;
	}

	public void setContractRemark(String contractRemark) {
		this.contractRemark = contractRemark;
	}

	public String getContractService() {
		return this.contractService;
	}

	public void setContractService(String contractService) {
		this.contractService = contractService;
	}

	public String getContractServiceVal() {
		return this.contractServiceVal;
	}

	public void setContractServiceVal(String contractServiceVal) {
		this.contractServiceVal = contractServiceVal;
	}

	public String getContractTime() {
		return this.contractTime;
	}

	public void setContractTime(String contractTime) {
		this.contractTime = contractTime;
	}

	public String getContractTimeVal() {
		return this.contractTimeVal;
	}

	public void setContractTimeVal(String contractTimeVal) {
		this.contractTimeVal = contractTimeVal;
	}

	public String getContractType() {
		return this.contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractTypeVal() {
		return this.contractTypeVal;
	}

	public void setContractTypeVal(String contractTypeVal) {
		this.contractTypeVal = contractTypeVal;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getHouseType() {
		return this.houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseTypeVal() {
		return this.houseTypeVal;
	}

	public void setHouseTypeVal(String houseTypeVal) {
		this.houseTypeVal = houseTypeVal;
	}

	public String getKnown() {
		return this.known;
	}

	public void setKnown(String known) {
		this.known = known;
	}

	public String getKnownVal() {
		return this.knownVal;
	}

	public void setKnownVal(String knownVal) {
		this.knownVal = knownVal;
	}

	public String getMeasure() {
		return this.measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public String getMeasureRemark() {
		return this.measureRemark;
	}

	public void setMeasureRemark(String measureRemark) {
		this.measureRemark = measureRemark;
	}

	public String getMeasureService() {
		return this.measureService;
	}

	public void setMeasureService(String measureService) {
		this.measureService = measureService;
	}

	public String getMeasureServiceVal() {
		return this.measureServiceVal;
	}

	public void setMeasureServiceVal(String measureServiceVal) {
		this.measureServiceVal = measureServiceVal;
	}

	public String getMeasureTime() {
		return this.measureTime;
	}

	public void setMeasureTime(String measureTime) {
		this.measureTime = measureTime;
	}

	public String getMeasureTimeVal() {
		return this.measureTimeVal;
	}

	public void setMeasureTimeVal(String measureTimeVal) {
		this.measureTimeVal = measureTimeVal;
	}

	public String getMeasureVal() {
		return this.measureVal;
	}

	public void setMeasureVal(String measureVal) {
		this.measureVal = measureVal;
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

	public String getOnline() {
		return this.online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public String getOnlineAmount() {
		return this.onlineAmount;
	}

	public void setOnlineAmount(String onlineAmount) {
		this.onlineAmount = onlineAmount;
	}

	public int getOnlineVal() {
		return this.onlineVal;
	}

	public void setOnlineVal(int onlineVal) {
		this.onlineVal = onlineVal;
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

	public String getProductStyle() {
		return this.productStyle;
	}

	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
	}

	public String getProductStyleVal() {
		return this.productStyleVal;
	}

	public void setProductStyleVal(String productStyleVal) {
		this.productStyleVal = productStyleVal;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceId1() {
		return this.serviceId1;
	}

	public void setServiceId1(String serviceId1) {
		this.serviceId1 = serviceId1;
	}

	public String getServiceId1Val() {
		return this.serviceId1Val;
	}

	public void setServiceId1Val(String serviceId1Val) {
		this.serviceId1Val = serviceId1Val;
	}

	public String getServiceId2() {
		return this.serviceId2;
	}

	public void setServiceId2(String serviceId2) {
		this.serviceId2 = serviceId2;
	}

	public String getServiceId2Val() {
		return this.serviceId2Val;
	}

	public void setServiceId2Val(String serviceId2Val) {
		this.serviceId2Val = serviceId2Val;
	}

	public String getServiceId3() {
		return this.serviceId3;
	}

	public void setServiceId3(String serviceId3) {
		this.serviceId3 = serviceId3;
	}

	public String getServiceId3Val() {
		return this.serviceId3Val;
	}

	public void setServiceId3Val(String serviceId3Val) {
		this.serviceId3Val = serviceId3Val;
	}

	public String getServiceId4() {
		return this.serviceId4;
	}

	public void setServiceId4(String serviceId4) {
		this.serviceId4 = serviceId4;
	}

	public String getServiceId4Val() {
		return this.serviceId4Val;
	}

	public void setServiceId4Val(String serviceId4Val) {
		this.serviceId4Val = serviceId4Val;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSexVal() {
		return this.sexVal;
	}

	public void setSexVal(String sexVal) {
		this.sexVal = sexVal;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSubscription() {
		return this.subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	public String getSubscriptionAmount() {
		return this.subscriptionAmount;
	}

	public void setSubscriptionAmount(String subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

	public String getSubscriptionVal() {
		return this.subscriptionVal;
	}

	public void setSubscriptionVal(String subscriptionVal) {
		this.subscriptionVal = subscriptionVal;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeRemark() {
		return this.typeRemark;
	}

	public void setTypeRemark(String typeRemark) {
		this.typeRemark = typeRemark;
	}

	public String getTypeVal() {
		return this.typeVal;
	}

	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}

}