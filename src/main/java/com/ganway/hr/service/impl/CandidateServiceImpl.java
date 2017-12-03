package com.ganway.hr.service.impl;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.json.Json;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.common.TypeInfoUtils;
import com.ganway.hr.dao.IBasicDao;
import com.ganway.hr.dao.ICandidateDao;
import com.ganway.hr.dao.ICompanyDao;
import com.ganway.hr.dao.IEducationDao;
import com.ganway.hr.dao.IFamilyDao;
import com.ganway.hr.dao.IInterviewDao;
import com.ganway.hr.dao.IReasonDao;
import com.ganway.hr.dao.InterviewInfoDao;
import com.ganway.hr.dao.TypeInfoDao;
import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.form.ExcelTB;
import com.ganway.hr.service.ICandidateService;
import com.ganway.hr.service.IInterviewService;
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
	private InterviewInfoDao interviewInfoDao;

	@Resource
	private IReasonDao reasonDao;
	
	@Resource
	private InterviewInfoDao interviewInfo;
	@Resource
	private TypeInfoDao typeInfoDao;
	@Resource
	private IInterviewService interviewService;

	
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
		respBody.setData(JSON.toJSONString(queryBasicByform(para)));
		respBody.setTotal(total);
		return respBody;
	}
	
	private List<Candidate> queryBasicByform(SelectPara para){
		
		List<Candidate> tbCandidateList = candidateDao.queryBasic(para);
		for(int i = 0;i<tbCandidateList.size();i++){
			tbCandidateList.get(i).setSex(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("sex",tbCandidateList.get(i).getSex())));
			tbCandidateList.get(i).setPost(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("post",tbCandidateList.get(i).getPost())));
			tbCandidateList.get(i).setMarriage(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("marriage",tbCandidateList.get(i).getMarriage())));
			tbCandidateList.get(i).setApplicationArea(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("applicationArea",tbCandidateList.get(i).getApplicationArea())));
			
			if ("1".equals(para.getStatus())){
			
			tbCandidateList.get(i).setTbCompanyList(companyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
			tbCandidateList.get(i).setTbEducationList(educationDao.queryByBasicId(tbCandidateList.get(i).getId())); 
			tbCandidateList.get(i).setTbFamilyList(familyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
			
			} else if ("5".equals(para.getStatus())) {

					tbCandidateList.get(i).setInterviewInfo(
							interviewInfoDao.queryByBasicId(tbCandidateList.get(i)
									.getId()));
				} else if ("3".equals(para.getStatus())
						|| "2".equals(para.getStatus())) {
					Map<String,String> map = new HashMap<String, String>();
					map.put("basicId", tbCandidateList.get(i).getId());
					map.put("moveTo", para.getStatus());
					tbCandidateList.get(i).setTbReasonList(reasonDao.queryByBasicIdAndMoveTo(map));
					tbCandidateList.get(i).setTbCompanyList(companyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
					tbCandidateList.get(i).setTbEducationList(educationDao.queryByBasicId(tbCandidateList.get(i).getId())); 
					tbCandidateList.get(i).setTbFamilyList(familyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
				}
			
		}
		return tbCandidateList;
		
		
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
	//设置标题栏
	private List<ExcelBean> getEB(String[] types,String[] infos){
		List<ExcelBean> excel=new ArrayList<>(); 
		for (int i = 0 ;i<types.length;i++){
			excel.add(new ExcelBean(infos[i],types[i],0));
		}
		return excel;
	}
	
	private List<ExcelTB> getExcelTBs(List<Candidate> list){
		List<ExcelTB> tblist = new ArrayList<ExcelTB>();
		for(Candidate c :list){
			
			
			ExcelTB tb = new ExcelTB();
			BeanUtils.copyProperties(c, tb);
			if(c.getInterviewInfo()!=null){
				BeanUtils.copyProperties(c.getInterviewInfo(),tb);
				tb.setInterviewdate( DateUtils.format(c.getInterviewInfo().getInterviewdate(),
					"yyyy/MM/dd"));
			}
			tb.setDate_of_birth( DateUtils.format(c.getDate_of_birth(),
					"yyyy/MM/dd"));
			tb.setCreated_date( DateUtils.format(c.getCreated_date(),
					"yyyy/MM/dd"));
			
			tblist.add(tb);
		}
		
		return tblist;
	}
	@Override
	public XSSFWorkbook exportExcelInfo(SelectPara para) {
		int start = para.getPageNo()==null?1:para.getPageNo();
		int pageSize = para.getPageSize()==null?20:para.getPageSize();
		para.setStart((start-1)*pageSize);
		para.setPageSize(pageSize);
			para.setBirthStart(format(para.getBirthStart()));
			para.setBirthEnd(format(para.getBirthEnd()));
			para.setCreateStart(format(para.getCreateStart()));
			para.setCreateEnd(format(para.getCreateEnd()));
		
		
		List<ExcelTB> list = getExcelTBs(queryBasicByform(para));
		List<ExcelBean> excel=new ArrayList<>(); 
		String sheetName ="";
		if (BasicConstants.candidate.equals(para.getStatus())){
			 excel=getEB(BasicConstants.candidateType,BasicConstants.candidateInfo);
			 sheetName="简历管理导出";
		}else if (BasicConstants.interview.equals(para.getStatus())){
			 excel=getEB(BasicConstants.interviewType,BasicConstants.interviewInfo);
			 sheetName="面试管理导出";
		}else if (BasicConstants.BHG.equals(para.getStatus())){
			 excel=getEB(BasicConstants.BHGType,BasicConstants.BHGInfo);
			 sheetName="不合格库导出";
		}else if (BasicConstants.RC.equals(para.getStatus())){
			 excel=getEB(BasicConstants.RCType,BasicConstants.RCInfo);
			 sheetName="人才库导出";
		}
	    Map<Integer,List<ExcelBean>> map=new LinkedHashMap<>();  
	    XSSFWorkbook xssfWorkbook=null;  
	    //设置标题栏  
	    map.put(0, excel); 
	    try {
			xssfWorkbook = ExportExcelUtils.createExcelFile(ExcelTB.class, list, map, sheetName);
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
