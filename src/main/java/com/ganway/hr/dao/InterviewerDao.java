package com.ganway.hr.dao;

import com.ganway.hr.vo.InterviewerDO;
import com.ganway.hr.vo.InterviewerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewerDao {
    long countByExample(InterviewerDOExample example);

    int deleteByExample(InterviewerDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterviewerDO record);

    int insertSelective(InterviewerDO record);

    List<InterviewerDO> selectByExample(InterviewerDOExample example);
    List<InterviewerDO> selectByBasicId(String basicId);

    InterviewerDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterviewerDO record, @Param("example") InterviewerDOExample example);

    int updateByExample(@Param("record") InterviewerDO record, @Param("example") InterviewerDOExample example);

    int updateByPrimaryKeySelective(InterviewerDO record);

    int updateByPrimaryKey(InterviewerDO record);
}