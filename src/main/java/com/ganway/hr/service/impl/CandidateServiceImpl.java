package com.ganway.hr.service.impl;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.json.Json;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.dao.IBasicDao;
import com.ganway.hr.dao.ICandidateDao;
import com.ganway.hr.dao.ICompanyDao;
import com.ganway.hr.dao.IEducationDao;
import com.ganway.hr.dao.IFamilyDao;
import com.ganway.hr.dao.IInterviewDao;
import com.ganway.hr.dao.InterviewInfoDao;
import com.ganway.hr.dao.TypeInfoDao;
import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.service.ICandidateService;
import com.ganway.hr.util.ExportExcelUtils;
import com.ganway.hr.util.JsonUtils;
import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.ExcelBean;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;
import com.ganway.hr.vo.TbCompany;
import com.ganway.hr.vo.TbEducation;
import com.ganway.hr.vo.TbFamily;

@Service("candidateService")
public class CandidateServiceImpl implements ICandidateService {
	@Resource
	private IBasicDao basicDao;
	@Resource
	private ICompanyDao companyDao;
	@Resource
	private IEducationDao educationDao;
	@Resource
	private IFamilyDao familyDao;
	@Resource
	private ICandidateDao candidateDao;
	
	@Resource
	private InterviewInfoDao interviewInfo;
	@Resource
	private TypeInfoDao typeInfoDao;

	
	@Override
	public void addCandidate(Candidate candidate) {
		String num=candidate.getNum();
		TbBasic tb = basicDao.findTbBasicByNum(num);
		
		if(tb == null){
			insertCandidate(candidate);
		}else{
			//updateCandidate(candidate,tb.getId());
		}
		
			
		
//		candidateDao.insertCandidateBasic(candidate);
//		candidateDao.insertCandidateFamily(candidate);
//		candidateDao.insertCandidateEducation(candidate);
//		candidateDao.insertCandidateCompany(candidate);
		
	}
	/**
	private void updateCandidate(Candidate candidate,String id){
		candidate.setId(id);
		for(TbCompany company :candidate.getTbCompanyList()){
			company.setBasicId(id);
		companyDao.updateByPrimaryKey(company);
		}
		for(TbEducation education:candidate.getTbEducationList()){
			education.setBasicId(id);
		educationDao.updateByPrimaryKey(education);
			
		}
		for(TbFamily family:candidate.getTbFamilyList()){
			family.setBasicId(id);
		familyDao.updateByPrimaryKey(family);
		}
		
	}
	*/
	private void insertCandidate(Candidate candidate){
		String id = UUID.randomUUID().toString().replace("-", "").toUpperCase();
    	candidate.setId(id);
    	candidateDao.insertCandidateBasic(candidate);
		for(TbCompany company :candidate.getTbCompanyList()){
			//company.setBasicId(id);
			company.setBasicId(id);
		companyDao.insertCompany(company);
		}
		for(TbEducation education:candidate.getTbEducationList()){
			//education.setId(id);
			education.setBasicId(id);
		educationDao.insertEducation(education);
			
		}
		for(TbFamily family:candidate.getTbFamilyList()){
			//family.setId(id);
			family.setBasicId(id);
		familyDao.insertFamily(family);
		}
	}
	





	


	@Override
	public void addCandidateAllInfo(Candidate CandidateAllInfo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Candidate getCandidateById(int candidateId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Candidate> getAllCandidate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 时间戳转换为日期
	 * @param s
	 * @return
	 */
	private String format(String s){
		if(s == null){
			return null;
		}
		SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
		Long time=new Long(s);
		return format.format(time);
	}
	
	/**
	 * 查询求职者列表及详情
	 */
	@Override
	public RespBody queryBasic(SelectPara para) {
		int start = para.getPageNo()==null?1:para.getPageNo();
		int pageSize = para.getPageSize()==null?20:para.getPageSize();
		para.setStart((start-1)*pageSize);
		para.setPageSize(pageSize);
		
			para.setBirthStart(format(para.getBirthStart()));
			para.setBirthEnd(format(para.getBirthEnd()));
			para.setCreateStart(format(para.getCreateStart()));
			para.setCreateEnd(format(para.getCreateEnd()));
		int total = candidateDao.countBasic(para);
		
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
//		if(para.getBirthStart() != null){
//		para.setBirthStart(DateUtils.parseDate(para.getBirthStart(),
//					DateUtils.PATTERN_DATE););
//		 DateUtils.parseDate(para.getBirthStart(),
//					DateUtils.PATTERN_DATE);

		
		
		List<Candidate> tbCandidateList = candidateDao.queryBasic(para);
		for(int i = 0;i<tbCandidateList.size();i++){
			tbCandidateList.get(i).setTbCompanyList(companyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
			tbCandidateList.get(i).setTbEducationList(educationDao.queryByBasicId(tbCandidateList.get(i).getId())); 
			tbCandidateList.get(i).setTbFamilyList(familyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
		}
		respBody.setData(JSON.toJSONString(tbCandidateList));
		respBody.setTotal(total);
		return respBody;
	}
	@Override
	public Candidate queryByBasicId(String basicId) {
		Candidate candidate = candidateDao.queryByBasicId(basicId);
		
		if(candidate != null) {
			candidate.setTbCompanyList(companyDao.queryByBasicId(basicId));
			candidate.setTbEducationList(educationDao.queryByBasicId(basicId));
			candidate.setTbFamilyList(familyDao.queryByBasicId(basicId));
		}
		return candidate;
	}
	@Override
	public XSSFWorkbook exportExcelInfo(SelectPara para , String parma) {
		List list = new ArrayList<>();
		if (parma.equals(BasicConstants.candidate)){
			 list = candidateDao.queryBasic(para);
		}else {
			
		}
		List<ExcelBean> excel=new ArrayList<>();  
	    Map<Integer,List<ExcelBean>> map=new LinkedHashMap<>();  
	    XSSFWorkbook xssfWorkbook=null;  
	    //设置标题栏  
	    excel.add(new ExcelBean("姓名","name",0));  
	    excel.add(new ExcelBean("性别","sex",0));  
	    excel.add(new ExcelBean("应聘岗位","post",0));  
	    excel.add(new ExcelBean("出生日期","date_of_birth",0));  
	    excel.add(new ExcelBean("联系电话","phone",0));  
	    excel.add(new ExcelBean("婚姻状况","marriage",0)); 
	    excel.add(new ExcelBean("简历投递时间","created_date",0)); 
	    map.put(0, excel); 
	    String sheetName = "简历管理导出";
	    try {
			xssfWorkbook = ExportExcelUtils.createExcelFile(TbBasic.class, list, map, sheetName);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}  
	    return xssfWorkbook;  
	}
	@Override
	public int countBasic(SelectPara para) {
		return candidateDao.countBasic(para);
	}
	
	/**
	 * 插入面试信息
	 */
	@Override
	public void applyIntervers(ApplyForm form) {
		for (String id : form.getIds()){
			Map<String,String> map = new HashMap<String, String>();
			map.put("id",id);
			map.put("status", form.getStatus());
			basicDao.updateBasicByIdAndStatus(map);
			form.setId(id);
			interviewInfo.insertInterviewInfo(form);
			//interviewDao.updateInterview(interview);
		}
	}
	@Override
	public RespBody getTypeInfo(String type_id) {
		RespBody respBody = new RespBody();
		if(type_id == null){
			respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
			respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg());
			return respBody;
		}
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		respBody.setData(JSON.toJSONString(typeInfoDao.getByTpyeId(type_id)));
		return respBody;
	}
	
	


	

}
