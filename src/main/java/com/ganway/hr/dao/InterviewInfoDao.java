package com.ganway.hr.dao;

import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.vo.InterviewInfoDO;
import com.ganway.hr.vo.InterviewInfoDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface InterviewInfoDao {
    long countByExample(InterviewInfoDOExample example);

    int deleteByExample(InterviewInfoDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(InterviewInfoDO record);
    
    int insertSelective(InterviewInfoDO record);

    List<InterviewInfoDO> selectByExample(InterviewInfoDOExample example);

    InterviewInfoDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InterviewInfoDO record, @Param("example") InterviewInfoDOExample example);

    int updateByExample(@Param("record") InterviewInfoDO record, @Param("example") InterviewInfoDOExample example);

    int updateByPrimaryKeySelective(InterviewInfoDO record);

    int updateByPrimaryKey(InterviewInfoDO record);
    
    public void insertInterviewInfo(ApplyForm form);

	InterviewInfoDO queryByBasicId(String id);
}