package com.ganway.hr.form;

/**
 * 名称:EntryInfoForm
 * 描述:入职申请个人信息
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 10:13
 */
public class EntryInfoForm {

  private String id;

  /**
   * 姓名
   */
  private String name;

  /**
   * 职员编号
   */
  private String employeecode;

  /**
   * 手机号
   */
  private String mobile;

  /**
   * 部门
   */
  private String deptId;

  /**
   * 职位
   */
  private String jobId;

  /**
   * 岗位
   */
  private String jobOrgId;

  /**
   * 工作制类型
   */
  private String workSystemId;

  /**
   * 身份证
   */
  private String idNum;

  /**
   * 生日
   */
  private String dateOfBrith;

  /**
   * 性别
   */
  private String sex;

  /**
   * 在职状态
   */
  private String jobState;

  /**
   * 入职时间
   */
  private String entryDate;

  /**
   * 试用期
   */
  private Integer proPeriod;

  /**
   * 转正日期
   */
  private String formalDate;

  /**
   * 离职日期
   */
  private String quitDate;

  private String email;

  private String bankCardNo;

  /**
   * 社会工龄
   */
  private String seniority;

  /**
   * 是否需要结算
   */
  private String requireSettlement;

  /**
   * 是否需要考勤
   */
  private String requireAttendance;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeecode() {
    return employeecode;
  }

  public void setEmployeecode(String employeecode) {
    this.employeecode = employeecode;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }

  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public String getJobOrgId() {
    return jobOrgId;
  }

  public void setJobOrgId(String jobOrgId) {
    this.jobOrgId = jobOrgId;
  }

  public String getWorkSystemId() {
    return workSystemId;
  }

  public void setWorkSystemId(String workSystemId) {
    this.workSystemId = workSystemId;
  }

  public String getJobState() {
    return jobState;
  }

  public void setJobState(String jobState) {
    this.jobState = jobState;
  }

  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public String getDateOfBrith() {
    return dateOfBrith;
  }

  public void setDateOfBrith(String dateOfBrith) {
    this.dateOfBrith = dateOfBrith;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(String entryDate) {
    this.entryDate = entryDate;
  }

  public Integer getProPeriod() {
    return proPeriod;
  }

  public void setProPeriod(Integer proPeriod) {
    this.proPeriod = proPeriod;
  }

  public String getFormalDate() {
    return formalDate;
  }

  public void setFormalDate(String formalDate) {
    this.formalDate = formalDate;
  }

  public String getQuitDate() {
    return quitDate;
  }

  public void setQuitDate(String quitDate) {
    this.quitDate = quitDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBankCardNo() {
    return bankCardNo;
  }

  public void setBankCardNo(String bankCardNo) {
    this.bankCardNo = bankCardNo;
  }

  public String getSeniority() {
    return seniority;
  }

  public void setSeniority(String seniority) {
    this.seniority = seniority;
  }

  public String getRequireSettlement() {
    return requireSettlement;
  }

  public void setRequireSettlement(String requireSettlement) {
    this.requireSettlement = requireSettlement;
  }

  public String getRequireAttendance() {
    return requireAttendance;
  }

  public void setRequireAttendance(String requireAttendance) {
    this.requireAttendance = requireAttendance;
  }
}
