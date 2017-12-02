package com.ganway.hr.controller;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.vo.ContractDO;
import com.ganway.hr.form.ContractInfoForm;
import com.ganway.hr.service.BasicService;
import com.ganway.hr.service.EntryService;
import com.ganway.hr.vo.TbBasic;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 名称:ContractController
 * 描述:合同管理
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 22:28
 */
@RestController
@RequestMapping("/contract/")
public class ContractController implements BasicConstants{

  private static final Logger logger = LoggerFactory.getLogger(ContractController.class);

  @Resource
  private BasicService    basicService;

  @Resource
  private EntryService    entryService;

  @Value("upload.dir")
  private String          uploadDir;
  
  @ResponseBody
  @RequestMapping(value="fileUpload", method = RequestMethod.POST)
  public RespBody  springUpload(HttpServletRequest request) throws IllegalStateException, IOException
  {
	  String path = "";
       //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
      CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
              request.getSession().getServletContext());
      //检查form中是否有enctype="multipart/form-data"
      if(multipartResolver.isMultipart(request))
      {
          //将request变成多部分request
          MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
         //获取multiRequest 中所有的文件名
          Iterator iter=multiRequest.getFileNames();
           
          while(iter.hasNext())
          {
              //一次遍历所有文件
              MultipartFile file=multiRequest.getFile(iter.next().toString());
              if(file!=null)
              {
                   path="/usr/yaojr/fileUpload"+file.getOriginalFilename();
                  //上传
                  file.transferTo(new File(path));
              }
               
          }
         
      }
      logger.debug("文件上传路径 : ",path);
      
      RespBody respBody = new RespBody();
      respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
      respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
      respBody.setData(path);
      return respBody;
  }
  

  
  

  /**
   * 创建合同信息
   * @param form
   * @param request
   * @return
   */
  @RequestMapping(value = "apply", method = RequestMethod.POST)
  @ResponseBody
  public RespBody apply(HttpServletRequest request,@RequestBody ContractInfoForm form){
    logger.debug("创建合同信息:{}",form);
    RespBody respBody = new RespBody();
    try{
      ContractDO contract = new ContractDO();
      Assert.notNull(form,"合同信息不能为空");
      Assert.hasText(form.getId(),"应聘编号不能为空");
      Assert.hasText(form.getEmployeecode(),"职工编号不能为空");
      Assert.hasText(form.getNewtreatytype(),"创建合同方式不能为空");
      Assert.hasText(form.getTreatytype(),"合同类型不能为空");
      Assert.hasText(form.getTreatydate(),"合同签订日不能为空");
      Assert.hasText(form.getTreatybegin(),"合同起始日不能为空");
      Assert.hasText(form.getTreatyend(),"合同终止日不能为空");
      Assert.hasText(form.getTreatylast(),"合同年限不能为空");
      Assert.notNull(entryService.findByEmployee(form.getEmployeecode()),"职工不存在"+form.getEmployeecode());
      
      TbBasic basic = basicService.load(form.getId());
      Assert.notNull(basic,"应聘信息不存在");
      Date treatyDate = DateUtils.parseDate(form.getTreatydate(), DateUtils.PATTERN_DATE);
      Date treatyBegin = DateUtils.parseDate(form.getTreatybegin(), DateUtils.PATTERN_DATE);
      Date treatyEnd = DateUtils.parseDate(form.getTreatyend(), DateUtils.PATTERN_DATE);
      contract.setNewtreatytype(form.getNewtreatytype());
      contract.setRemark(form.getRemark());
      contract.setTreatybegin(treatyBegin);
      contract.setTreatydate(treatyDate);
      contract.setTreatyend(treatyEnd);
      contract.setTreatylast(Long.parseLong(form.getTreatylast()));
      contract.setTreatytype(form.getTreatytype());
      contract.setPostId(form.getId());
      contract.setEmployeecode(Long.parseLong(form.getEmployeecode()));
      if(request instanceof MultipartHttpServletRequest){
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        String targetPath = this.uploadDir+"/"+form.getId()+"/";
        Iterator<String> iter = req.getFileNames();
        while(iter.hasNext()){
          MultipartFile file = req.getFile(iter.next());
          String fileName = file.getOriginalFilename();
          File targetFile = new File(targetPath, fileName);
          if(!targetFile.exists()){
            targetFile.mkdirs();
          }
          try {
            file.transferTo(targetFile);
          }catch (IOException e){
            respBody.setReturnCode(ReturnCode.FAILED.getCode());
            respBody.setReturnMessage(ReturnCode.FAILED.getMsg()+":合同保存失败");
            return respBody;
          }
          contract.setPath(targetFile.getPath());
        }
      }
      if(!entryService.createContract(contract)){
        logger.error("添加合同失败,{}",contract.getEmployeecode());
        respBody.setReturnCode(ReturnCode.CONTRACT_ADD_FAILED.getCode());
        respBody.setReturnMessage(ReturnCode.CONTRACT_ADD_FAILED.getMsg());
        return respBody;
      }
    } catch (ParseException e) {
      logger.error("参数校验失败.",e);
      respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
      respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()+":日期");
      return respBody;
    } catch (IllegalArgumentException e) {
      logger.error("参数校验失败.",e);
      respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
      respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()+":"+e.getMessage());
      return respBody;
    }catch (DuplicateKeyException e){
      logger.error("添加合同重复.",e);
      respBody.setReturnCode(ReturnCode.CONTRACT_EXISTED.getCode());
      respBody.setReturnMessage(ReturnCode.CONTRACT_EXISTED.getMsg());
      return respBody;
    }catch (Exception e){
      logger.error("添加合同信息异常.",e);
      respBody.setReturnCode(ReturnCode.FAILED.getCode());
      respBody.setReturnMessage(ReturnCode.FAILED.getMsg());
      return respBody;
    }
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    return respBody;
  }

  /**
   * 查找合同信息
   * @param employeecode 职工编号
   * @param request
   * @return
   */
  @RequestMapping("find")
  @ResponseBody
  public RespBody find(long contractId,HttpServletRequest request){
    logger.debug("查找合同信息:{}",contractId);
    RespBody respBody = new RespBody();
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
    respBody.setData(JSON.toJSONString(entryService.findContract(contractId)));
    return respBody;
  }

  /**
   * 查找合同信息
   * @param employeecode 职工编号
   * @param request
   * @return
   */
  @RequestMapping("findGroup")
  @ResponseBody
  public RespBody findGroup(String employeecode,HttpServletRequest request){
    logger.debug("查找合同信息:{}",employeecode);
    RespBody respBody = new RespBody();
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
    respBody.setData(JSON.toJSONString(entryService.findGroupContract(employeecode)));
    return respBody;
  }

  /**
   * 删除合同
   * @param contractId 职工编号
   * @param request
   * @return
   */
  @RequestMapping("remove")
  @ResponseBody
  public RespBody remove(long contractId, String newDeleted, String oldDeleted,HttpServletRequest request){
    logger.debug("删除合同:{}",contractId);
    RespBody respBody = new RespBody();
    respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
    respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
    respBody.setData(JSON.toJSONString(entryService.removeConstract(contractId,newDeleted,oldDeleted)));
    return respBody;
  }


}
