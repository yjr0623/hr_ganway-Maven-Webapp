package com.ganway.hr.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InterviewInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewInfoDOExample() {
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
            addCriterion("ID =", value, "id");
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

        public Criteria andInterviewerIsNull() {
            addCriterion("INTERVIEWER is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerIsNotNull() {
            addCriterion("INTERVIEWER is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerEqualTo(String value) {
            addCriterion("INTERVIEWER =", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotEqualTo(String value) {
            addCriterion("INTERVIEWER <>", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerGreaterThan(String value) {
            addCriterion("INTERVIEWER >", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVIEWER >=", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLessThan(String value) {
            addCriterion("INTERVIEWER <", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLessThanOrEqualTo(String value) {
            addCriterion("INTERVIEWER <=", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLike(String value) {
            addCriterion("INTERVIEWER like", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotLike(String value) {
            addCriterion("INTERVIEWER not like", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerIn(List<String> values) {
            addCriterion("INTERVIEWER in", values, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotIn(List<String> values) {
            addCriterion("INTERVIEWER not in", values, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerBetween(String value1, String value2) {
            addCriterion("INTERVIEWER between", value1, value2, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotBetween(String value1, String value2) {
            addCriterion("INTERVIEWER not between", value1, value2, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIsNull() {
            addCriterion("INTERVIEWDATE is null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIsNotNull() {
            addCriterion("INTERVIEWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateEqualTo(Date value) {
            addCriterion("INTERVIEWDATE =", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotEqualTo(Date value) {
            addCriterion("INTERVIEWDATE <>", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThan(Date value) {
            addCriterion("INTERVIEWDATE >", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("INTERVIEWDATE >=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThan(Date value) {
            addCriterion("INTERVIEWDATE <", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThanOrEqualTo(Date value) {
            addCriterion("INTERVIEWDATE <=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIn(List<Date> values) {
            addCriterion("INTERVIEWDATE in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotIn(List<Date> values) {
            addCriterion("INTERVIEWDATE not in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateBetween(Date value1, Date value2) {
            addCriterion("INTERVIEWDATE between", value1, value2, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotBetween(Date value1, Date value2) {
            addCriterion("INTERVIEWDATE not between", value1, value2, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemindtypeIsNull() {
            addCriterion("REMINDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRemindtypeIsNotNull() {
            addCriterion("REMINDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRemindtypeEqualTo(String value) {
            addCriterion("REMINDTYPE =", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeNotEqualTo(String value) {
            addCriterion("REMINDTYPE <>", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeGreaterThan(String value) {
            addCriterion("REMINDTYPE >", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeGreaterThanOrEqualTo(String value) {
            addCriterion("REMINDTYPE >=", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeLessThan(String value) {
            addCriterion("REMINDTYPE <", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeLessThanOrEqualTo(String value) {
            addCriterion("REMINDTYPE <=", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeLike(String value) {
            addCriterion("REMINDTYPE like", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeNotLike(String value) {
            addCriterion("REMINDTYPE not like", value, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeIn(List<String> values) {
            addCriterion("REMINDTYPE in", values, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeNotIn(List<String> values) {
            addCriterion("REMINDTYPE not in", values, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeBetween(String value1, String value2) {
            addCriterion("REMINDTYPE between", value1, value2, "remindtype");
            return (Criteria) this;
        }

        public Criteria andRemindtypeNotBetween(String value1, String value2) {
            addCriterion("REMINDTYPE not between", value1, value2, "remindtype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIscomingIsNull() {
            addCriterion("ISCOMING is null");
            return (Criteria) this;
        }

        public Criteria andIscomingIsNotNull() {
            addCriterion("ISCOMING is not null");
            return (Criteria) this;
        }

        public Criteria andIscomingEqualTo(String value) {
            addCriterion("ISCOMING =", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingNotEqualTo(String value) {
            addCriterion("ISCOMING <>", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingGreaterThan(String value) {
            addCriterion("ISCOMING >", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOMING >=", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingLessThan(String value) {
            addCriterion("ISCOMING <", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingLessThanOrEqualTo(String value) {
            addCriterion("ISCOMING <=", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingLike(String value) {
            addCriterion("ISCOMING like", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingNotLike(String value) {
            addCriterion("ISCOMING not like", value, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingIn(List<String> values) {
            addCriterion("ISCOMING in", values, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingNotIn(List<String> values) {
            addCriterion("ISCOMING not in", values, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingBetween(String value1, String value2) {
            addCriterion("ISCOMING between", value1, value2, "iscoming");
            return (Criteria) this;
        }

        public Criteria andIscomingNotBetween(String value1, String value2) {
            addCriterion("ISCOMING not between", value1, value2, "iscoming");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Double value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Double value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Double value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Double value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Double value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Double value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Double> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Double> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Double value1, Double value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Double value1, Double value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andExpSalaryIsNull() {
            addCriterion("EXP_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andExpSalaryIsNotNull() {
            addCriterion("EXP_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andExpSalaryEqualTo(BigDecimal value) {
            addCriterion("EXP_SALARY =", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryNotEqualTo(BigDecimal value) {
            addCriterion("EXP_SALARY <>", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryGreaterThan(BigDecimal value) {
            addCriterion("EXP_SALARY >", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_SALARY >=", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryLessThan(BigDecimal value) {
            addCriterion("EXP_SALARY <", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_SALARY <=", value, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryIn(List<BigDecimal> values) {
            addCriterion("EXP_SALARY in", values, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryNotIn(List<BigDecimal> values) {
            addCriterion("EXP_SALARY not in", values, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_SALARY between", value1, value2, "expSalary");
            return (Criteria) this;
        }

        public Criteria andExpSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_SALARY not between", value1, value2, "expSalary");
            return (Criteria) this;
        }

        public Criteria andPostappIsNull() {
            addCriterion("POSTAPP is null");
            return (Criteria) this;
        }

        public Criteria andPostappIsNotNull() {
            addCriterion("POSTAPP is not null");
            return (Criteria) this;
        }

        public Criteria andPostappEqualTo(String value) {
            addCriterion("POSTAPP =", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappNotEqualTo(String value) {
            addCriterion("POSTAPP <>", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappGreaterThan(String value) {
            addCriterion("POSTAPP >", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAPP >=", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappLessThan(String value) {
            addCriterion("POSTAPP <", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappLessThanOrEqualTo(String value) {
            addCriterion("POSTAPP <=", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappLike(String value) {
            addCriterion("POSTAPP like", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappNotLike(String value) {
            addCriterion("POSTAPP not like", value, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappIn(List<String> values) {
            addCriterion("POSTAPP in", values, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappNotIn(List<String> values) {
            addCriterion("POSTAPP not in", values, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappBetween(String value1, String value2) {
            addCriterion("POSTAPP between", value1, value2, "postapp");
            return (Criteria) this;
        }

        public Criteria andPostappNotBetween(String value1, String value2) {
            addCriterion("POSTAPP not between", value1, value2, "postapp");
            return (Criteria) this;
        }

        public Criteria andPersonaIsNull() {
            addCriterion("PERSONA is null");
            return (Criteria) this;
        }

        public Criteria andPersonaIsNotNull() {
            addCriterion("PERSONA is not null");
            return (Criteria) this;
        }

        public Criteria andPersonaEqualTo(String value) {
            addCriterion("PERSONA =", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotEqualTo(String value) {
            addCriterion("PERSONA <>", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaGreaterThan(String value) {
            addCriterion("PERSONA >", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONA >=", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaLessThan(String value) {
            addCriterion("PERSONA <", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaLessThanOrEqualTo(String value) {
            addCriterion("PERSONA <=", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaLike(String value) {
            addCriterion("PERSONA like", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotLike(String value) {
            addCriterion("PERSONA not like", value, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaIn(List<String> values) {
            addCriterion("PERSONA in", values, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotIn(List<String> values) {
            addCriterion("PERSONA not in", values, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaBetween(String value1, String value2) {
            addCriterion("PERSONA between", value1, value2, "persona");
            return (Criteria) this;
        }

        public Criteria andPersonaNotBetween(String value1, String value2) {
            addCriterion("PERSONA not between", value1, value2, "persona");
            return (Criteria) this;
        }

        public Criteria andCommunicationIsNull() {
            addCriterion("COMMUNICATION is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationIsNotNull() {
            addCriterion("COMMUNICATION is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationEqualTo(String value) {
            addCriterion("COMMUNICATION =", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotEqualTo(String value) {
            addCriterion("COMMUNICATION <>", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationGreaterThan(String value) {
            addCriterion("COMMUNICATION >", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION >=", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationLessThan(String value) {
            addCriterion("COMMUNICATION <", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationLessThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION <=", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationLike(String value) {
            addCriterion("COMMUNICATION like", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotLike(String value) {
            addCriterion("COMMUNICATION not like", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationIn(List<String> values) {
            addCriterion("COMMUNICATION in", values, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotIn(List<String> values) {
            addCriterion("COMMUNICATION not in", values, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationBetween(String value1, String value2) {
            addCriterion("COMMUNICATION between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotBetween(String value1, String value2) {
            addCriterion("COMMUNICATION not between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("WORKEXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("WORKEXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(String value) {
            addCriterion("WORKEXPERIENCE =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(String value) {
            addCriterion("WORKEXPERIENCE <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(String value) {
            addCriterion("WORKEXPERIENCE >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("WORKEXPERIENCE >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(String value) {
            addCriterion("WORKEXPERIENCE <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(String value) {
            addCriterion("WORKEXPERIENCE <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLike(String value) {
            addCriterion("WORKEXPERIENCE like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotLike(String value) {
            addCriterion("WORKEXPERIENCE not like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<String> values) {
            addCriterion("WORKEXPERIENCE in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<String> values) {
            addCriterion("WORKEXPERIENCE not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(String value1, String value2) {
            addCriterion("WORKEXPERIENCE between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(String value1, String value2) {
            addCriterion("WORKEXPERIENCE not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andPassionIsNull() {
            addCriterion("PASSION is null");
            return (Criteria) this;
        }

        public Criteria andPassionIsNotNull() {
            addCriterion("PASSION is not null");
            return (Criteria) this;
        }

        public Criteria andPassionEqualTo(String value) {
            addCriterion("PASSION =", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionNotEqualTo(String value) {
            addCriterion("PASSION <>", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionGreaterThan(String value) {
            addCriterion("PASSION >", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionGreaterThanOrEqualTo(String value) {
            addCriterion("PASSION >=", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionLessThan(String value) {
            addCriterion("PASSION <", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionLessThanOrEqualTo(String value) {
            addCriterion("PASSION <=", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionLike(String value) {
            addCriterion("PASSION like", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionNotLike(String value) {
            addCriterion("PASSION not like", value, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionIn(List<String> values) {
            addCriterion("PASSION in", values, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionNotIn(List<String> values) {
            addCriterion("PASSION not in", values, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionBetween(String value1, String value2) {
            addCriterion("PASSION between", value1, value2, "passion");
            return (Criteria) this;
        }

        public Criteria andPassionNotBetween(String value1, String value2) {
            addCriterion("PASSION not between", value1, value2, "passion");
            return (Criteria) this;
        }

        public Criteria andJobstabilityIsNull() {
            addCriterion("JOBSTABILITY is null");
            return (Criteria) this;
        }

        public Criteria andJobstabilityIsNotNull() {
            addCriterion("JOBSTABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andJobstabilityEqualTo(String value) {
            addCriterion("JOBSTABILITY =", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityNotEqualTo(String value) {
            addCriterion("JOBSTABILITY <>", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityGreaterThan(String value) {
            addCriterion("JOBSTABILITY >", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityGreaterThanOrEqualTo(String value) {
            addCriterion("JOBSTABILITY >=", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityLessThan(String value) {
            addCriterion("JOBSTABILITY <", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityLessThanOrEqualTo(String value) {
            addCriterion("JOBSTABILITY <=", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityLike(String value) {
            addCriterion("JOBSTABILITY like", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityNotLike(String value) {
            addCriterion("JOBSTABILITY not like", value, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityIn(List<String> values) {
            addCriterion("JOBSTABILITY in", values, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityNotIn(List<String> values) {
            addCriterion("JOBSTABILITY not in", values, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityBetween(String value1, String value2) {
            addCriterion("JOBSTABILITY between", value1, value2, "jobstability");
            return (Criteria) this;
        }

        public Criteria andJobstabilityNotBetween(String value1, String value2) {
            addCriterion("JOBSTABILITY not between", value1, value2, "jobstability");
            return (Criteria) this;
        }

        public Criteria andTeamworkIsNull() {
            addCriterion("TEAMWORK is null");
            return (Criteria) this;
        }

        public Criteria andTeamworkIsNotNull() {
            addCriterion("TEAMWORK is not null");
            return (Criteria) this;
        }

        public Criteria andTeamworkEqualTo(String value) {
            addCriterion("TEAMWORK =", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkNotEqualTo(String value) {
            addCriterion("TEAMWORK <>", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkGreaterThan(String value) {
            addCriterion("TEAMWORK >", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkGreaterThanOrEqualTo(String value) {
            addCriterion("TEAMWORK >=", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkLessThan(String value) {
            addCriterion("TEAMWORK <", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkLessThanOrEqualTo(String value) {
            addCriterion("TEAMWORK <=", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkLike(String value) {
            addCriterion("TEAMWORK like", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkNotLike(String value) {
            addCriterion("TEAMWORK not like", value, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkIn(List<String> values) {
            addCriterion("TEAMWORK in", values, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkNotIn(List<String> values) {
            addCriterion("TEAMWORK not in", values, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkBetween(String value1, String value2) {
            addCriterion("TEAMWORK between", value1, value2, "teamwork");
            return (Criteria) this;
        }

        public Criteria andTeamworkNotBetween(String value1, String value2) {
            addCriterion("TEAMWORK not between", value1, value2, "teamwork");
            return (Criteria) this;
        }

        public Criteria andPostskillIsNull() {
            addCriterion("POSTSKILL is null");
            return (Criteria) this;
        }

        public Criteria andPostskillIsNotNull() {
            addCriterion("POSTSKILL is not null");
            return (Criteria) this;
        }

        public Criteria andPostskillEqualTo(String value) {
            addCriterion("POSTSKILL =", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotEqualTo(String value) {
            addCriterion("POSTSKILL <>", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillGreaterThan(String value) {
            addCriterion("POSTSKILL >", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillGreaterThanOrEqualTo(String value) {
            addCriterion("POSTSKILL >=", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLessThan(String value) {
            addCriterion("POSTSKILL <", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLessThanOrEqualTo(String value) {
            addCriterion("POSTSKILL <=", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLike(String value) {
            addCriterion("POSTSKILL like", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotLike(String value) {
            addCriterion("POSTSKILL not like", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillIn(List<String> values) {
            addCriterion("POSTSKILL in", values, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotIn(List<String> values) {
            addCriterion("POSTSKILL not in", values, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillBetween(String value1, String value2) {
            addCriterion("POSTSKILL between", value1, value2, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotBetween(String value1, String value2) {
            addCriterion("POSTSKILL not between", value1, value2, "postskill");
            return (Criteria) this;
        }

        public Criteria andIssalaryIsNull() {
            addCriterion("ISSALARY is null");
            return (Criteria) this;
        }

        public Criteria andIssalaryIsNotNull() {
            addCriterion("ISSALARY is not null");
            return (Criteria) this;
        }

        public Criteria andIssalaryEqualTo(String value) {
            addCriterion("ISSALARY =", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryNotEqualTo(String value) {
            addCriterion("ISSALARY <>", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryGreaterThan(String value) {
            addCriterion("ISSALARY >", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryGreaterThanOrEqualTo(String value) {
            addCriterion("ISSALARY >=", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryLessThan(String value) {
            addCriterion("ISSALARY <", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryLessThanOrEqualTo(String value) {
            addCriterion("ISSALARY <=", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryLike(String value) {
            addCriterion("ISSALARY like", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryNotLike(String value) {
            addCriterion("ISSALARY not like", value, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryIn(List<String> values) {
            addCriterion("ISSALARY in", values, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryNotIn(List<String> values) {
            addCriterion("ISSALARY not in", values, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryBetween(String value1, String value2) {
            addCriterion("ISSALARY between", value1, value2, "issalary");
            return (Criteria) this;
        }

        public Criteria andIssalaryNotBetween(String value1, String value2) {
            addCriterion("ISSALARY not between", value1, value2, "issalary");
            return (Criteria) this;
        }

        public Criteria andCmspIsNull() {
            addCriterion("CMSP is null");
            return (Criteria) this;
        }

        public Criteria andCmspIsNotNull() {
            addCriterion("CMSP is not null");
            return (Criteria) this;
        }

        public Criteria andCmspEqualTo(String value) {
            addCriterion("CMSP =", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspNotEqualTo(String value) {
            addCriterion("CMSP <>", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspGreaterThan(String value) {
            addCriterion("CMSP >", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspGreaterThanOrEqualTo(String value) {
            addCriterion("CMSP >=", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspLessThan(String value) {
            addCriterion("CMSP <", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspLessThanOrEqualTo(String value) {
            addCriterion("CMSP <=", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspLike(String value) {
            addCriterion("CMSP like", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspNotLike(String value) {
            addCriterion("CMSP not like", value, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspIn(List<String> values) {
            addCriterion("CMSP in", values, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspNotIn(List<String> values) {
            addCriterion("CMSP not in", values, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspBetween(String value1, String value2) {
            addCriterion("CMSP between", value1, value2, "cmsp");
            return (Criteria) this;
        }

        public Criteria andCmspNotBetween(String value1, String value2) {
            addCriterion("CMSP not between", value1, value2, "cmsp");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNull() {
            addCriterion("WORKDATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("WORKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(Date value) {
            addCriterionForJDBCDate("WORKDATE =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("WORKDATE <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(Date value) {
            addCriterionForJDBCDate("WORKDATE >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORKDATE >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(Date value) {
            addCriterionForJDBCDate("WORKDATE <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORKDATE <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<Date> values) {
            addCriterionForJDBCDate("WORKDATE in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("WORKDATE not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORKDATE between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORKDATE not between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andOverallMeritIsNull() {
            addCriterion("OVERALL_MERIT is null");
            return (Criteria) this;
        }

        public Criteria andOverallMeritIsNotNull() {
            addCriterion("OVERALL_MERIT is not null");
            return (Criteria) this;
        }

        public Criteria andOverallMeritEqualTo(String value) {
            addCriterion("OVERALL_MERIT =", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritNotEqualTo(String value) {
            addCriterion("OVERALL_MERIT <>", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritGreaterThan(String value) {
            addCriterion("OVERALL_MERIT >", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritGreaterThanOrEqualTo(String value) {
            addCriterion("OVERALL_MERIT >=", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritLessThan(String value) {
            addCriterion("OVERALL_MERIT <", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritLessThanOrEqualTo(String value) {
            addCriterion("OVERALL_MERIT <=", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritLike(String value) {
            addCriterion("OVERALL_MERIT like", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritNotLike(String value) {
            addCriterion("OVERALL_MERIT not like", value, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritIn(List<String> values) {
            addCriterion("OVERALL_MERIT in", values, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritNotIn(List<String> values) {
            addCriterion("OVERALL_MERIT not in", values, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritBetween(String value1, String value2) {
            addCriterion("OVERALL_MERIT between", value1, value2, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andOverallMeritNotBetween(String value1, String value2) {
            addCriterion("OVERALL_MERIT not between", value1, value2, "overallMerit");
            return (Criteria) this;
        }

        public Criteria andIsrecordIsNull() {
            addCriterion("ISRECORD is null");
            return (Criteria) this;
        }

        public Criteria andIsrecordIsNotNull() {
            addCriterion("ISRECORD is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecordEqualTo(String value) {
            addCriterion("ISRECORD =", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordNotEqualTo(String value) {
            addCriterion("ISRECORD <>", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordGreaterThan(String value) {
            addCriterion("ISRECORD >", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordGreaterThanOrEqualTo(String value) {
            addCriterion("ISRECORD >=", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordLessThan(String value) {
            addCriterion("ISRECORD <", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordLessThanOrEqualTo(String value) {
            addCriterion("ISRECORD <=", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordLike(String value) {
            addCriterion("ISRECORD like", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordNotLike(String value) {
            addCriterion("ISRECORD not like", value, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordIn(List<String> values) {
            addCriterion("ISRECORD in", values, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordNotIn(List<String> values) {
            addCriterion("ISRECORD not in", values, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordBetween(String value1, String value2) {
            addCriterion("ISRECORD between", value1, value2, "isrecord");
            return (Criteria) this;
        }

        public Criteria andIsrecordNotBetween(String value1, String value2) {
            addCriterion("ISRECORD not between", value1, value2, "isrecord");
            return (Criteria) this;
        }

        public Criteria andRecPositionIsNull() {
            addCriterion("REC_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andRecPositionIsNotNull() {
            addCriterion("REC_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andRecPositionEqualTo(String value) {
            addCriterion("REC_POSITION =", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionNotEqualTo(String value) {
            addCriterion("REC_POSITION <>", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionGreaterThan(String value) {
            addCriterion("REC_POSITION >", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionGreaterThanOrEqualTo(String value) {
            addCriterion("REC_POSITION >=", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionLessThan(String value) {
            addCriterion("REC_POSITION <", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionLessThanOrEqualTo(String value) {
            addCriterion("REC_POSITION <=", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionLike(String value) {
            addCriterion("REC_POSITION like", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionNotLike(String value) {
            addCriterion("REC_POSITION not like", value, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionIn(List<String> values) {
            addCriterion("REC_POSITION in", values, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionNotIn(List<String> values) {
            addCriterion("REC_POSITION not in", values, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionBetween(String value1, String value2) {
            addCriterion("REC_POSITION between", value1, value2, "recPosition");
            return (Criteria) this;
        }

        public Criteria andRecPositionNotBetween(String value1, String value2) {
            addCriterion("REC_POSITION not between", value1, value2, "recPosition");
            return (Criteria) this;
        }

        public Criteria andMeritIsNull() {
            addCriterion("MERIT is null");
            return (Criteria) this;
        }

        public Criteria andMeritIsNotNull() {
            addCriterion("MERIT is not null");
            return (Criteria) this;
        }

        public Criteria andMeritEqualTo(String value) {
            addCriterion("MERIT =", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritNotEqualTo(String value) {
            addCriterion("MERIT <>", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritGreaterThan(String value) {
            addCriterion("MERIT >", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritGreaterThanOrEqualTo(String value) {
            addCriterion("MERIT >=", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritLessThan(String value) {
            addCriterion("MERIT <", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritLessThanOrEqualTo(String value) {
            addCriterion("MERIT <=", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritLike(String value) {
            addCriterion("MERIT like", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritNotLike(String value) {
            addCriterion("MERIT not like", value, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritIn(List<String> values) {
            addCriterion("MERIT in", values, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritNotIn(List<String> values) {
            addCriterion("MERIT not in", values, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritBetween(String value1, String value2) {
            addCriterion("MERIT between", value1, value2, "merit");
            return (Criteria) this;
        }

        public Criteria andMeritNotBetween(String value1, String value2) {
            addCriterion("MERIT not between", value1, value2, "merit");
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

        public Criteria andCreProIdEqualTo(Long value) {
            addCriterion("CRE_PRO_ID =", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotEqualTo(Long value) {
            addCriterion("CRE_PRO_ID <>", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdGreaterThan(Long value) {
            addCriterion("CRE_PRO_ID >", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CRE_PRO_ID >=", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdLessThan(Long value) {
            addCriterion("CRE_PRO_ID <", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdLessThanOrEqualTo(Long value) {
            addCriterion("CRE_PRO_ID <=", value, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdIn(List<Long> values) {
            addCriterion("CRE_PRO_ID in", values, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotIn(List<Long> values) {
            addCriterion("CRE_PRO_ID not in", values, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdBetween(Long value1, Long value2) {
            addCriterion("CRE_PRO_ID between", value1, value2, "creProId");
            return (Criteria) this;
        }

        public Criteria andCreProIdNotBetween(Long value1, Long value2) {
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

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
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
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
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

        public Criteria andModProIdEqualTo(Long value) {
            addCriterion("MOD_PRO_ID =", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotEqualTo(Long value) {
            addCriterion("MOD_PRO_ID <>", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdGreaterThan(Long value) {
            addCriterion("MOD_PRO_ID >", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MOD_PRO_ID >=", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdLessThan(Long value) {
            addCriterion("MOD_PRO_ID <", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdLessThanOrEqualTo(Long value) {
            addCriterion("MOD_PRO_ID <=", value, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdIn(List<Long> values) {
            addCriterion("MOD_PRO_ID in", values, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotIn(List<Long> values) {
            addCriterion("MOD_PRO_ID not in", values, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdBetween(Long value1, Long value2) {
            addCriterion("MOD_PRO_ID between", value1, value2, "modProId");
            return (Criteria) this;
        }

        public Criteria andModProIdNotBetween(Long value1, Long value2) {
            addCriterion("MOD_PRO_ID not between", value1, value2, "modProId");
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

        public Criteria andLastModifiedByEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(Long value) {
            addCriterion("LAST_MODIFIED_BY >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(Long value) {
            addCriterion("LAST_MODIFIED_BY <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFIED_BY <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<Long> values) {
            addCriterion("LAST_MODIFIED_BY in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<Long> values) {
            addCriterion("LAST_MODIFIED_BY not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFIED_BY between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(Long value1, Long value2) {
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
            addCriterion("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
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

        public Criteria andEmployeecodeEqualTo(Long value) {
            addCriterion("EMPLOYEECODE =", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotEqualTo(Long value) {
            addCriterion("EMPLOYEECODE <>", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeGreaterThan(Long value) {
            addCriterion("EMPLOYEECODE >", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeGreaterThanOrEqualTo(Long value) {
            addCriterion("EMPLOYEECODE >=", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeLessThan(Long value) {
            addCriterion("EMPLOYEECODE <", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeLessThanOrEqualTo(Long value) {
            addCriterion("EMPLOYEECODE <=", value, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeIn(List<Long> values) {
            addCriterion("EMPLOYEECODE in", values, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotIn(List<Long> values) {
            addCriterion("EMPLOYEECODE not in", values, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeBetween(Long value1, Long value2) {
            addCriterion("EMPLOYEECODE between", value1, value2, "employeecode");
            return (Criteria) this;
        }

        public Criteria andEmployeecodeNotBetween(Long value1, Long value2) {
            addCriterion("EMPLOYEECODE not between", value1, value2, "employeecode");
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