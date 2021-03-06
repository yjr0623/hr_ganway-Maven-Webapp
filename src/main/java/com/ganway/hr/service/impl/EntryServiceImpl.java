package com.ganway.hr.service.impl;

import com.ganway.hr.dao.ContractDao;
import com.ganway.hr.dao.IBasicDao;
import com.ganway.hr.dao.TbPostDao;
import com.ganway.hr.dao.TypeInfoDao;
import com.ganway.hr.vo.ContractDO;
import com.ganway.hr.vo.ContractDOExample;
import com.ganway.hr.vo.TbPostDO;
import com.ganway.hr.vo.TbPostDOExample;
import com.ganway.hr.vo.TbTypeInfo;
import com.ganway.hr.service.EntryService;
import com.ganway.hr.vo.TbBasic;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 名称:EntryServiceImpl 描述:${TODO}
 * 
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 13:49
 */
@Service("entryService")
public class EntryServiceImpl implements EntryService {

	@Resource
	private IBasicDao basicDao;

	@Resource
	private TypeInfoDao typeInfoDao;

	@Resource
	private ContractDao contractDao;

	@Resource
	private TbPostDao postDao;

	@Override
	public TbBasic findById(String id) {
		return basicDao.load(id);
	}

	@Override
	public TbBasic findByEmployee(String employeecode) {
		return basicDao.findByEmployeecode(employeecode);
	}

	@Override
	public boolean createContract(ContractDO contract) {
		if (contract.getTreatyid().equals("1")) {
			contract.setTreatyid("HT" + new Date().getTime());
			return contractDao.insert(contract) == 1;
		} else {
			return contractDao.updateByPrimaryKey(contract) == 1;
		}

	}
	
	@Override
	public String getUploadPath(String type_id){
		String uploadPath = "";
		List<TbTypeInfo> list = typeInfoDao.getByTpyeId(type_id);
		if(list!=null){
			uploadPath=list.get(0).getInfo();
		}
	return  uploadPath;
	  
  }

	@Override
	public ContractDO findContract(String contractId) {
		return contractDao.selectByPrimaryKey(contractId);
	}

	@Override
	public List<ContractDO> findGroupContract(String basicId) {

		return contractDao.selectByExample(basicId);
	}

	@Override
	public boolean removeConstract(String contractId, String newDeleted,
			String oldDeleted) {

		ContractDO record = new ContractDO();
		record.setDeleted(newDeleted);
		record.setTreatyid(contractId);
		return contractDao.deleteByPrimaryKey(contractId) == 1;
	}

	@Override
	public boolean createSalary(TbPostDO post) {
		post.setId(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		return postDao.insert(post) == 1;
	}

	@Override
	public boolean updateSalary(String id, TbPostDO post) {

		return postDao.updateByExampleSelective(post) > 0;
	}

	@Override
	public TbPostDO findByID(String id) {
		return postDao.selectByPrimaryKey(id);
	}

	@Override
	public boolean createPost(TbPostDO post) {
		post.setId(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		post.setDeleted("0");
		postDao.insert(post);
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", post.getBasicId());
		map.put("status", "0");
		basicDao.updateBasicByIdAndStatus(map);
		return true;
	}

	@Override
	public void updateContract(ContractDO contract) {
		contractDao.updateByPrimaryKey(contract);
	}

}
