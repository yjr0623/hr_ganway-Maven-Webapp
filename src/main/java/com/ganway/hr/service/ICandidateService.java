package com.ganway.hr.service;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ganway.hr.common.RespBody;
import com.ganway.hr.form.ApplyForm;
import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;

  
public interface ICandidateService {  
      
    public Candidate getCandidateById(int candidateId);  
  
    

    public void addCandidateAllInfo(Candidate CandidateAllInfo);
  
    public List<Candidate> getAllCandidate();

	public void addCandidate(Candidate candidate);  
	
	public RespBody queryBasic(SelectPara para);
	
	public int countBasic(SelectPara para);
	
	public Candidate queryByBasicId(String basicId);
	
	public XSSFWorkbook exportExcelInfo(SelectPara para);



	public void applyIntervers(ApplyForm form);



	public RespBody getTypeInfo(String type_id);
}  