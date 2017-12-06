package com.ganway.hr.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.Paginator;
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
import com.ganway.hr.vo.InterviewInfoDO;
import com.ganway.hr.form.InterviewPage;
import com.ganway.hr.service.IInterviewService;
import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;
import com.ganway.hr.vo.TbInterview;

@Service("interviewService")
public class InterviewServiceImpl implements IInterviewService {

	@Resource
	private IInterviewDao interviewDao;

	@Resource
	private IBasicDao basicDao;

	@Resource
	private InterviewInfoDao interviewInfoDao;

	@Resource
	private ICandidateDao candidateDao;
	@Resource
	private IReasonDao reasonDao;
	@Resource
	private ICompanyDao companyDao;
	@Resource
	private IEducationDao educationDao;
	@Resource
	private IFamilyDao familyDao;
	@Resource
	private TypeInfoDao typeInfoDao;
	/**
	 * 时间戳转换为日期
	 * 
	 * @param s
	 * @return
	 */
	private String format(String s) {
		if (s == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Long time = new Long(s);
		return format.format(time);
	}

	@Override
	public RespBody queryBasic(SelectPara para) {
		int start = para.getPageNo() == null ? 1 : para.getPageNo();
		int pageSize = para.getPageSize() == null ? 20 : para.getPageSize();
		para.setStart((start - 1) * pageSize);
		para.setPageSize(pageSize);
		para.setName(TypeInfoUtils.formatMH(para.getName()));
		para.setBirthStart(format(para.getBirthStart()));
		para.setBirthEnd(format(para.getBirthEnd()));
		para.setCreateStart(format(para.getCreateStart()));
		para.setCreateEnd(format(para.getCreateEnd()));
		int total = candidateDao.countBasic(para);

		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());

		
		respBody.setData(JSON.toJSONString( queryBasicByform(para)));
		respBody.setTotal(total);
		return respBody;
	}
	
	
	private List<Candidate> queryBasicByform(SelectPara para){
		
		List<Candidate> tbCandidateList = candidateDao.queryBasic(para);
		for (int i = 0; i < tbCandidateList.size(); i++) {
			tbCandidateList.get(i).setSex(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("sex",tbCandidateList.get(i).getSex())));
			tbCandidateList.get(i).setPost(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("post",tbCandidateList.get(i).getPost())));
			tbCandidateList.get(i).setMarriage(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("marriage",tbCandidateList.get(i).getMarriage())));
			tbCandidateList.get(i).setApplicationArea(typeInfoDao.getInfoByMap(TypeInfoUtils.getMap("applicationArea",tbCandidateList.get(i).getApplicationArea())));
//			if ("5".equals(para.getStatus())) {

//				tbCandidateList.get(i).setInterviewInfo(
//						interviewInfoDao.queryByBasicId(tbCandidateList.get(i)
//								.getId()));
//			} else if ("3".equals(para.getStatus())
//					|| "2".equals(para.getStatus())) {
				tbCandidateList.get(i).setInterviewInfo(
						interviewInfoDao.queryByBasicId(tbCandidateList.get(i)
								.getId()));
				Map<String,String> map = new HashMap<String, String>();
				map.put("basicId", tbCandidateList.get(i).getId());
				map.put("moveTo", para.getStatus());
				tbCandidateList.get(i).setTbReasonList(reasonDao.queryByBasicIdAndMoveTo(map));
				tbCandidateList.get(i).setTbCompanyList(companyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
				tbCandidateList.get(i).setTbEducationList(educationDao.queryByBasicId(tbCandidateList.get(i).getId())); 
				tbCandidateList.get(i).setTbFamilyList(familyDao.queryByBasicId(tbCandidateList.get(i).getId())); 
//			}
		}
		return tbCandidateList;
		
	}

	@Override
	public void insertInterview(TbInterview interview) {
		String basicIds = interview.getBasicId();
		if (!basicIds.isEmpty()) {
			String[] basicArr = basicIds.split(",");
			for (int i = 0; i < basicArr.length; i++) {
				// interview.setId(UUID.randomUUID().toString().replace("-",
				// "").toUpperCase());
				interview.setBasicId(basicArr[i]);
				interviewDao.insertInterview(interview);
			}
		}

	}

	@Override
	public TbInterview getByPrimaryKey(String id) {
		TbInterview interview = interviewDao.selectByPrimaryKey(id);
		Candidate candidate = candidateDao.queryByBasicId(interview
				.getBasicId());
		interview.setName(candidate.getName());
		interview.setSex(candidate.getSex());
		interview.setBasicSalary(candidate.getExp_salary());
		return interview;
	}

	@Override
	public void updateInterview(TbInterview interview) {
		interviewDao.updateInterview(interview);
	}
	

	@Override
	public RespBody getInterviewer(String interviewer) {
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		respBody.setData(JSON.toJSONString(typeInfoDao.getInterviewer(TypeInfoUtils.formatMH(interviewer))));
		return respBody;
		
	}
	
	public List<TbBasic> findByPara(SelectPara para) {
		// int pageNo = para.getPageNo()==null?1:para.getPageNo();
		// int pageSize = para.getPageSize()==null?20:para.getPageSize();
		// para.setStart((pageNo-1)*pageSize);
		// List<TbBasic> uList = basicDao.queryBasic(para);
		//
		// for(TbBasic basic : uList) {
		// TbInterview interView = interviewDao.selectByBasicId(basic.getId());
		// if(interView == null) {
		// basic.setIsInterview("0");
		// } else {
		// basic.setIsInterview("1");
		// }
		// }
		return null;
	}

	@Override
	public Paginator<InterviewPage> findByPage(int pageSize, int pageNo,
			Map<String, Object> parameter) {
		parameter.put("offset", (pageNo - 1) * pageSize);
		parameter.put("pageSize", pageSize);

		Integer totalCount = basicDao.countByExample(parameter);
		List<TbBasic> listPage = basicDao.findByPage(parameter);
		List<InterviewPage> resultList = new ArrayList<>(listPage.size());
		for (TbBasic basic : listPage) {
			InterviewInfoDO info = interviewInfoDao.selectByPrimaryKey(basic
					.getId());
			if (info != null) {
				String d = DateUtils.format(basic.getDate_of_birth(),
						"yyyy-MM-dd");
				InterviewPage page = new InterviewPage();
				BeanUtils.copyProperties(basic, page);
				BeanUtils.copyProperties(info, page);
				System.out.println(page.getDate_of_birth());

				// page.setDate_of_birth(DateUtils.format(page.getDate_of_birth(),
				// "yyyy-MM-dd"));
				if (basic.getDate_of_birth() != null) {
					// page.setDate_of_birth(d);
				}
				resultList.add(page);
			}
		}

		Paginator<InterviewPage> pqr = new Paginator<InterviewPage>();
		pqr.setList(resultList);
		pqr.setPageNo(pageNo);
		pqr.setPageSize(pageSize);
		pqr.setTotalCount(totalCount);
		return pqr;
	}

}
