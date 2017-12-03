package com.ganway.hr.vo;


/**
 * 查询参数
 *
 */
public class SelectPara {
	
	
	private String export;

	/**
	 * 应聘者姓名
	 */
	private String name;
	
	
	private String employeecode;
	
	/**
	 * 应聘职位
	 */
	private String post;
	
	/**
	 * 应聘区域
	 */
	private String applicationArea;
	
	/**
	 * 出生开始日期
	 */
	private String birthStart;
	
	/**
	 * 出生结束日期
	 */
	private String birthEnd;
	
	/**
	 * 性别
	 */
	private String sex;
	private String sex1;
	private String sex2;
	
	/**
	 * 婚姻状况
	 */
	private String marriage;
	private String marriage1;
	private String marriage2;
	private String marriage3;
	
	/**
	 * 投递开始时间
	 */
	private String createStart;
	
	/**
	 * 投递结束时间
	 */
	private String createEnd;
	
	/**
	 * 简历状态
	 */
	private String status = "1";
	
	/**
	 * 每页条数
	 */
	private Integer pageSize;
	
	/**
	 * 页码
	 */
	private Integer pageNo;
	
	/**
	 * 开始
	 */
	private Integer start;
	
	private Integer startRow;
	
	private Integer endRow;
	
	
	public Integer getStartRow() {
		return this.start;
	}
	public Integer getEndRow() {
		return this.start+this.pageSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getApplicationArea() {
		return applicationArea;
	}

	public void setApplicationArea(String applicationArea) {
		this.applicationArea = applicationArea;
	}

	public String getBirthStart() {
		return birthStart;
	}

	public void setBirthStart(String birthStart) {
		this.birthStart = birthStart;
	}

	public String getBirthEnd() {
		return birthEnd;
	}

	public void setBirthEnd(String birthEnd) {
		this.birthEnd = birthEnd;
	}

	public String getSex1() {
		if(this.sex != null && this.sex.contains(",")){
			return this.sex.split(",")[0];
		}
		return this.sex;
	}
	public String getSex2() {
		if(this.sex != null && this.sex.contains(",")){
			return this.sex.split(",")[1];
		}
		return null;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getMarriage1() {
		if(this.marriage != null && this.marriage.contains(",")){
			return this.marriage.split(",")[0];
		}
		return this.marriage;
	}
	public String getMarriage2() {
		if(this.marriage != null && this.marriage.contains(",")){
			return this.marriage.split(",")[1];
		}
		return null;
	}
	public String getMarriage3() {
		if(this.marriage != null && this.marriage.contains(",") && this.marriage.split(",").length>2){
			return this.marriage.split(",")[2];
		}
		return null;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getCreateStart() {
		return createStart;
	}

	public void setCreateStart(String createStart) {
		this.createStart = createStart;
	}

	public String getCreateEnd() {
		return createEnd;
	}

	public void setCreateEnd(String createEnd) {
		this.createEnd = createEnd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNum(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}
	public String getExport() {
		return export;
	}
	public void setExport(String export) {
		this.export = export;
	}
	
}
