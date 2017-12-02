package com.ganway.hr.controller;

import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.RegValidator;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.vo.TbPostDO;
import com.ganway.hr.form.EntryInfoForm;
import com.ganway.hr.service.EntryService;
import com.ganway.hr.vo.TbBasic;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
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
 * 名称:EntryController
 * 描述:入职
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 22:28
 */
@RestController
@RequestMapping("/entry/")
public class EntryController implements BasicConstants{

  private static final Logger logger = LoggerFactory.getLogger(EntryController.class);

  @Resource
  private EntryService      entryService;

  /**
   * 创建入职申请信息
   * @param form
   * @param request
   * @return
   */
  @RequestMapping("apply")
  @ResponseBody
  public RespBody apply(@RequestBody EntryInfoForm form, HttpServletRequest request){
    logger.debug("创建入职申请信息:{}",form);
    RespBody respBody = new RespBody();
    try{
      Assert.notNull(form,"请求不能为空");
      Assert.hasText(form.getId(),"应聘编号不能为空");
      TbBasic basic = entryService.findById(form.getId());
      Assert.notNull(basic,"应聘编号不存在");
      Assert.hasText(form.getName(),"姓名不能为空");
      Assert.hasText(form.getEmployeecode(),"职工代码不能为空");
      Assert.hasText(form.getMobile(),"手机号不能为空");
      Assert.hasText(form.getDeptId(),"部门不能为空");
      Assert.hasText(form.getJobId(),"职位不能为空");
      Assert.hasText(form.getJobOrgId(),"岗位不能为空");
      Assert.hasText(form.getWorkSystemId(),"工作制类型不能为空");
      Assert.hasText(form.getIdNum(),"身份证号不能为空");
      Assert.hasText(form.getDateOfBrith(),"生日不能为空");
      Assert.hasText(form.getJobState(),"在职状态不能为空");
      Assert.hasText(form.getEntryDate(),"入职时间不能为空");
      Assert.notNull(form.getProPeriod(),"试用期不能为空");
      Assert.isTrue(RegValidator.isMobile(form.getMobile()),"手机号格式不正确");
      if(StringUtils.isNotEmpty(form.getEmail())) {
        Assert.isTrue(RegValidator.isEmail(form.getEmail()),"邮件格式不正确");
      }
      Assert.hasText(form.getRequireSettlement(),"请选择是否需要结算");
      Assert.hasText(form.getSex(),"请选择性别");
      Assert.hasText(form.getRequireAttendance(),"请选择是否需要考勤");
      Date birthday = DateUtils.parseDate(form.getDateOfBrith(),DateUtils.PATTERN_DATE);
      Date entryDate = DateUtils.parseDate(form.getEntryDate(),DateUtils.PATTERN_DATE);
      Date formalDate = DateUtils.parseDate(form.getFormalDate(),DateUtils.PATTERN_DATE);
      Date quitDate = DateUtils.parseDate(form.getQuitDate(),DateUtils.PATTERN_DATE);
      TbPostDO post = new TbPostDO();
      BeanUtils.copyProperties(form,post);
      post.setDate_of_birth(birthday);
      post.setEntryDate(entryDate);
      post.setFormalDate(formalDate);
      post.setQuitDate(quitDate);
      post.setCreatedDate(new Date());
      post.setLastModifiedDate(new Date());
      if(!entryService.createPost(post)){
        logger.error("创建入职申请信息失败,{}",post.getEmployeecode());
        respBody.setReturnCode(ReturnCode.ENTRY_ADD_FAILED.getCode());
        respBody.setReturnMessage(ReturnCode.ENTRY_ADD_FAILED.getMsg());
        return respBody;
      }

    } catch (ParseException e) {
      logger.error("参数校验失败.",e);
      respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
      respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()+":日期");
      return respBody;
    }catch (IllegalArgumentException e){
      logger.error("参数校验失败.",e);
      respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
      respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()+":"+e.getMessage());
      return respBody;
    }catch (DuplicateKeyException e){
      logger.error("创建入职申请信息已存在.",e);
      respBody.setReturnCode(ReturnCode.CONTRACT_EXISTED.getCode());
      respBody.setReturnMessage(ReturnCode.CONTRACT_EXISTED.getMsg());
      return respBody;
    }catch (Exception e){
      logger.error("创建入职申请信息异常.",e);
      respBody.setReturnCode(ReturnCode.FAILED.getCode());
      respBody.setReturnMessage(ReturnCode.FAILED.getMsg());
      return respBody;
    }
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    return respBody;
  }

}
