package com.ganway.hr.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 教育经历
 *
 */
public class TbEducation {

	/**
	 * 序号
	 */
	private Long id;
	
	/**
	 * 应聘编号
	 */
	private String basicId;
	
	/**
	 * 起始年月
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date beginDate;
	
	/**
	 * 终止年月
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	/**
	 * 学校名称
	 */
	private String school;
	
	/**
	 * 专业
	 */
	private String profession;
	
	/**
	 * 学历
	 */
	private String education;
	
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
}
