package com.ganway.hr.dao;

import com.ganway.hr.vo.TbPostDO;
import com.ganway.hr.vo.TbPostDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPostDao {
    long countByExample(TbPostDOExample example);

    int deleteByExample(TbPostDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPostDO record);

    int insertSelective(TbPostDO record);

    List<TbPostDO> selectByExample(TbPostDOExample example);

    TbPostDO selectByPrimaryKey(String id);

    int updateByExampleSelective(TbPostDO record);

    int updateByExample(@Param("record") TbPostDO record, @Param("example") TbPostDOExample example);

    int updateByPrimaryKeySelective(TbPostDO record);

    int updateByPrimaryKey(TbPostDO record);
}