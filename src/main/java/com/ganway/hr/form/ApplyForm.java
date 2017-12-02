package com.ganway.hr.form;

import java.text.SimpleDateFormat;

public class ApplyForm {
	/**
	 * 面试官
	 */
	private String interviewer;
	/**
	 * 面试时间
	 */
	private String interviewdate;
	private String interviewdate1;
	
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
	public String getInterviewdate1() {
		if(this.interviewdate != null){
			SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
			Long time=new Long(this.interviewdate);
			return format.format(time);
		}
		return null;
	}
	public String getInterviewdate() {
		return interviewdate;
	}
	public void setInterviewdate(String interviewdate) {
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

}
