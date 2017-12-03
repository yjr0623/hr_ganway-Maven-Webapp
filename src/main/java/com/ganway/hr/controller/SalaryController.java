package com.ganway.hr.controller;

import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.vo.TbPostDO;
import com.ganway.hr.form.SalaryInfoForm;
import com.ganway.hr.service.BasicService;
import com.ganway.hr.service.EntryService;
import com.ganway.hr.vo.TbBasic;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 名称:SalaryController
 * 描述:薪酬管理
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 22:28
 */
@RestController
@RequestMapping("/salary/")
public class SalaryController implements BasicConstants{

  private static final Logger logger = LoggerFactory.getLogger(SalaryController.class);

  @Resource
  private BasicService    basicService;

  @Resource
  private EntryService    entryService;

  /**
   * 创建薪酬信息
   * @param form
   * @param request
   * @return
   */
  @RequestMapping("apply")
  @ResponseBody
  public RespBody apply(@RequestBody SalaryInfoForm form, HttpServletRequest request){
    logger.debug("创建薪酬信息:{}",form);
    RespBody respBody = new RespBody();
    try{
      TbPostDO post = new TbPostDO();
      Assert.notNull(form,"薪酬信息不能为空");
      Assert.hasText(form.getBasicId(),"应聘编号不能为空");
      Assert.hasText(form.getEmployeecode(),"职工编号不能为空");
      Assert.hasText(form.getPost(),"职位等级不能为空");
      Assert.hasText(form.getPosttype(),"职位类型不能为空");
      Assert.hasText(form.getSalaryId(),"基本工资档位不能为空");
      Assert.hasText(form.getPerfId(),"绩效档位不能为空");
      Assert.notNull(form.getDiscount(),"试用打折率不能为空");
      BeanUtils.copyProperties(form,post);
      if(!entryService.updateSalary(form.getBasicId(),post)){
        logger.error("添加薪酬失败,{}",post.getEmployeecode());
        respBody.setReturnCode(ReturnCode.SALARY_ADD_FAILED.getCode());
        respBody.setReturnMessage(ReturnCode.SALARY_ADD_FAILED.getMsg());
        return respBody;
      }
    }catch (IllegalArgumentException e){
      logger.error("参数校验失败.",e);
      respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
      respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()+":"+e.getMessage());
      return respBody;
    }catch (DuplicateKeyException e){
      logger.error("添加薪酬信息已存在.",e);
      respBody.setReturnCode(ReturnCode.CONTRACT_EXISTED.getCode());
      respBody.setReturnMessage(ReturnCode.CONTRACT_EXISTED.getMsg());
      return respBody;
    }catch (Exception e){
      logger.error("添加薪酬信息异常.",e);
      respBody.setReturnCode(ReturnCode.FAILED.getCode());
      respBody.setReturnMessage(ReturnCode.FAILED.getMsg());
      return respBody;
    }
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
    return respBody;
  }

}
