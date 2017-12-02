package com.ganway.hr.dao;

import java.util.List;

import com.ganway.hr.vo.TbCompany;

public interface ICompanyDao {

	/**
	 * 新增工作经历
	 * @param company 
	 */
	public void insertCompany(TbCompany company);
	
	/**
	 * 删除工作经历
	 * @param id 编号
	 */
	public void deleteByPrimaryKey(String id);

	public void updateByPrimaryKey(TbCompany company);
	
	/**
	 * 根据应聘编号查询工作经历
	 * @param basicId 应聘编号
	 * @return 工作经历
	 */
	public List<TbCompany> queryByBasicId(String basicId);
	
}
