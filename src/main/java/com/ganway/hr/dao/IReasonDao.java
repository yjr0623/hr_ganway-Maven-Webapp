package com.ganway.hr.dao;

import java.util.List;
import java.util.Map;

import com.ganway.hr.vo.TbReason;

/**
 * 移库理由
 *
 */
public interface IReasonDao {
	
	/**
	 * 新增移库理由
	 * @param reason
	 */
	public void insertReason(TbReason reason);
	
	/**
	 * 删除
	 * @param id
	 */
	public void deleteByPrimaryKey(String id);
	
	/**
	 * 查询
	 * @param basicId
	 * @param moveTo 
	 * @return
	 */
	public List<TbReason> queryByBasicId(String basicId);
	
	public List<TbReason> queryByBasicIdAndMoveTo(Map<String, String> map);

}
