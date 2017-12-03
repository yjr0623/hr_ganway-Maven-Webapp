package com.ganway.hr.common;

/**
 * 名称:BasicConstants
 * 描述:${TODO}
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 23:42
 */
public interface BasicConstants {

  public static final Integer DEFAULT_PAGE_SIZE = 20;
  
  /**
   * 初建简历-1
   */
  public static final String candidate = "1";
  /**
   * 已面试-5
   */
  public static final String interview = "5";
  /**
   * 不合格-2
   */
  public static final String BHG = "2";
  /**
   * 人才库-3
   */
  public static final String RC = "3";
  
  /**
   * Excel表头
   */
  public static final String[] candidateType={"name","sex","post","date_of_birth","phone","marriage","created_date"};
  public static final String[] candidateInfo={"姓名","性别","应聘岗位","出生日期","联系电话","婚姻状况","简历投递时间"};
  public static final String[] interviewType={"name","sex","post","date_of_birth","marriage","phone","interviewdate","interviewer","isrecord"};
  public static final String[] interviewInfo={"面试对象","性别","应聘岗位","出生日期","婚姻状况","联系电话","本次面试时间","面试人","面试结果"};
  public static final String[] RCType={"name","sex","post","date_of_birth","phone","marriage","","status","create_date"};
  public static final String[] RCInfo={"姓名","性别","应聘岗位","出生日期","联系电话","婚姻状况","是否面试","状态","简历投递时间"};
  public static final String[] BHGType={"name","sex","post","date_of_birth","phone","marriage","","status","last_modified_date"};
  public static final String[] BHGInfo={"姓名","性别","应聘岗位","出生日期","联系电话","婚姻状况","是否面试","状态","加入时间"};
  
   
  
  
 // public static final String interview = "interview";
  //public static final String interview = "interview";
}
