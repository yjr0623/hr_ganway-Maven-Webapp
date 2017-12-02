package com.ganway.hr.dao;

import com.ganway.hr.vo.TbInterview;

/**
 * 面试信息数据操作
 *
 */
public interface IInterviewDao {
	
	/**
	 * 新增面试信息
	 * @param interview 面试信息
	 */
	public void insertInterview(TbInterview interview);
	
	/**
	 * 根据序号查询面试信息
	 * @param id 序号
	 * @return 面试信息
	 */
	public TbInterview selectByPrimaryKey(String id);
	
	/**
	 * 更新面试信息
	 * @param interview 面试信息
	 */
	public void updateInterview(TbInterview interview);
	
	/**
	 * 删除面试信息
	 * @param id 序号
	 */
	public void deleteByPrimaryKey(String id);

	public TbInterview selectByBasicId(String id);

}
