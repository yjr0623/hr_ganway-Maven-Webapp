package com.ganway.hr.common;

/**
 * 名称:ReturnCode
 * 描述:${TODO}
 *
 * @author:rency
 * @version:V1.0.0
 * @JDK 1.8
 * @since 2017/11/24 23:32
 */
public enum ReturnCode {

  SUCCESS("S000","成功"),

  INVALID_PARAMTER("E001","参数校验失败"),
  CONTRACT_EXISTED("E100","合同信息已存在"),

  ENTRY_ADD_FAILED("E101","添加入职申请失败"),
  CONTRACT_ADD_FAILED("E201","添加合同失败"),
  SALARY_ADD_FAILED("E301","添加薪酬失败"),
  INTERVIEW_ADD_FAILED("E401","创建面试失败,ids[]为空"),
  MOVET_TO_FAILED("E501","移动简历失败,ids[]为空"),

  FAILED("F000","失败"),
  ;

  private String code;
  private String msg;

  ReturnCode(String code, String msg){
    this.code = code;
    this.msg = msg;
  }

  public String getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public static ReturnCode get(String code){
    for(ReturnCode kind : ReturnCode.values()){
      if(kind.code.equalsIgnoreCase(code)){
        return kind;
      }
    }
    return null;
  }
}
