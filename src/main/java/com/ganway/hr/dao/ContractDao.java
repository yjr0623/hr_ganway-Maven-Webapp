package com.ganway.hr.dao;

import com.ganway.hr.vo.ContractDO;
import com.ganway.hr.vo.ContractDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractDao {
    long countByExample(ContractDOExample example);

    int deleteByExample(ContractDOExample example);

    int deleteByPrimaryKey(Long treatyid);

    int insert(ContractDO record);

    int insertSelective(ContractDO record);

    List<ContractDO> selectByExample(ContractDOExample example);

    ContractDO selectByPrimaryKey(Long treatyid);

    int updateByExampleSelective(@Param("record") ContractDO record, @Param("example") ContractDOExample example);

    int updateByExample(@Param("record") ContractDO record, @Param("example") ContractDOExample example);

    int updateByPrimaryKeySelective(ContractDO record);

    int updateByPrimaryKey(ContractDO record);
}