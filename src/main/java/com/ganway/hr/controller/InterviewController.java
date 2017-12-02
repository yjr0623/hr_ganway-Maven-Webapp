package com.ganway.hr.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.Paginator;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.form.InterviewForm;
import com.ganway.hr.form.InterviewPage;
import com.ganway.hr.service.ICandidateService;
import com.ganway.hr.service.IInterviewService;
import com.ganway.hr.service.IReasonService;
import com.ganway.hr.util.JsonUtils;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;
import com.ganway.hr.vo.TbInterview;
import com.ganway.hr.vo.TbReason;

@Controller
@RequestMapping("/interview")
public class InterviewController implements BasicConstants {

	private static final Logger logger = LoggerFactory
			.getLogger(InterviewController.class);

	@Resource
	private IInterviewService inserviewService;

	@Resource
	private IReasonService reasonService;

	@Resource
	private ICandidateService candidateService;
/**
	@ResponseBody
	@RequestMapping("/detail")
	public RespBody interviewDetail(String basicId) {
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		respBody.setData(JSON.toJSONString(reasonService
				.queryByBasicId(basicId)));
		return respBody;
	}
	*/
	
	/**
	@ResponseBody
	@RequestMapping("/save")
	public RespBody saveInterview(TbInterview interview) {
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		if (interview.getId() == null) {
			inserviewService.insertInterview(interview);
		} else {
			inserviewService.updateInterview(interview);
		}
		return respBody;
	}
	*/
	
	
	/**
	 * 移动简历接口
	 * @param TbReason
	 * @author YAO
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/saveReason",method=RequestMethod.POST)
	public RespBody saveReason(@RequestBody TbReason reason) {
		RespBody respBody = new RespBody();
		if(reason.getIds()==null || reason.getMoveTo()==null){
			respBody.setReturnCode(ReturnCode.MOVET_TO_FAILED.getCode());
			respBody.setReturnMessage(ReturnCode.MOVET_TO_FAILED.getMsg());
			respBody.setData("请检查参数是否正确:ids[] , moveTo ");
			return respBody;
		}
		
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		reasonService.save(reason);
		return respBody;
	}
	
	
	/**
	@ResponseBody
	@RequestMapping("/reasonList")
	public RespBody reasonDetail(String basicId) {
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		respBody.setData(JSON.toJSONString(reasonService.queryByBasicId(basicId)));
		return respBody;
	}

*/
	/**
	 * 面试列表查询接口
	 * @param SelectPara
	 * @author YAO
	 * @return
	 */
	@ResponseBody
	@RequestMapping("query")
	public RespBody queryBasicInterView( SelectPara para) {
		logger.debug("查询求职者信息:{}", para);
		para.setStatus("5");
		return inserviewService.queryBasic(para);
	}
	/**
	 * 人才库列表查询接口
	 * @param SelectPara
	 * @author YAO
	 * @return
	 */
	@ResponseBody
	@RequestMapping("queryRC")
	public RespBody queryBasicRC( SelectPara para) {
		logger.debug("查询求职者信息:{}", para);
		para.setStatus("3");
		return inserviewService.queryBasic(para);
	}
	/**
	 * 不合格库列表查询接口
	 * @param SelectPara
	 * @author YAO
	 * @return
	 */
	@ResponseBody
	@RequestMapping("queryBHG")
	public RespBody queryBasicBHG( SelectPara para) {
		logger.debug("查询求职者信息:{}", para);
		para.setStatus("2");
		return inserviewService.queryBasic(para);
	}
	
/**
	@RequestMapping("/find")
	@ResponseBody
	public RespBody find(InterviewForm form, HttpServletRequest request) {
		logger.debug("查找面试信息:{}", form);
		RespBody respBody = new RespBody();
		Map<String, Object> parameters = new HashMap<String, Object>();
		int pageNo = form.getPageNo() == null ? 1 : form.getPageNo();
		int pageSize = form.getPageSize() == null ? DEFAULT_PAGE_SIZE : form
				.getPageSize();

		String interviewDateStarStr = form.getInterviewDateStar();
		String interviewDateEndStr = form.getInterviewDateEnd();
		String dateOfBirthStarStr = form.getDateOfBirthStar();
		String dateOfBirthEndStr = form.getDateOfBirthEnd();
		parameters.put("name", form.getName());
		parameters.put("postApp", form.getPostApp());
		parameters.put("applicationArea", form.getApplicationArea());
		parameters.put("sex", form.getSex());
		parameters.put("marriage", form.getMarriage());
		try {
			Date interviewDateStar = null;
			Date interviewDateEnd = null;
			Date dateOfBirthStar = null;
			Date dateOfBirthEnd = null;
			if (StringUtils.isNotEmpty(interviewDateStarStr)) {
				Assert.hasText(interviewDateEndStr, "简历投递结束日期不能为空");
				interviewDateStar = DateUtils.parseDate(interviewDateStarStr,
						DateUtils.PATTERN_DATE);
				interviewDateEnd = DateUtils.parseDate(interviewDateEndStr,
						DateUtils.PATTERN_DATE);
			}
			if (StringUtils.isNotEmpty(dateOfBirthStarStr)) {
				Assert.hasText(dateOfBirthEndStr, "出生日期结束日期不能为空");
				dateOfBirthStar = DateUtils.parseDate(dateOfBirthStarStr,
						DateUtils.PATTERN_DATE);
				dateOfBirthEnd = DateUtils.parseDate(dateOfBirthEndStr,
						DateUtils.PATTERN_DATE);
			}
			parameters.put("dateOfBirthStar", dateOfBirthStar);
			parameters.put("dateOfBirthEnd", dateOfBirthEnd);
			parameters.put("interviewDateStar", interviewDateStar);
			parameters.put("interviewDateEnd", interviewDateEnd);
		} catch (ParseException e) {
			logger.error("参数校验失败.", e);
			respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
			respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()
					+ ":日期");
			return respBody;
		} catch (IllegalArgumentException e) {
			logger.error("参数校验失败.", e);
			respBody.setReturnCode(ReturnCode.INVALID_PARAMTER.getCode());
			respBody.setReturnMessage(ReturnCode.INVALID_PARAMTER.getMsg()
					+ ":" + e.getMessage());
			return respBody;
		}

		Paginator<InterviewPage> paginator = inserviewService.findByPage(
				pageSize, pageNo, parameters);
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		respBody.setData(JSON.toJSONString(paginator));
		return respBody;
	}
	
	*/

}
