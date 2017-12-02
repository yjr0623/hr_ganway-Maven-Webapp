package com.ganway.hr.form;

import java.io.Serializable;

/**
 * 名称:InterviewForm
 * 描述:面试表单
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 22:57
 */
public class InterviewForm implements Serializable{

  /**
   * 页大小
   */
  private Integer pageSize;

  /**
   * 页码
   */
  private Integer pageNo;

  /**
   * 应聘者姓名
   */
  private String name;
  /**
   * 应聘职位
   */
  private String postApp;
  /**
   * 应聘区域
   */
  private String applicationArea;
  /**
   * 投递开始日期
   */
  private String interviewDateStar;
  /**
   * 投递结束日期
   */
  private String interviewDateEnd;
  /**
   * 生日
   */
  private String dateOfBirthStar;
  private String dateOfBirthEnd;
  /**
   * 性别
   */
  private String sex;
  /**
   * 婚姻状况
   */
  private String marriage;

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPostApp() {
    return postApp;
  }

  public void setPostApp(String postApp) {
    this.postApp = postApp;
  }

  public String getApplicationArea() {
    return applicationArea;
  }

  public void setApplicationArea(String applicationArea) {
    this.applicationArea = applicationArea;
  }

  public String getInterviewDateStar() {
    return interviewDateStar;
  }

  public void setInterviewDateStar(String interviewDateStar) {
    this.interviewDateStar = interviewDateStar;
  }

  public String getInterviewDateEnd() {
    return interviewDateEnd;
  }

  public void setInterviewDateEnd(String interviewDateEnd) {
    this.interviewDateEnd = interviewDateEnd;
  }

  public String getDateOfBirthStar() {
    return dateOfBirthStar;
  }

  public void setDateOfBirthStar(String dateOfBirthStar) {
    this.dateOfBirthStar = dateOfBirthStar;
  }

  public String getDateOfBirthEnd() {
    return dateOfBirthEnd;
  }

  public void setDateOfBirthEnd(String dateOfBirthEnd) {
    this.dateOfBirthEnd = dateOfBirthEnd;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }

}
