package com.ganway.hr.service;

import java.util.List;
import java.util.Map;

import com.ganway.hr.common.Paginator;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.form.InterviewPage;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;
import com.ganway.hr.vo.TbInterview;

public interface IInterviewService {
	
	/**
	 * 新增面试信息
	 * @param interview 面试信息
	 */
	public void insertInterview(TbInterview interview);
	
	/**
	 * 根据序号获取面试信息
	 * @param id 序号
	 * @return 面试信息
	 */
	public TbInterview getByPrimaryKey(String id);
	
	/**
	 * 更新面试信息
	 * @param interview 面试信息
	 */
	public void updateInterview(TbInterview interview);
	
	public Paginator<InterviewPage> findByPage(int pageSize, int pageNo, Map<String, Object> parameter);
	
	public List<TbBasic> findByPara(SelectPara para);

	RespBody queryBasic(SelectPara para);

	RespBody getInterviewer(String interviewer);
	

}
