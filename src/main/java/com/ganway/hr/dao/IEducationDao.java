package com.ganway.hr.dao;

import java.util.List;

import com.ganway.hr.vo.TbEducation;
import com.ganway.hr.vo.TbFamily;

public interface IEducationDao {

	/**
	 * 新增教育经历
	 * @param education 
	 */
	public void insertEducation(TbEducation education);
	
	/**
	 * 删除教育经历
	 * @param id 编号
	 */
	public void deleteByPrimaryKey(String id);

	public void updateByPrimaryKey(TbEducation education);
	
	/**
	 * 根据应聘编号查询教育经历
	 * @param basicId 应聘编号
	 * @return 教育经历
	 */
	public List<TbEducation> queryByBasicId(String basicId);
	
}
