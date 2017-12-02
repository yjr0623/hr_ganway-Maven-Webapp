/**
 * 
 */
package com.ganway.hr.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 分页载体
 * @author: user_rcy@163.com
 * </br>Created on 2016年6月28日
 * @version: V1.0.0
 * @since JDK 1.8 
 * @param <T>
 */
public class Paginator<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2224169418188346059L;
	/**
	 * 总量
	 */
	private Integer totalCount;
	/**
	 * 页大小
	 */
	private Integer pageSize;
	/**
	 * 页码
	 */
	private Integer pageNo;
	/**
	 * 结果集合
	 */
	private List<T> list;
	
	public Paginator(){
		this.totalCount = 0;
		this.pageNo = 0;
		this.pageSize = 0;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	
	public void buildPage(Map<String, Object> param){
		int startRow = 0;
		if(pageNo > 0){
			startRow = (pageNo - 1) * pageSize;
		}
		//mysql
		param.put("offset", startRow);
		param.put("pageSize", pageSize);
		//oracle
		param.put("startRow", startRow+1);
		param.put("endRow", startRow+pageSize); 
	}
		
	public List<T> getList() {
		return list;
	}
	
	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Paginator{" +
				"totalCount=" + totalCount +
				", pageSize=" + pageSize +
				", pageNo=" + pageNo +
				", list=" + list +
				'}';
	}
}
