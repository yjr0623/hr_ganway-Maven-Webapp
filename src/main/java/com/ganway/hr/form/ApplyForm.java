package com.ganway.hr.form;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ApplyForm {
	/**
	 * 面试官
	 */
	private String interviewer;
	private String employeecode;
	/**
	 * 面试时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date interviewdate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date interviewdate1;
	
	private String remindType;
	private String status;
	/**
	 * 备注
	 */
	private String remarks;
	/**
	 * id数组
	 */
	private String[] ids;
	private String id;
	
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public Date getInterviewdate1() {
		
		return this.interviewdate ;
	}
	public Date getInterviewdate() {
		return interviewdate;
	}
	public void setInterviewdate(Date interviewdate) {
		this.interviewdate = interviewdate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRemindType() {
		return remindType;
	}
	public void setRemindType(String remindType) {
		this.remindType = remindType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmployeecode() {
		return employeecode;
	}
	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

}
