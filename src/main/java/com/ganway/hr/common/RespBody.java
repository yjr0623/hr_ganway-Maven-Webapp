package com.ganway.hr.common;

/**
 * 名称:RespBody 描述:${TODO}
 * 
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 22:55
 */
public class RespBody {

	/**
	 * 返回码
	 */
	private String returnCode;
	/**
	 * 返回信息
	 */
	private String returnMessage;
	/**
	 * 总数
	 */
	private Integer total;
	/**
	 * 返回数据
	 */
	private String data;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
