package com.ganway.hr.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 移库理由
 *
 */
public class TbReason {

	/**
	 * 序号
	 */
	private String id;
	/**
	 * basic表id组
	 */
	private String[] ids;
	
	/**
	 * 理由
	 */
	private String reason;
	
	/**
	 * 操作时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date operateTime;
	
	/**
	 * 操作人
	 */
	private String operateId;
	
	/**
	 * 职员编号
	 */
	private String employeeCode;
	
	/**
	 * 移动至
	 */
	private String moveTo;
	/**
	 * 应聘编号
	 */
	private String basicId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateId() {
		return operateId;
	}

	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getMoveTo() {
		return moveTo;
	}

	public void setMoveTo(String moveTo) {
		this.moveTo = moveTo;
	}

	public String getBasicId() {
		return basicId;
	}

	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}
	
	
}
