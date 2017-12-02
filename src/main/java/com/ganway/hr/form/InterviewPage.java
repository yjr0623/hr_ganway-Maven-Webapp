package com.ganway.hr.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 名称:InterviewPage
 * 描述:${TODO}
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 09:28
 */
public class InterviewPage implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String id;

  /**
   * 面试对象
   */
  private String name;

  private String sex;

  private String postapp;
 

  private Date date_of_birth;

  private String phone;

  private String interviewdate;

  private String interviewer;

  private String status;

  private BigDecimal expSalary;

  private String iscoming;

  private Double lasttime;

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

  /**
   * 职工编号
   */
  private String employeecode;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getPostapp() {
    return postapp;
  }

  public void setPostapp(String postapp) {
    this.postapp = postapp;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getInterviewdate() {
    return interviewdate;
  }

  public void setInterviewdate(String interviewdate) {
    this.interviewdate = interviewdate;
  }

  public String getInterviewer() {
    return interviewer;
  }

  public void setInterviewer(String interviewer) {
    this.interviewer = interviewer;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BigDecimal getExpSalary() {
    return expSalary;
  }

  public void setExpSalary(BigDecimal expSalary) {
    this.expSalary = expSalary;
  }

  public String getIscoming() {
    return iscoming;
  }

  public void setIscoming(String iscoming) {
    this.iscoming = iscoming;
  }

  public Double getLasttime() {
    return lasttime;
  }

  public void setLasttime(Double lasttime) {
    this.lasttime = lasttime;
  }

  public String getPersona() {
    return persona;
  }

  public void setPersona(String persona) {
    this.persona = persona;
  }

  public String getCommunication() {
    return communication;
  }

  public void setCommunication(String communication) {
    this.communication = communication;
  }

  public String getWorkexperience() {
    return workexperience;
  }

  public void setWorkexperience(String workexperience) {
    this.workexperience = workexperience;
  }

  public String getPassion() {
    return passion;
  }

  public void setPassion(String passion) {
    this.passion = passion;
  }

  public String getJobstability() {
    return jobstability;
  }

  public void setJobstability(String jobstability) {
    this.jobstability = jobstability;
  }

  public String getTeamwork() {
    return teamwork;
  }

  public void setTeamwork(String teamwork) {
    this.teamwork = teamwork;
  }

  public String getPostskill() {
    return postskill;
  }

  public void setPostskill(String postskill) {
    this.postskill = postskill;
  }

  public String getIssalary() {
    return issalary;
  }

  public void setIssalary(String issalary) {
    this.issalary = issalary;
  }

  public String getCmsp() {
    return cmsp;
  }

  public void setCmsp(String cmsp) {
    this.cmsp = cmsp;
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
    this.overallMerit = overallMerit;
  }

  public String getIsrecord() {
    return isrecord;
  }

  public void setIsrecord(String isrecord) {
    this.isrecord = isrecord;
  }

  public String getRecPosition() {
    return recPosition;
  }

  public void setRecPosition(String recPosition) {
    this.recPosition = recPosition;
  }

public Date getDate_of_birth() {
	return date_of_birth;
}

public void setDate_of_birth(Date date_of_birth) {
	this.date_of_birth = date_of_birth;
}

public String getEmployeecode() {
	return employeecode;
}

public void setEmployeecode(String employeecode) {
	this.employeecode = employeecode;
}
}
