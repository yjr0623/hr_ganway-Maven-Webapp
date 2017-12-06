package com.ganway.hr.controller;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ganway.hr.common.BasicConstants;
import com.ganway.hr.common.DateUtils;
import com.ganway.hr.common.RespBody;
import com.ganway.hr.common.ReturnCode;
import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.form.ContractInfoForm;
import com.ganway.hr.service.ICandidateService;
import com.ganway.hr.util.JsonUtils;
import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.SelectPara;

@Controller
@RequestMapping("/candidate/")
public class CandidateController implements BasicConstants {
	private static final Logger logger = LoggerFactory
			.getLogger(CandidateController.class);
	@Resource
	private ICandidateService candidateService;

	
	
	/**
	 * 下拉框列表
	 * @param type_id
	 * @return
	 */
	@RequestMapping("getTypeInfo")
	@ResponseBody
	public RespBody getTypeInfo(String type_id) {
		return candidateService.getTypeInfo(type_id);
	}

	/**
	 * 添加简历接口
	 * 
	 * @param Candidate
	 * @author YAO
	 * @return
	 */
	@RequestMapping(value="addCandidate",method=RequestMethod.POST)
	@ResponseBody
	public RespBody addCandidate(@RequestBody Candidate candidate) {
		logger.debug("新增求职者信息:{}", candidate);
		RespBody respBody = new RespBody();
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		candidateService.addCandidate(candidate);
		return respBody;
	}

	/**
	 * 创建面试接口
	 * @param ApplyForm
	 * @author YAO
	 * @return
	 */
	@RequestMapping(value = "apply", method = RequestMethod.POST)
	@ResponseBody
	public RespBody apply(@RequestBody ApplyForm form) {
		logger.debug("新增面试者:{}", candidate);
		RespBody respBody = new RespBody();
		if (form.getIds() == null) {
			respBody.setReturnCode(ReturnCode.INTERVIEW_ADD_FAILED.getCode());
			respBody.setReturnMessage(ReturnCode.INTERVIEW_ADD_FAILED.getMsg());
			respBody.setData("请选择至少一份简历");
			return respBody;
		}
		respBody.setReturnCode(ReturnCode.SUCCESS.getCode());
		respBody.setReturnMessage(ReturnCode.SUCCESS.getMsg());
		form.setStatus("5");
		candidateService.applyIntervers(form);

		return respBody;

	}
	/**
	 * 面试列表接口
	 * @param SelectPara
	 * @author YAO
	 * @return
	 */
	@ResponseBody
	@RequestMapping("query")
	public RespBody queryCandidate(SelectPara para) {
		logger.debug("查询求职者信息:{}", para);
		return candidateService.queryBasic(para);
	}

	/**
	 * @ResponseBody
	 * @RequestMapping("detail") public RespBody queryByBasicId(String basicId)
	 *                           { //Candidate candidate =
	 *                           candidateService.queryByBasicId(basicId);
	 *                           RespBody respBody = new RespBody();
	 *                           respBody.setReturnCode
	 *                           (ReturnCode.SUCCESS.getCode());
	 *                           respBody.setReturnMessage
	 *                           (ReturnCode.SUCCESS.getMsg());
	 *                           respBody.setData("此接口已作废,详情在查询列表(query)时已返回.");
	 *                           return respBody; }
	 */
	
	
	/**
	 * 列表导出
	 * @param para
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException 
	 */
	@ResponseBody
	@RequestMapping("export")
	public void export(SelectPara para, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		
		
		
		response.reset(); // 清除buffer缓存
		XSSFWorkbook workbook = null;
		// 导出Excel对象
		workbook = candidateService.exportExcelInfo(para);
		String  name = workbook.getSheetAt(0).getSheetName();
		// 指定下载的文件名
		
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String( name.getBytes( "gb2312" ), "ISO8859-1" )+DateUtils.getNowDateTimeStr() + ".xlsx");
		response.setContentType("application/vnd.ms-excel;charset=UTF-8");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);

		OutputStream output;
		try {
			output = response.getOutputStream();
			BufferedOutputStream bufferedOutPut = new BufferedOutputStream(
					output);
			bufferedOutPut.flush();
			workbook.write(bufferedOutPut);
			bufferedOutPut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
