package com.ganway.hr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ganway.hr.dao.IBasicDao;
import com.ganway.hr.dao.IReasonDao;
import com.ganway.hr.service.IReasonService;
import com.ganway.hr.vo.TbReason;

@Service("reasonService")
public class ReasonServiceImpl implements IReasonService {
	
	@Resource
	private IReasonDao reasonDao;
	@Resource
	private IBasicDao basicDao;

	@Override
	public void save(TbReason reason) {
		for(String id : reason.getIds()){
			Map<String,String> map = new HashMap<String, String>();
			map.put("id",id);
			map.put("status", reason.getMoveTo());
			basicDao.updateBasicByIdAndStatus(map);
			reason.setBasicId(id);
			reasonDao.insertReason(reason);
			
		}
	}

	@Override
	public List<TbReason> queryByBasicId(String basicId) {
		return reasonDao.queryByBasicId(basicId);
	}

}
