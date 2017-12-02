package com.ganway.hr.form;

/**
 * 名称:ContractInfoForm
 * 描述:合同信息
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/25 10:13
 */
public class ContractInfoForm {

  private String id;

  /**
   * 合同创建方式:新建、续签
   */
  private String newtreatytype;

  /**
   * 合同类型
   */
  private String treatytype;

  /**
   * 合同编号
   */
  private String treatyid;

  /**
   * 合同签订日
   */
  private String treatydate;
  /**
   * 合同起始日
   */
  private String treatybegin;
  /**
   * 合同终止日
   */
  private String treatyend;
  /**
   * 合同年限（年）
   */
  private String treatylast;
  /**
   * 合同路径
   */
  private String path;
  /**
   * 备注
   */
  private String remark;

  /**
   * 职员编号
   */
  private String employeecode;

  public String getEmployeecode() {
    return employeecode;
  }

  public void setEmployeecode(String employeecode) {
    this.employeecode = employeecode;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNewtreatytype() {
    return newtreatytype;
  }

  public void setNewtreatytype(String newtreatytype) {
    this.newtreatytype = newtreatytype;
  }

  public String getTreatytype() {
    return treatytype;
  }

  public void setTreatytype(String treatytype) {
    this.treatytype = treatytype;
  }

  public String getTreatyid() {
    return treatyid;
  }

  public void setTreatyid(String treatyid) {
    this.treatyid = treatyid;
  }

  public String getTreatydate() {
    return treatydate;
  }

  public void setTreatydate(String treatydate) {
    this.treatydate = treatydate;
  }

  public String getTreatybegin() {
    return treatybegin;
  }

  public void setTreatybegin(String treatybegin) {
    this.treatybegin = treatybegin;
  }

  public String getTreatyend() {
    return treatyend;
  }

  public void setTreatyend(String treatyend) {
    this.treatyend = treatyend;
  }

  public String getTreatylast() {
    return treatylast;
  }

  public void setTreatylast(String treatylast) {
    this.treatylast = treatylast;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
