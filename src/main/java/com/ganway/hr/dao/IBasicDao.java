package com.ganway.hr.dao;

import java.util.List;
import java.util.Map;

import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.TbBasic;
  
  
public interface IBasicDao {  
      
    public void insertBasic(Candidate candidate);  
      
	public TbBasic findTbBasicByNum(String num);  
	
	public TbBasic load(String id);

	public TbBasic findByEmployeecode(String employeeCode);

	public Integer countByExample(Map<String, Object> parameter);

	public List<TbBasic> findByPage(Map<String, Object> parameter);

	public void updateCanToInterView(ApplyForm form);


	public void updateBasicByIdAndStatus(Map<String, String> map);

	//public void updateCanToInterView(String id);
	
      
}  
