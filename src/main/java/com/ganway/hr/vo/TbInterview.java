package com.ganway.hr.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 面试信息
 *
 */
public class TbInterview {
	
	/**
	 * 序号
	 */
	private Long id;
	/**
	 * 应聘编号
	 */
	private String basicId;
	/**
	 * 面试官
	 */
	private String interviewer;
	/**
	 * 面试时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date interviewDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 提醒方式
	 */
	private String remindtype;
	/**
	 * 面试状态
	 */
	private String status;
	/**
	 * 是否到来
	 */
	private String iscoming;
	/**
	 * 持续时间
	 */
	private Integer lasttime;
	/**
	 * 期望薪资
	 */
	private Integer exp_salary;
	/**
	 * 申请职位
	 */
	private String post_app;
	/**
	 * 外表形象
	 */
	private String persona;
	/**
	 * 沟通能力
	 */
	private String communication;
	/**
	 * 工作经验
	 */
	private String workexperience;
	/**
	 * 工作热情
	 */
	private String passion;
	/**
	 * 工作稳定性
	 */
	private String jobstability;
	/**
	 * 团队合作
	 */
	private String teamwork;
	/**
	 * 岗位技能
	 */
	private String postskill;
	/**
	 * 薪资是否合标准
	 */
	private String issalary;
	/**
	 * cmsp
	 */
	private String cmsp;
	/**
	 * 可开始工作日期
	 */
	private Date workdate;
	/**
	 * 综合评价
	 */
	private String overall_merit;
	/**
	 * 是否录用
	 */
	private String isrecord;
	/**
	 * 推荐职位
	 */
	private String rec_position;
	/**
	 * 评价
	 */
	private String merit;
	/**
	 * batch执行日
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date batch_date;
	/**
	 * 是否删除(0.否，1.是)
	 */
	private String deleted;
	/**
	 * 处理程序ID
	 */
	private String cre_pro_id;
	/**
	 * 创建人ID
	 */
	private String created_by;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_time;
	/**
	 * 更新程序ID
	 */
	private String mod_pro_id;
	/**
	 * 最后更新者ID
	 */
	private String last_modified_by;
	/**
	 * 最后更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date last_modified_date;
	/**
	 * 职员编号
	 */
	private String employeeCode;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 简历期望薪资
	 */
	private String basicSalary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBasicId() {
		return basicId;
	}
	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemindtype() {
		return remindtype;
	}
	public void setRemindtype(String remindtype) {
		this.remindtype = remindtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIscoming() {
		return iscoming;
	}
	public void setIscoming(String iscoming) {
		this.iscoming = iscoming;
	}
	public Integer getLasttime() {
		return lasttime;
	}
	public void setLasttime(Integer lasttime) {
		this.lasttime = lasttime;
	}
	public Integer getExp_salary() {
		return exp_salary;
	}
	public void setExp_salary(Integer exp_salary) {
		this.exp_salary = exp_salary;
	}
	public String getPost_app() {
		return post_app;
	}
	public void setPost_app(String post_app) {
		this.post_app = post_app;
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
	public String getOverall_merit() {
		return overall_merit;
	}
	public void setOverall_merit(String overall_merit) {
		this.overall_merit = overall_merit;
	}
	public String getIsrecord() {
		return isrecord;
	}
	public void setIsrecord(String isrecord) {
		this.isrecord = isrecord;
	}
	public String getRec_position() {
		return rec_position;
	}
	public void setRec_position(String rec_position) {
		this.rec_position = rec_position;
	}
	public String getMerit() {
		return merit;
	}
	public void setMerit(String merit) {
		this.merit = merit;
	}
	public Date getBatch_date() {
		return batch_date;
	}
	public void setBatch_date(Date batch_date) {
		this.batch_date = batch_date;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getCre_pro_id() {
		return cre_pro_id;
	}
	public void setCre_pro_id(String cre_pro_id) {
		this.cre_pro_id = cre_pro_id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public String getMod_pro_id() {
		return mod_pro_id;
	}
	public void setMod_pro_id(String mod_pro_id) {
		this.mod_pro_id = mod_pro_id;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
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
	public String getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

}
