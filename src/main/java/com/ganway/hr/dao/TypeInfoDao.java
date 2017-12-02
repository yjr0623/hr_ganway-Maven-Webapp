package com.ganway.hr.dao;

import java.util.List;
import java.util.Map;

import com.ganway.hr.vo.TbTypeInfo;

public interface TypeInfoDao {
	public List<TbTypeInfo> getByTpyeId(String type_id);

	public String getInfoByMap(Map<String, String> map);

	public  List<TbTypeInfo> getInterviewer(String interviewer);

}
