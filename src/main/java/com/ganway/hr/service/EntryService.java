package com.ganway.hr.service;

import com.ganway.hr.vo.ContractDO;
import com.ganway.hr.vo.TbPostDO;
import com.ganway.hr.vo.TbBasic;
import com.ganway.hr.vo.TbTypeInfo;

import java.util.List;

/**
 * 名称:EntryService
 * 描述:${TODO}
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 13:49
 */
public interface EntryService {

  public TbBasic findById(String id);

  /**
   * 查找职工
   * @param employeeCode
   * @return
   */
  public TbBasic findByEmployee(String employeeCode);

  /**
   * 创建合同
   * @param contract
   * @return
   */
  public boolean createContract(ContractDO contract);

  /**
   * 查找合同
   * @param contractId
   * @return
   */
  public ContractDO findContract(String contractId);

  /**
   * 查找合同
   * @param employeeCode
   * @return
   */
  public List<ContractDO> findGroupContract(String employeeCode);

  /**
   * 逻辑删除合同
   * @param contractId
   * @param newDeleted
   * @param oldDeleted
   * @return
   */
  public boolean removeConstract(String contractId, String newDeleted, String oldDeleted);

  /**
   * 创建薪酬信息
   * @param post
   * @return
   */
  public boolean createSalary(TbPostDO post);

  /**
   * 更新薪酬信息
   * @param post
   * @return
   */
  public boolean updateSalary(String id,TbPostDO post);

  /**
   * 查找预录用员工信息
   * @param id
   * @return
   */
  public TbPostDO findByID(String id);

  /**
   * 创建预录用员工信息
   * @param post
   * @return
   */
  public boolean createPost(TbPostDO post);
  
  public void updateContract(ContractDO contract);

  public String getUploadPath(String type_id);
}
