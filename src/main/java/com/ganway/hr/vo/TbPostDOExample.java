package com.ganway.hr.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbPostDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPostDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("basicId =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeIsNull() {
            addCriterion("EMPLOYEECODE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeIsNotNull() {
            addCriterion("EMPLOYEECODE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeEqualTo(String value) {
            addCriterion("EMPLOYEECODE =", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotEqualTo(String value) {
            addCriterion("EMPLOYEECODE <>", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeGreaterThan(String value) {
            addCriterion("EMPLOYEECODE >", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEECODE >=", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeLessThan(String value) {
            addCriterion("EMPLOYEECODE <", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEECODE <=", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeLike(String value) {
            addCriterion("EMPLOYEECODE like", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotLike(String value) {
            addCriterion("EMPLOYEECODE not like", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeIn(List<String> values) {
            addCriterion("EMPLOYEECODE in", values, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotIn(List<String> values) {
            addCriterion("EMPLOYEECODE not in", values, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeBetween(String value1, String value2) {
            addCriterion("EMPLOYEECODE between", value1, value2, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEECODE not between", value1, value2, "employeecode");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JOB_ID like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JOB_ID not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdIsNull() {
            addCriterion("WORK_SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdIsNotNull() {
            addCriterion("WORK_SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdEqualTo(String value) {
            addCriterion("WORK_SYSTEM_ID =", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdNotEqualTo(String value) {
            addCriterion("WORK_SYSTEM_ID <>", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdGreaterThan(String value) {
            addCriterion("WORK_SYSTEM_ID >", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SYSTEM_ID >=", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdLessThan(String value) {
            addCriterion("WORK_SYSTEM_ID <", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_SYSTEM_ID <=", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdLike(String value) {
            addCriterion("WORK_SYSTEM_ID like", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdNotLike(String value) {
            addCriterion("WORK_SYSTEM_ID not like", value, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdIn(List<String> values) {
            addCriterion("WORK_SYSTEM_ID in", values, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdNotIn(List<String> values) {
            addCriterion("WORK_SYSTEM_ID not in", values, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdBetween(String value1, String value2) {
            addCriterion("WORK_SYSTEM_ID between", value1, value2, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andWorkSystemIdNotBetween(String value1, String value2) {
            addCriterion("WORK_SYSTEM_ID not between", value1, value2, "workSystemId");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNull() {
            addCriterion("ID_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNotNull() {
            addCriterion("ID_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumEqualTo(String value) {
            addCriterion("ID_NUM =", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotEqualTo(String value) {
            addCriterion("ID_NUM <>", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThan(String value) {
            addCriterion("ID_NUM >", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUM >=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThan(String value) {
            addCriterion("ID_NUM <", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThanOrEqualTo(String value) {
            addCriterion("ID_NUM <=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLike(String value) {
            addCriterion("ID_NUM like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotLike(String value) {
            addCriterion("ID_NUM not like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIn(List<String> values) {
            addCriterion("ID_NUM in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotIn(List<String> values) {
            addCriterion("ID_NUM not in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumBetween(String value1, String value2) {
            addCriterion("ID_NUM between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotBetween(String value1, String value2) {
            addCriterion("ID_NUM not between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("DATE_OF_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("DATE_OF_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_OF_BIRTH in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_OF_BIRTH not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_OF_BIRTH between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_OF_BIRTH not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andJobStateIsNull() {
            addCriterion("JOB_STATE is null");
            return (Criteria) this;
        }

        public Criteria andJobStateIsNotNull() {
            addCriterion("JOB_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andJobStateEqualTo(String value) {
            addCriterion("JOB_STATE =", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateNotEqualTo(String value) {
            addCriterion("JOB_STATE <>", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateGreaterThan(String value) {
            addCriterion("JOB_STATE >", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_STATE >=", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateLessThan(String value) {
            addCriterion("JOB_STATE <", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateLessThanOrEqualTo(String value) {
            addCriterion("JOB_STATE <=", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateLike(String value) {
            addCriterion("JOB_STATE like", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateNotLike(String value) {
            addCriterion("JOB_STATE not like", value, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateIn(List<String> values) {
            addCriterion("JOB_STATE in", values, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateNotIn(List<String> values) {
            addCriterion("JOB_STATE not in", values, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateBetween(String value1, String value2) {
            addCriterion("JOB_STATE between", value1, value2, "jobState");
            return (Criteria) this;
        }

        public Criteria andJobStateNotBetween(String value1, String value2) {
            addCriterion("JOB_STATE not between", value1, value2, "jobState");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("ENTRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("ENTRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY_DATE in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY_DATE not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY_DATE between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY_DATE not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andProPeriodIsNull() {
            addCriterion("PRO_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andProPeriodIsNotNull() {
            addCriterion("PRO_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andProPeriodEqualTo(Integer value) {
            addCriterion("PRO_PERIOD =", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodNotEqualTo(Integer value) {
            addCriterion("PRO_PERIOD <>", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodGreaterThan(Integer value) {
            addCriterion("PRO_PERIOD >", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_PERIOD >=", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodLessThan(Integer value) {
            addCriterion("PRO_PERIOD <", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_PERIOD <=", value, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodIn(List<Integer> values) {
            addCriterion("PRO_PERIOD in", values, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodNotIn(List<Integer> values) {
            addCriterion("PRO_PERIOD not in", values, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PERIOD between", value1, value2, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andProPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PERIOD not between", value1, value2, "proPeriod");
            return (Criteria) this;
        }

        public Criteria andFormalDateIsNull() {
            addCriterion("FORMAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFormalDateIsNotNull() {
            addCriterion("FORMAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFormalDateEqualTo(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE =", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE <>", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE >", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE >=", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateLessThan(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE <", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FORMAL_DATE <=", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateIn(List<Date> values) {
            addCriterionForJDBCDate("FORMAL_DATE in", values, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FORMAL_DATE not in", values, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FORMAL_DATE between", value1, value2, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FORMAL_DATE not between", value1, value2, "formalDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNull() {
            addCriterion("QUIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("QUIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterionForJDBCDate("QUIT_DATE =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("QUIT_DATE <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("QUIT_DATE >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QUIT_DATE >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterionForJDBCDate("QUIT_DATE <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QUIT_DATE <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterionForJDBCDate("QUIT_DATE in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("QUIT_DATE not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QUIT_DATE between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QUIT_DATE not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andSeniorityIsNull() {
            addCriterion("SENIORITY is null");
            return (Criteria) this;
        }

        public Criteria andSeniorityIsNotNull() {
            addCriterion("SENIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorityEqualTo(Integer value) {
            addCriterion("SENIORITY =", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityNotEqualTo(Integer value) {
            addCriterion("SENIORITY <>", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityGreaterThan(Integer value) {
            addCriterion("SENIORITY >", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENIORITY >=", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityLessThan(Integer value) {
            addCriterion("SENIORITY <", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityLessThanOrEqualTo(Integer value) {
            addCriterion("SENIORITY <=", value, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityIn(List<Integer> values) {
            addCriterion("SENIORITY in", values, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityNotIn(List<Integer> values) {
            addCriterion("SENIORITY not in", values, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityBetween(Integer value1, Integer value2) {
            addCriterion("SENIORITY between", value1, value2, "seniority");
            return (Criteria) this;
        }

        public Criteria andSeniorityNotBetween(Integer value1, Integer value2) {
            addCriterion("SENIORITY not between", value1, value2, "seniority");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementIsNull() {
            addCriterion("REQUIRE_SETTLEMENT is null");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementIsNotNull() {
            addCriterion("REQUIRE_SETTLEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementEqualTo(String value) {
            addCriterion("REQUIRE_SETTLEMENT =", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementNotEqualTo(String value) {
            addCriterion("REQUIRE_SETTLEMENT <>", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementGreaterThan(String value) {
            addCriterion("REQUIRE_SETTLEMENT >", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_SETTLEMENT >=", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementLessThan(String value) {
            addCriterion("REQUIRE_SETTLEMENT <", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_SETTLEMENT <=", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementLike(String value) {
            addCriterion("REQUIRE_SETTLEMENT like", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementNotLike(String value) {
            addCriterion("REQUIRE_SETTLEMENT not like", value, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementIn(List<String> values) {
            addCriterion("REQUIRE_SETTLEMENT in", values, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementNotIn(List<String> values) {
            addCriterion("REQUIRE_SETTLEMENT not in", values, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementBetween(String value1, String value2) {
            addCriterion("REQUIRE_SETTLEMENT between", value1, value2, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireSettlementNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_SETTLEMENT not between", value1, value2, "requireSettlement");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceIsNull() {
            addCriterion("REQUIRE_ATTENDANCE is null");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceIsNotNull() {
            addCriterion("REQUIRE_ATTENDANCE is not null");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceEqualTo(String value) {
            addCriterion("REQUIRE_ATTENDANCE =", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceNotEqualTo(String value) {
            addCriterion("REQUIRE_ATTENDANCE <>", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceGreaterThan(String value) {
            addCriterion("REQUIRE_ATTENDANCE >", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_ATTENDANCE >=", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceLessThan(String value) {
            addCriterion("REQUIRE_ATTENDANCE <", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_ATTENDANCE <=", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceLike(String value) {
            addCriterion("REQUIRE_ATTENDANCE like", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceNotLike(String value) {
            addCriterion("REQUIRE_ATTENDANCE not like", value, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceIn(List<String> values) {
            addCriterion("REQUIRE_ATTENDANCE in", values, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceNotIn(List<String> values) {
            addCriterion("REQUIRE_ATTENDANCE not in", values, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceBetween(String value1, String value2) {
            addCriterion("REQUIRE_ATTENDANCE between", value1, value2, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andRequireAttendanceNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_ATTENDANCE not between", value1, value2, "requireAttendance");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNull() {
            addCriterion("POSTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNotNull() {
            addCriterion("POSTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosttypeEqualTo(String value) {
            addCriterion("POSTTYPE =", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotEqualTo(String value) {
            addCriterion("POSTTYPE <>", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThan(String value) {
            addCriterion("POSTTYPE >", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTTYPE >=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThan(String value) {
            addCriterion("POSTTYPE <", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThanOrEqualTo(String value) {
            addCriterion("POSTTYPE <=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLike(String value) {
            addCriterion("POSTTYPE like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotLike(String value) {
            addCriterion("POSTTYPE not like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeIn(List<String> values) {
            addCriterion("POSTTYPE in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotIn(List<String> values) {
            addCriterion("POSTTYPE not in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeBetween(String value1, String value2) {
            addCriterion("POSTTYPE between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotBetween(String value1, String value2) {
            addCriterion("POSTTYPE not between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNull() {
            addCriterion("SALARY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("SALARY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(String value) {
            addCriterion("SALARY_ID =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(String value) {
            addCriterion("SALARY_ID <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(String value) {
            addCriterion("SALARY_ID >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALARY_ID >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(String value) {
            addCriterion("SALARY_ID <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(String value) {
            addCriterion("SALARY_ID <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLike(String value) {
            addCriterion("SALARY_ID like", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotLike(String value) {
            addCriterion("SALARY_ID not like", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<String> values) {
            addCriterion("SALARY_ID in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<String> values) {
            addCriterion("SALARY_ID not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(String value1, String value2) {
            addCriterion("SALARY_ID between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(String value1, String value2) {
            addCriterion("SALARY_ID not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andPerfIdIsNull() {
            addCriterion("PERF_ID is null");
            return (Criteria) this;
        }

        public Criteria andPerfIdIsNotNull() {
            addCriterion("PERF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPerfIdEqualTo(String value) {
            addCriterion("PERF_ID =", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdNotEqualTo(String value) {
            addCriterion("PERF_ID <>", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdGreaterThan(String value) {
            addCriterion("PERF_ID >", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERF_ID >=", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdLessThan(String value) {
            addCriterion("PERF_ID <", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdLessThanOrEqualTo(String value) {
            addCriterion("PERF_ID <=", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdLike(String value) {
            addCriterion("PERF_ID like", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdNotLike(String value) {
            addCriterion("PERF_ID not like", value, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdIn(List<String> values) {
            addCriterion("PERF_ID in", values, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdNotIn(List<String> values) {
            addCriterion("PERF_ID not in", values, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdBetween(String value1, String value2) {
            addCriterion("PERF_ID between", value1, value2, "perfId");
            return (Criteria) this;
        }

        public Criteria andPerfIdNotBetween(String value1, String value2) {
            addCriterion("PERF_ID not between", value1, value2, "perfId");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryIsNull() {
            addCriterion("SENIORITY_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryIsNotNull() {
            addCriterion("SENIORITY_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryEqualTo(Double value) {
            addCriterion("SENIORITY_SALARY =", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryNotEqualTo(Double value) {
            addCriterion("SENIORITY_SALARY <>", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryGreaterThan(Double value) {
            addCriterion("SENIORITY_SALARY >", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("SENIORITY_SALARY >=", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryLessThan(Double value) {
            addCriterion("SENIORITY_SALARY <", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryLessThanOrEqualTo(Double value) {
            addCriterion("SENIORITY_SALARY <=", value, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryIn(List<Double> values) {
            addCriterion("SENIORITY_SALARY in", values, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryNotIn(List<Double> values) {
            addCriterion("SENIORITY_SALARY not in", values, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryBetween(Double value1, Double value2) {
            addCriterion("SENIORITY_SALARY between", value1, value2, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andSenioritySalaryNotBetween(Double value1, Double value2) {
            addCriterion("SENIORITY_SALARY not between", value1, value2, "senioritySalary");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceIsNull() {
            addCriterion("OTHER_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceIsNotNull() {
            addCriterion("OTHER_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceEqualTo(Double value) {
            addCriterion("OTHER_ALLOWANCE =", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceNotEqualTo(Double value) {
            addCriterion("OTHER_ALLOWANCE <>", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceGreaterThan(Double value) {
            addCriterion("OTHER_ALLOWANCE >", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceGreaterThanOrEqualTo(Double value) {
            addCriterion("OTHER_ALLOWANCE >=", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceLessThan(Double value) {
            addCriterion("OTHER_ALLOWANCE <", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceLessThanOrEqualTo(Double value) {
            addCriterion("OTHER_ALLOWANCE <=", value, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceIn(List<Double> values) {
            addCriterion("OTHER_ALLOWANCE in", values, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceNotIn(List<Double> values) {
            addCriterion("OTHER_ALLOWANCE not in", values, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceBetween(Double value1, Double value2) {
            addCriterion("OTHER_ALLOWANCE between", value1, value2, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andOtherAllowanceNotBetween(Double value1, Double value2) {
            addCriterion("OTHER_ALLOWANCE not between", value1, value2, "otherAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceIsNull() {
            addCriterion("TRAFFIC_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceIsNotNull() {
            addCriterion("TRAFFIC_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceEqualTo(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE =", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceNotEqualTo(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE <>", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceGreaterThan(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE >", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceGreaterThanOrEqualTo(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE >=", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceLessThan(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE <", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceLessThanOrEqualTo(Double value) {
            addCriterion("TRAFFIC_ALLOWANCE <=", value, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceIn(List<Double> values) {
            addCriterion("TRAFFIC_ALLOWANCE in", values, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceNotIn(List<Double> values) {
            addCriterion("TRAFFIC_ALLOWANCE not in", values, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceBetween(Double value1, Double value2) {
            addCriterion("TRAFFIC_ALLOWANCE between", value1, value2, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andTrafficAllowanceNotBetween(Double value1, Double value2) {
            addCriterion("TRAFFIC_ALLOWANCE not between", value1, value2, "trafficAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceIsNull() {
            addCriterion("FOOD_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceIsNotNull() {
            addCriterion("FOOD_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceEqualTo(Double value) {
            addCriterion("FOOD_ALLOWANCE =", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceNotEqualTo(Double value) {
            addCriterion("FOOD_ALLOWANCE <>", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceGreaterThan(Double value) {
            addCriterion("FOOD_ALLOWANCE >", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceGreaterThanOrEqualTo(Double value) {
            addCriterion("FOOD_ALLOWANCE >=", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceLessThan(Double value) {
            addCriterion("FOOD_ALLOWANCE <", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceLessThanOrEqualTo(Double value) {
            addCriterion("FOOD_ALLOWANCE <=", value, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceIn(List<Double> values) {
            addCriterion("FOOD_ALLOWANCE in", values, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceNotIn(List<Double> values) {
            addCriterion("FOOD_ALLOWANCE not in", values, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceBetween(Double value1, Double value2) {
            addCriterion("FOOD_ALLOWANCE between", value1, value2, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andFoodAllowanceNotBetween(Double value1, Double value2) {
            addCriterion("FOOD_ALLOWANCE not between", value1, value2, "foodAllowance");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsIsNull() {
            addCriterion("TRADE_UNIONS is null");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsIsNotNull() {
            addCriterion("TRADE_UNIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsEqualTo(String value) {
            addCriterion("TRADE_UNIONS =", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsNotEqualTo(String value) {
            addCriterion("TRADE_UNIONS <>", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsGreaterThan(String value) {
            addCriterion("TRADE_UNIONS >", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_UNIONS >=", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsLessThan(String value) {
            addCriterion("TRADE_UNIONS <", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsLessThanOrEqualTo(String value) {
            addCriterion("TRADE_UNIONS <=", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsLike(String value) {
            addCriterion("TRADE_UNIONS like", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsNotLike(String value) {
            addCriterion("TRADE_UNIONS not like", value, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsIn(List<String> values) {
            addCriterion("TRADE_UNIONS in", values, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsNotIn(List<String> values) {
            addCriterion("TRADE_UNIONS not in", values, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsBetween(String value1, String value2) {
            addCriterion("TRADE_UNIONS between", value1, value2, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsNotBetween(String value1, String value2) {
            addCriterion("TRADE_UNIONS not between", value1, value2, "tradeUnions");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeIsNull() {
            addCriterion("TRADE_UNIONS_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeIsNotNull() {
            addCriterion("TRADE_UNIONS_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeEqualTo(Double value) {
            addCriterion("TRADE_UNIONS_FEE =", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeNotEqualTo(Double value) {
            addCriterion("TRADE_UNIONS_FEE <>", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeGreaterThan(Double value) {
            addCriterion("TRADE_UNIONS_FEE >", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("TRADE_UNIONS_FEE >=", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeLessThan(Double value) {
            addCriterion("TRADE_UNIONS_FEE <", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeLessThanOrEqualTo(Double value) {
            addCriterion("TRADE_UNIONS_FEE <=", value, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeIn(List<Double> values) {
            addCriterion("TRADE_UNIONS_FEE in", values, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeNotIn(List<Double> values) {
            addCriterion("TRADE_UNIONS_FEE not in", values, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeBetween(Double value1, Double value2) {
            addCriterion("TRADE_UNIONS_FEE between", value1, value2, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andTradeUnionsFeeNotBetween(Double value1, Double value2) {
            addCriterion("TRADE_UNIONS_FEE not between", value1, value2, "tradeUnionsFee");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("JOB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("JOB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("JOB_TYPE =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("JOB_TYPE <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(String value) {
            addCriterion("JOB_TYPE >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_TYPE >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(String value) {
            addCriterion("JOB_TYPE <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(String value) {
            addCriterion("JOB_TYPE <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("JOB_TYPE like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("JOB_TYPE not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("JOB_TYPE in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("JOB_TYPE not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("JOB_TYPE between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("JOB_TYPE not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andSocialNumIsNull() {
            addCriterion("SOCIAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSocialNumIsNotNull() {
            addCriterion("SOCIAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSocialNumEqualTo(Double value) {
            addCriterion("SOCIAL_NUM =", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumNotEqualTo(Double value) {
            addCriterion("SOCIAL_NUM <>", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumGreaterThan(Double value) {
            addCriterion("SOCIAL_NUM >", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumGreaterThanOrEqualTo(Double value) {
            addCriterion("SOCIAL_NUM >=", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumLessThan(Double value) {
            addCriterion("SOCIAL_NUM <", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumLessThanOrEqualTo(Double value) {
            addCriterion("SOCIAL_NUM <=", value, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumIn(List<Double> values) {
            addCriterion("SOCIAL_NUM in", values, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumNotIn(List<Double> values) {
            addCriterion("SOCIAL_NUM not in", values, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumBetween(Double value1, Double value2) {
            addCriterion("SOCIAL_NUM between", value1, value2, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialNumNotBetween(Double value1, Double value2) {
            addCriterion("SOCIAL_NUM not between", value1, value2, "socialNum");
            return (Criteria) this;
        }

        public Criteria andSocialAccIsNull() {
            addCriterion("SOCIAL_ACC is null");
            return (Criteria) this;
        }

        public Criteria andSocialAccIsNotNull() {
            addCriterion("SOCIAL_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andSocialAccEqualTo(String value) {
            addCriterion("SOCIAL_ACC =", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccNotEqualTo(String value) {
            addCriterion("SOCIAL_ACC <>", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccGreaterThan(String value) {
            addCriterion("SOCIAL_ACC >", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_ACC >=", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccLessThan(String value) {
            addCriterion("SOCIAL_ACC <", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_ACC <=", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccLike(String value) {
            addCriterion("SOCIAL_ACC like", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccNotLike(String value) {
            addCriterion("SOCIAL_ACC not like", value, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccIn(List<String> values) {
            addCriterion("SOCIAL_ACC in", values, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccNotIn(List<String> values) {
            addCriterion("SOCIAL_ACC not in", values, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccBetween(String value1, String value2) {
            addCriterion("SOCIAL_ACC between", value1, value2, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andSocialAccNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_ACC not between", value1, value2, "socialAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccIsNull() {
            addCriterion("HOUSING_ACC is null");
            return (Criteria) this;
        }

        public Criteria andHousingAccIsNotNull() {
            addCriterion("HOUSING_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andHousingAccEqualTo(String value) {
            addCriterion("HOUSING_ACC =", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccNotEqualTo(String value) {
            addCriterion("HOUSING_ACC <>", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccGreaterThan(String value) {
            addCriterion("HOUSING_ACC >", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSING_ACC >=", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccLessThan(String value) {
            addCriterion("HOUSING_ACC <", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccLessThanOrEqualTo(String value) {
            addCriterion("HOUSING_ACC <=", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccLike(String value) {
            addCriterion("HOUSING_ACC like", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccNotLike(String value) {
            addCriterion("HOUSING_ACC not like", value, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccIn(List<String> values) {
            addCriterion("HOUSING_ACC in", values, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccNotIn(List<String> values) {
            addCriterion("HOUSING_ACC not in", values, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccBetween(String value1, String value2) {
            addCriterion("HOUSING_ACC between", value1, value2, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andHousingAccNotBetween(String value1, String value2) {
            addCriterion("HOUSING_ACC not between", value1, value2, "housingAcc");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesIsNull() {
            addCriterion("ACC_PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesIsNotNull() {
            addCriterion("ACC_PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesEqualTo(String value) {
            addCriterion("ACC_PROPERTIES =", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesNotEqualTo(String value) {
            addCriterion("ACC_PROPERTIES <>", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesGreaterThan(String value) {
            addCriterion("ACC_PROPERTIES >", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_PROPERTIES >=", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesLessThan(String value) {
            addCriterion("ACC_PROPERTIES <", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesLessThanOrEqualTo(String value) {
            addCriterion("ACC_PROPERTIES <=", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesLike(String value) {
            addCriterion("ACC_PROPERTIES like", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesNotLike(String value) {
            addCriterion("ACC_PROPERTIES not like", value, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesIn(List<String> values) {
            addCriterion("ACC_PROPERTIES in", values, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesNotIn(List<String> values) {
            addCriterion("ACC_PROPERTIES not in", values, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesBetween(String value1, String value2) {
            addCriterion("ACC_PROPERTIES between", value1, value2, "accProperties");
            return (Criteria) this;
        }

        public Criteria andAccPropertiesNotBetween(String value1, String value2) {
            addCriterion("ACC_PROPERTIES not between", value1, value2, "accProperties");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNull() {
            addCriterion("SOCIAL_SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNotNull() {
            addCriterion("SOCIAL_SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEqualTo(String value) {
            addCriterion("SOCIAL_SECURITY =", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotEqualTo(String value) {
            addCriterion("SOCIAL_SECURITY <>", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThan(String value) {
            addCriterion("SOCIAL_SECURITY >", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_SECURITY >=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThan(String value) {
            addCriterion("SOCIAL_SECURITY <", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_SECURITY <=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLike(String value) {
            addCriterion("SOCIAL_SECURITY like", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotLike(String value) {
            addCriterion("SOCIAL_SECURITY not like", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIn(List<String> values) {
            addCriterion("SOCIAL_SECURITY in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotIn(List<String> values) {
            addCriterion("SOCIAL_SECURITY not in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBetween(String value1, String value2) {
            addCriterion("SOCIAL_SECURITY between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_SECURITY not between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNull() {
            addCriterion("BATCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNotNull() {
            addCriterion("BATCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDateEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE =", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <>", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BATCH_DATE >", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE >=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThan(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BATCH_DATE <=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateIn(List<Date> values) {
            addCriterionForJDBCDate("BATCH_DATE in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BATCH_DATE not in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BATCH_DATE between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BATCH_DATE not between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("DELETED like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("DELETED not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreProIdIsNull() {
            addCriterion("CRE_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreProIdIsNotNull() {
            addCriterion("CRE_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreProIdEqualTo(Integer value) {
            addCriterion("CRE_PRO_ID =", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotEqualTo(Integer value) {
            addCriterion("CRE_PRO_ID <>", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdGreaterThan(Integer value) {
            addCriterion("CRE_PRO_ID >", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRE_PRO_ID >=", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdLessThan(Integer value) {
            addCriterion("CRE_PRO_ID <", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdLessThanOrEqualTo(Integer value) {
            addCriterion("CRE_PRO_ID <=", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdIn(List<Integer> values) {
            addCriterion("CRE_PRO_ID in", values, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotIn(List<Integer> values) {
            addCriterion("CRE_PRO_ID not in", values, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdBetween(Integer value1, Integer value2) {
            addCriterion("CRE_PRO_ID between", value1, value2, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CRE_PRO_ID not between", value1, value2, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModProIdIsNull() {
            addCriterion("MOD_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andModProIdIsNotNull() {
            addCriterion("MOD_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModProIdEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID =", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID <>", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdGreaterThan(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID >", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID >=", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdLessThan(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID <", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MOD_PRO_ID <=", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_PRO_ID in", values, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotIn(List<Date> values) {
            addCriterionForJDBCDate("MOD_PRO_ID not in", values, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_PRO_ID between", value1, value2, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MOD_PRO_ID not between", value1, value2, "modProId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("LAST_MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("LAST_MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_BY =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_BY <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(Integer value) {
            addCriterion("LAST_MODIFIED_BY >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_BY >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(Integer value) {
            addCriterion("LAST_MODIFIED_BY <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_BY <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<Integer> values) {
            addCriterion("LAST_MODIFIED_BY in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<Integer> values) {
            addCriterion("LAST_MODIFIED_BY not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIED_BY between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIED_BY not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("LAST_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("LAST_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}