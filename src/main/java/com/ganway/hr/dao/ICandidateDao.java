package com.ganway.hr.dao;

import java.util.List;

import com.ganway.hr.vo.Candidate;
import com.ganway.hr.vo.SelectPara;
import com.ganway.hr.vo.TbBasic;
  
  
public interface ICandidateDao {  
      
      
      
    public void insertCandidate(Candidate candidate);  
      
      
      
      
  
    public List<Candidate> getAllCandidate();

	public void insertCandidateBasic(Candidate candidate);

	public void insertCandidateFamily(Candidate candidate);

	public void insertCandidateEducation(Candidate candidate);

	public void insertCandidateCompany(Candidate candidate);  
	
	public List<Candidate> queryBasic(SelectPara para);
	
	public int countBasic(SelectPara para);
	
	public Candidate queryByBasicId(String id);
      
}  
