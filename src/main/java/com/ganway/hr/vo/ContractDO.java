package com.ganway.hr.vo;

import java.util.Date;

public class ContractDO {
    private Long treatyid;

    private Long employeecode;

    private String postId;

    private String newtreatytype;

    private String treatytype;

    private Date treatydate;

    private Date treatybegin;

    private Date treatyend;

    private Long treatylast;

    private String deleted;

    private String path;

    private String remark;

    public Long getTreatyid() {
        return treatyid;
    }

    public void setTreatyid(Long treatyid) {
        this.treatyid = treatyid;
    }

    public Long getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(Long employeecode) {
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

    public Long getTreatylast() {
        return treatylast;
    }

    public void setTreatylast(Long treatylast) {
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
}