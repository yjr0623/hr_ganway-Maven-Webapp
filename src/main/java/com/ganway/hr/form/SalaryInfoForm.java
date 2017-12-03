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
public class SalaryInfoForm {

  private String id;

  /**
   * 职员编号
   */
  private String employeecode;

  /**
   * 职位等级
   */
  private String post;

  /**
   * 职位类型
   */
  private String posttype;

  /**
   * 基本工资档位
   */
  private String salaryId;

  /**
   * 绩效档位
   */
  private String perfId;

  /**
   * 试用打折率
   */
  private Double discount;

  /**
   * 工龄工资调整值
   */
  private String senioritySalary;

  /**
   * 其他补贴
   */
  private String otherAllowance;

  /**
   * 车贴
   */
  private String trafficAllowance;

  /**
   * 饭贴
   */
  private String foodAllowance;

  /**
   * 是否工会会员
   */
  private String tradeUnions;

  /**
   * 工会费用
   */
  private String tradeUnionsFee;

  /**
   * 用工属性
   */
  private String jobType;

  /**
   * 社保基数
   */
  private String socialNum;

  /**
   * 社保账户
   */
  private String socialAcc;

  /**
   * 公积金账户
   */
  private String housingAcc;

  /**
   * 户粮性质
   */
  private String accProperties;

  /**
   * 缴纳单位
   */
  private String unit;

  /**
   * 参保城市
   */
  private String city;

  /**
   * 社保套帐
   */
  private String socialSecurity;
  
  private String basicId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmployeecode() {
    return employeecode;
  }

  public void setEmployeecode(String employeecode) {
    this.employeecode = employeecode;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public String getPosttype() {
    return posttype;
  }

  public void setPosttype(String posttype) {
    this.posttype = posttype;
  }

  public String getSalaryId() {
    return salaryId;
  }

  public void setSalaryId(String salaryId) {
    this.salaryId = salaryId;
  }

  public String getPerfId() {
    return perfId;
  }

  public void setPerfId(String perfId) {
    this.perfId = perfId;
  }

  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public String getSenioritySalary() {
    return senioritySalary;
  }

  public void setSenioritySalary(String senioritySalary) {
    this.senioritySalary = senioritySalary;
  }

  public String getOtherAllowance() {
    return otherAllowance;
  }

  public void setOtherAllowance(String otherAllowance) {
    this.otherAllowance = otherAllowance;
  }

  public String getTrafficAllowance() {
    return trafficAllowance;
  }

  public void setTrafficAllowance(String trafficAllowance) {
    this.trafficAllowance = trafficAllowance;
  }

  public String getFoodAllowance() {
    return foodAllowance;
  }

  public void setFoodAllowance(String foodAllowance) {
    this.foodAllowance = foodAllowance;
  }

  public String getTradeUnions() {
    return tradeUnions;
  }

  public void setTradeUnions(String tradeUnions) {
    this.tradeUnions = tradeUnions;
  }

  public String getTradeUnionsFee() {
    return tradeUnionsFee;
  }

  public void setTradeUnionsFee(String tradeUnionsFee) {
    this.tradeUnionsFee = tradeUnionsFee;
  }

  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public String getSocialNum() {
    return socialNum;
  }

  public void setSocialNum(String socialNum) {
    this.socialNum = socialNum;
  }

  public String getSocialAcc() {
    return socialAcc;
  }

  public void setSocialAcc(String socialAcc) {
    this.socialAcc = socialAcc;
  }

  public String getHousingAcc() {
    return housingAcc;
  }

  public void setHousingAcc(String housingAcc) {
    this.housingAcc = housingAcc;
  }

  public String getAccProperties() {
    return accProperties;
  }

  public void setAccProperties(String accProperties) {
    this.accProperties = accProperties;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getSocialSecurity() {
    return socialSecurity;
  }

  public void setSocialSecurity(String socialSecurity) {
    this.socialSecurity = socialSecurity;
  }

	public String getBasicId() {
		return basicId;
	}
	
	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}
  
}
