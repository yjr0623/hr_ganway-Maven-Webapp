package com.ganway.hr.service;

import java.util.List;

import com.ganway.hr.vo.TbReason;

public interface IReasonService {
	
	public void save(TbReason reason);
	
	public List<TbReason> queryByBasicId(String basicId);

}
