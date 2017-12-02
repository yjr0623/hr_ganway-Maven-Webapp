package com.ganway.hr.service.impl;

import com.ganway.hr.dao.IBasicDao;
import com.ganway.hr.service.BasicService;
import com.ganway.hr.vo.TbBasic;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 名称:BasicServiceImpl
 * 描述:${TODO}
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 13:55
 */
@Service
public class BasicServiceImpl implements BasicService {

  @Resource
  private IBasicDao  basicDao;

  @Override
  public TbBasic load(String id) {
    return basicDao.load(id);
  }
}
