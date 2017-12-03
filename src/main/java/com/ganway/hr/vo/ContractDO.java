package com.ganway.hr.vo;

import java.util.Date;

public class ContractDO {
    private String treatyid;

    private String employeecode;

    private String postId;

    private String newtreatytype;

    private String treatytype;

    private Date treatydate;

    private Date treatybegin;

    private Date treatyend;

    private String treatylast;

    private String deleted;

    private String path;

    private String remark;
    
    private String basicId;

    public String getTreatyid() {
        return treatyid;
    }

    public void setTreatyid(String treatyid) {
        this.treatyid = treatyid;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getNewtreatytype() {
        return newtreatytype;
    }

    public void setNewtreatytype(String newtreatytype) {
        this.newtreatytype = newtreatytype == null ? null : newtreatytype.trim();
    }

    public String getTreatytype() {
        return treatytype;
    }

    public void setTreatytype(String treatytype) {
        this.treatytype = treatytype == null ? null : treatytype.trim();
    }

    public Date getTreatydate() {
        return treatydate;
    }

    public void setTreatydate(Date treatydate) {
        this.treatydate = treatydate;
    }

    public Date getTreatybegin() {
        return treatybegin;
    }

    public void setTreatybegin(Date treatybegin) {
        this.treatybegin = treatybegin;
    }

    public Date getTreatyend() {
        return treatyend;
    }

    public void setTreatyend(Date treatyend) {
        this.treatyend = treatyend;
    }

    public String getTreatylast() {
        return treatylast;
    }

    public void setTreatylast(String treatylast) {
        this.treatylast = treatylast;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public String getBasicId() {
		return basicId;
	}

	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}
    
}