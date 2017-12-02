package com.ganway.hr.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;


public class Candidate {
	
	/**
	*应聘id
	*/
	private String id;
	/**
	*应聘者姓名
	*/
	private String name;
	/**
	*性别
	*/
	private String sex;
	/**
	*身份证号
	*/
	private String num;
	/**
	*出生年月
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date_of_birth;
	/**
	*身高
	*/
	private String height;
	/**
	*体重
	*/
	private String weight;
	/**
	*籍贯
	*/
	private String nativeStr;
	/**
	*政治面貌
	*/
	private String politics;
	/**
	*婚姻状况
	*/
	private String marriage;
	/**
	*是否服兵役
	*/
	private String escuage;
	/**
	*驾照类型
	*/
	private String licensetype;
	/**
	*领证地点
	*/
	private String licenselocation;
	/**
	*驾照有效期
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date licensevaliddate;
	/**
	*实际驾龄
	*/
	private String drivingex;
	/**
	*驾驶过的车辆类型
	*/
	private String cartype;
	/**
	*有无货运上岗证
	*/
	private String isworklicense;
	/**
	*货运上岗证有效期
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date worklicensevaliddate;
	/**
	*家庭电话
	*/
	private String familyphone;
	/**
	*手机号码
	*/
	private String phone;
	/**
	*电子邮箱
	*/
	private String email;
	/**
	*户籍地址
	*/
	private String birthplace;
	/**
	*户籍邮编
	*/
	private String birthcode;
	/**
	*目前住址
	*/
	private String residence;
	/**
	*住址邮编
	*/
	private String residencecode;
	/**
	*紧急联系人
	*/
	private String iceperson;
	/**
	*关系
	*/
	private String relation;
	/**
	*紧急联系人手机号码
	*/
	private String icepersonphone;
	/**
	*电脑软件使用情况
	*/
	private String iscomputer;
	/**
	*专业技能培训
	*/
	private String proskill;
	/**
	*外语水平/其他技能
	*/
	private String otherskill;
	/**
	*个人兴趣
	*/
	private String interest;
	/**
	*两年内是否有违章以及情况
	*/
	private String ispeccancy;
	/**
	*是否违法以及情况
	*/
	private String beillegal;
	/**
	*是否被辞退以及情况
	*/
	private String retire;
	/**
	*是否同意工作地点调动
	*/
	private String tranlocation;
	/**
	*理由
	*/
	private String reason1;
	/**
	*是否同意工作岗位调动
	*/
	private String tranpost;
	/**
	*理由
	*/
	private String reason2;
	/**
	*是否同意一年内外排工作
	*/
	private String tranlocation1year;
	/**
	*理由
	*/
	private String reason3;
	/**
	*创建时间
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatetime;
	/**
	*简历状态
	*/
	private String status;
	/**
	*bATCH执行日
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date batch_date;
	/**
	*是否删除(0.否，1.是)
	*/
	private String deleted;
	/**
	*创建程序id
	*/
	private String cre_pro_id;
	/**
	*创建人id
	*/
	private String created_by;
	/**
	*创建时间
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created_date;
	/**
	*更新程序id
	*/
	private String mod_pro_id;
	/**
	*最后更新者id
	*/
	private String last_modified_by;
	/**
	*最后更新时间
	*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date last_modified_date;
	/**
	 * 应聘职位
	 */
	private String post;
	/**
	 * 应聘区域
	 */
	private String applicationArea;
	/**
	 * 期望薪资
	 */
	private String exp_salary;
	
	/**
	 * 可到职日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date workDate;
	
	/**
	 * 招聘渠道
	 */
	private String channel;
	
	/**
	 * 职员编号
	 */
	private String employeecode;
	
	private List<TbCompany> tbCompanyList;
	private List<TbEducation> tbEducationList;
	private List<TbFamily> tbFamilyList;
	private InterviewInfoDO interviewInfo;
	private List<TbReason> tbReasonList;
	
	
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getEscuage() {
		return escuage;
	}
	public void setEscuage(String escuage) {
		this.escuage = escuage;
	}
	public String getLicensetype() {
		return licensetype;
	}
	public void setLicensetype(String licensetype) {
		this.licensetype = licensetype;
	}
	public String getLicenselocation() {
		return licenselocation;
	}
	public void setLicenselocation(String licenselocation) {
		this.licenselocation = licenselocation;
	}
	public Date getLicensevaliddate() {
		return licensevaliddate;
	}
	public void setLicensevaliddate(Date licensevaliddate) {
		this.licensevaliddate = licensevaliddate;
	}
	public String getDrivingex() {
		return drivingex;
	}
	public void setDrivingex(String drivingex) {
		this.drivingex = drivingex;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getIsworklicense() {
		return isworklicense;
	}
	public void setIsworklicense(String isworklicense) {
		this.isworklicense = isworklicense;
	}
	public Date getWorklicensevaliddate() {
		return worklicensevaliddate;
	}
	public void setWorklicensevaliddate(Date worklicensevaliddate) {
		this.worklicensevaliddate = worklicensevaliddate;
	}
	public String getFamilyphone() {
		return familyphone;
	}
	public void setFamilyphone(String familyphone) {
		this.familyphone = familyphone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getBirthcode() {
		return birthcode;
	}
	public void setBirthcode(String birthcode) {
		this.birthcode = birthcode;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getResidencecode() {
		return residencecode;
	}
	public void setResidencecode(String residencecode) {
		this.residencecode = residencecode;
	}
	public String getIceperson() {
		return iceperson;
	}
	public void setIceperson(String iceperson) {
		this.iceperson = iceperson;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getIcepersonphone() {
		return icepersonphone;
	}
	public void setIcepersonphone(String icepersonphone) {
		this.icepersonphone = icepersonphone;
	}
	public String getIscomputer() {
		return iscomputer;
	}
	public void setIscomputer(String iscomputer) {
		this.iscomputer = iscomputer;
	}
	public String getProskill() {
		return proskill;
	}
	public void setProskill(String proskill) {
		this.proskill = proskill;
	}
	public String getOtherskill() {
		return otherskill;
	}
	public void setOtherskill(String otherskill) {
		this.otherskill = otherskill;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getIspeccancy() {
		return ispeccancy;
	}
	public void setIspeccancy(String ispeccancy) {
		this.ispeccancy = ispeccancy;
	}
	public String getBeillegal() {
		return beillegal;
	}
	public void setBeillegal(String beillegal) {
		this.beillegal = beillegal;
	}
	public String getRetire() {
		return retire;
	}
	public void setRetire(String retire) {
		this.retire = retire;
	}
	public String getTranlocation() {
		return tranlocation;
	}
	public void setTranlocation(String tranlocation) {
		this.tranlocation = tranlocation;
	}
	public String getReason1() {
		return reason1;
	}
	public void setReason1(String reason1) {
		this.reason1 = reason1;
	}
	public String getTranpost() {
		return tranpost;
	}
	public void setTranpost(String tranpost) {
		this.tranpost = tranpost;
	}
	public String getReason2() {
		return reason2;
	}
	public void setReason2(String reason2) {
		this.reason2 = reason2;
	}
	public String getTranlocation1year() {
		return tranlocation1year;
	}
	public void setTranlocation1year(String tranlocation1year) {
		this.tranlocation1year = tranlocation1year;
	}
	public String getReason3() {
		return reason3;
	}
	public void setReason3(String reason3) {
		this.reason3 = reason3;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBatch_date() {
		return batch_date;
	}
	public void setBatch_date(Date batch_date) {
		this.batch_date = batch_date;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getCre_pro_id() {
		return cre_pro_id;
	}
	public void setCre_pro_id(String cre_pro_id) {
		this.cre_pro_id = cre_pro_id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getMod_pro_id() {
		return mod_pro_id;
	}
	public void setMod_pro_id(String mod_pro_id) {
		this.mod_pro_id = mod_pro_id;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public String getNativeStr() {
		return nativeStr;
	}
	public void setNativeStr(String nativeStr) {
		this.nativeStr = nativeStr;
	}
	
	
	public List<TbCompany> getTbCompanyList() {
		return tbCompanyList;
	}
	public void setTbCompanyList(List<TbCompany> tbCompanyList) {
		this.tbCompanyList = tbCompanyList;
	}
	public List<TbEducation> getTbEducationList() {
		return tbEducationList;
	}
	public void setTbEducationList(List<TbEducation> tbEducationList) {
		this.tbEducationList = tbEducationList;
	}
	public List<TbFamily> getTbFamilyList() {
		return tbFamilyList;
	}
	public void setTbFamilyList(List<TbFamily> tbFamilyList) {
		this.tbFamilyList = tbFamilyList;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getApplicationArea() {
		return applicationArea;
	}
	public void setApplicationArea(String applicationArea) {
		this.applicationArea = applicationArea;
	}
	public String getExp_salary() {
		return exp_salary;
	}
	public void setExp_salary(String exp_salary) {
		this.exp_salary = exp_salary;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getEmployeeCode() {
		return employeecode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeecode = employeeCode;
	}
	public InterviewInfoDO getInterviewInfo() {
		return interviewInfo;
	}
	public void setInterviewInfo(InterviewInfoDO interviewInfo) {
		this.interviewInfo = interviewInfo;
	}
	
	public  List<TbReason> getTbReasonList() {
		return tbReasonList;
	}
	public void setTbReasonList( List<TbReason> tbReasonList) {
		this.tbReasonList = tbReasonList;
	}
	
	
	
	
	

}
