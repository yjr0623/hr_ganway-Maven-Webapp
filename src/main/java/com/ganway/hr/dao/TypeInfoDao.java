package com.ganway.hr.dao;

import java.util.List;

import com.ganway.hr.vo.TbTypeInfo;

public interface TypeInfoDao {
	public List<TbTypeInfo> getByTpyeId(String type_id);

}
