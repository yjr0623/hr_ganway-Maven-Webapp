package com.ganway.hr.dao;

import java.util.List;

import com.ganway.hr.vo.TbFamily;

public interface IFamilyDao {
	
	/**
	 * 新增家庭成员
	 * @param family 
	 */
	public void insertFamily(TbFamily family);
	
	/**
	 * 删除家庭成员
	 * @param id 编号
	 */
	public void deleteByPrimaryKey(String id);

	public void updateByPrimaryKey(TbFamily family);
	
	/**
	 * 根据应聘编号查询家庭成员
	 * @param basicId 应聘编号
	 * @return 家庭成员
	 */
	public List<TbFamily> queryByBasicId(String basicId);

}
