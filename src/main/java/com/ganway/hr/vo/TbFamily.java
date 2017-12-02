package com.ganway.hr.vo;


/**
 * 家庭成员
 *
 */
public class TbFamily {
	
	/**
	 * 序号
	 */
	private Long id;
	
	/**
	 * 应聘编号
	 */
	private String basicId;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 关系
	 */
	private String relation;
	
	/**
	 * 年龄
	 */
	private String age;
	
	/**
	 * 居住地
	 */
	private String residence;
	
	/**
	 * 工作单位
	 */
	private String company;
	
	/**
	 * 职务
	 */
	private String post;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
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

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	

}
