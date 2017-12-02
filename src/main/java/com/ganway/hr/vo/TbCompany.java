package com.ganway.hr.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 工作经历
 *
 */
public class TbCompany {

	/**
	 * 序号
	 */
	private Long id;
	
	/**
	 * 应聘编号
	 */
	private String basicId;
	
	/**
	 * 起始时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date beginDate;
	
	/**
	 * 终止时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	/**
	 * 公司名称
	 */
	private String company;
	
	/**
	 * 职务
	 */
	private String post;
	
	/**
	 * 薪资
	 */
	private String salary;
	
	/**
	 * 离职原因
	 */
	private String reason;
	
	/**
	 * 证明人
	 */
	private String reterence;
	
	/**
	 * 证明人电话
	 */
	private String phone;
	
	/**
	 * 职员编号
	 */
	private String employeeCode;

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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReterence() {
		return reterence;
	}

	public void setReterence(String reterence) {
		this.reterence = reterence;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
}
