package com.ganway.hr.vo;

import java.math.BigDecimal;
import java.util.Date;

public class InterviewInfoDO {
    private Long id;

    private String interviewer;

    private Date interviewdate;

    private String remark;

    private String remindtype;

    private String status;

    private String iscoming;

    private Double lasttime;

    private BigDecimal expSalary;

    private String postapp;

    private String persona;

    private String communication;

    private String workexperience;

    private String passion;

    private String jobstability;

    private String teamwork;

    private String postskill;

    private String issalary;

    private String cmsp;

    private Date workdate;

    private String overallMerit;

    private String isrecord;

    private String recPosition;

    private String merit;

    private Date batchDate;

    private String deleted;

    private Long creProId;

    private Long createdBy;

    private Date createdDate;

    private Long modProId;

    private Long lastModifiedBy;

    private Date lastModifiedDate;

    private Long employeecode;
    private String basicId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id ;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer == null ? null : interviewer.trim();
    }

    public Date getInterviewdate() {
        return interviewdate;
    }

    public void setInterviewdate(Date interviewdate) {
        this.interviewdate = interviewdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemindtype() {
        return remindtype;
    }

    public void setRemindtype(String remindtype) {
        this.remindtype = remindtype == null ? null : remindtype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIscoming() {
        return iscoming;
    }

    public void setIscoming(String iscoming) {
        this.iscoming = iscoming == null ? null : iscoming.trim();
    }

    public Double getLasttime() {
        return lasttime;
    }

    public void setLasttime(Double lasttime) {
        this.lasttime = lasttime;
    }

    public BigDecimal getExpSalary() {
        return expSalary;
    }

    public void setExpSalary(BigDecimal expSalary) {
        this.expSalary = expSalary;
    }

    public String getPostapp() {
        return postapp;
    }

    public void setPostapp(String postapp) {
        this.postapp = postapp == null ? null : postapp.trim();
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona == null ? null : persona.trim();
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication == null ? null : communication.trim();
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience == null ? null : workexperience.trim();
    }

    public String getPassion() {
        return passion;
    }

    public void setPassion(String passion) {
        this.passion = passion == null ? null : passion.trim();
    }

    public String getJobstability() {
        return jobstability;
    }

    public void setJobstability(String jobstability) {
        this.jobstability = jobstability == null ? null : jobstability.trim();
    }

    public String getTeamwork() {
        return teamwork;
    }

    public void setTeamwork(String teamwork) {
        this.teamwork = teamwork == null ? null : teamwork.trim();
    }

    public String getPostskill() {
        return postskill;
    }

    public void setPostskill(String postskill) {
        this.postskill = postskill == null ? null : postskill.trim();
    }

    public String getIssalary() {
        return issalary;
    }

    public void setIssalary(String issalary) {
        this.issalary = issalary == null ? null : issalary.trim();
    }

    public String getCmsp() {
        return cmsp;
    }

    public void setCmsp(String cmsp) {
        this.cmsp = cmsp == null ? null : cmsp.trim();
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getOverallMerit() {
        return overallMerit;
    }

    public void setOverallMerit(String overallMerit) {
        this.overallMerit = overallMerit == null ? null : overallMerit.trim();
    }

    public String getIsrecord() {
        return isrecord;
    }

    public void setIsrecord(String isrecord) {
        this.isrecord = isrecord == null ? null : isrecord.trim();
    }

    public String getRecPosition() {
        return recPosition;
    }

    public void setRecPosition(String recPosition) {
        this.recPosition = recPosition == null ? null : recPosition.trim();
    }

    public String getMerit() {
        return merit;
    }

    public void setMerit(String merit) {
        this.merit = merit == null ? null : merit.trim();
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

    public Long getCreProId() {
        return creProId;
    }

    public void setCreProId(Long creProId) {
        this.creProId = creProId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModProId() {
        return modProId;
    }

    public void setModProId(Long modProId) {
        this.modProId = modProId;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(Long employeecode) {
        this.employeecode = employeecode;
    }

	public String getBasicId() {
		return basicId;
	}

	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}
}