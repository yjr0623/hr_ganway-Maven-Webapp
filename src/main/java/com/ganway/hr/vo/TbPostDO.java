package com.ganway.hr.vo;

import java.util.Date;

public class TbPostDO {
    private String id;

    private String name;

    private String employeecode;

    private String mobile;

    private String deptId;

    private String jobId;

    private String workSystemId;

    private String idNum;

    private Date date_of_birth;

    private String sex;

    private String jobState;

    private Date entryDate;

    private Integer proPeriod;

    private Date formalDate;

    private Date quitDate;

    private String email;

    private String bankCardNo;

    private Integer seniority;

    private String requireSettlement;

    private String requireAttendance;

    private String post;

    private String posttype;

    private String salaryId;

    private String perfId;

    private Double discount;

    private Double senioritySalary;

    private Double otherAllowance;

    private Double trafficAllowance;

    private Double foodAllowance;

    private String tradeUnions;

    private Double tradeUnionsFee;

    private String jobType;

    private Double socialNum;

    private String socialAcc;

    private String housingAcc;

    private String accProperties;

    private String unit;

    private String city;

    private String socialSecurity;

    private Date batchDate;

    private String deleted;

    private String creProId;

    private String createdBy;

    private Date createdDate;

    private String modProId;

    private String lastModifiedBy;

    private Date lastModifiedDate;
    
    private String basicId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode == null ? null : employeecode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getWorkSystemId() {
        return workSystemId;
    }

    public void setWorkSystemId(String workSystemId) {
        this.workSystemId = workSystemId == null ? null : workSystemId.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }



    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState == null ? null : jobState.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getProPeriod() {
        return proPeriod;
    }

    public void setProPeriod(Integer proPeriod) {
        this.proPeriod = proPeriod;
    }

    public Date getFormalDate() {
        return formalDate;
    }

    public void setFormalDate(Date formalDate) {
        this.formalDate = formalDate;
    }

    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public Integer getSeniority() {
        return seniority;
    }

    public void setSeniority(Integer seniority) {
        this.seniority = seniority;
    }

    public String getRequireSettlement() {
        return requireSettlement;
    }

    public void setRequireSettlement(String requireSettlement) {
        this.requireSettlement = requireSettlement == null ? null : requireSettlement.trim();
    }

    public String getRequireAttendance() {
        return requireAttendance;
    }

    public void setRequireAttendance(String requireAttendance) {
        this.requireAttendance = requireAttendance == null ? null : requireAttendance.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype == null ? null : posttype.trim();
    }

    public String getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId == null ? null : salaryId.trim();
    }

    public String getPerfId() {
        return perfId;
    }

    public void setPerfId(String perfId) {
        this.perfId = perfId == null ? null : perfId.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSenioritySalary() {
        return senioritySalary;
    }

    public void setSenioritySalary(Double senioritySalary) {
        this.senioritySalary = senioritySalary;
    }

    public Double getOtherAllowance() {
        return otherAllowance;
    }

    public void setOtherAllowance(Double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public Double getTrafficAllowance() {
        return trafficAllowance;
    }

    public void setTrafficAllowance(Double trafficAllowance) {
        this.trafficAllowance = trafficAllowance;
    }

    public Double getFoodAllowance() {
        return foodAllowance;
    }

    public void setFoodAllowance(Double foodAllowance) {
        this.foodAllowance = foodAllowance;
    }

    public String getTradeUnions() {
        return tradeUnions;
    }

    public void setTradeUnions(String tradeUnions) {
        this.tradeUnions = tradeUnions == null ? null : tradeUnions.trim();
    }

    public Double getTradeUnionsFee() {
        return tradeUnionsFee;
    }

    public void setTradeUnionsFee(Double tradeUnionsFee) {
        this.tradeUnionsFee = tradeUnionsFee;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
    }

    public Double getSocialNum() {
        return socialNum;
    }

    public void setSocialNum(Double socialNum) {
        this.socialNum = socialNum;
    }

    public String getSocialAcc() {
        return socialAcc;
    }

    public void setSocialAcc(String socialAcc) {
        this.socialAcc = socialAcc == null ? null : socialAcc.trim();
    }

    public String getHousingAcc() {
        return housingAcc;
    }

    public void setHousingAcc(String housingAcc) {
        this.housingAcc = housingAcc == null ? null : housingAcc.trim();
    }

    public String getAccProperties() {
        return accProperties;
    }

    public void setAccProperties(String accProperties) {
        this.accProperties = accProperties == null ? null : accProperties.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity == null ? null : socialSecurity.trim();
    }

    public Date getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getCreProId() {
        return creProId;
    }

    public void setCreProId(String creProId) {
        this.creProId = creProId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModProId() {
        return modProId;
    }

    public void setModProId(String modProId) {
        this.modProId = modProId;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getBasicId() {
		return basicId;
	}

	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}
	
}