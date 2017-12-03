package com.ganway.hr.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractDOExample() {
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

        public Criteria andTreatyidIsNull() {
            addCriterion("TREATYID is null");
            return (Criteria) this;
        }

        public Criteria andTreatyidIsNotNull() {
            addCriterion("TREATYID is not null");
            return (Criteria) this;
        }

        public Criteria andTreatyidEqualTo(String value) {
            addCriterion("TREATYID =", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidNotEqualTo(Long value) {
            addCriterion("TREATYID <>", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidGreaterThan(Long value) {
            addCriterion("TREATYID >", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidGreaterThanOrEqualTo(Long value) {
            addCriterion("TREATYID >=", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidLessThan(Long value) {
            addCriterion("TREATYID <", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidLessThanOrEqualTo(Long value) {
            addCriterion("TREATYID <=", value, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidIn(List<Long> values) {
            addCriterion("TREATYID in", values, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidNotIn(List<Long> values) {
            addCriterion("TREATYID not in", values, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidBetween(Long value1, Long value2) {
            addCriterion("TREATYID between", value1, value2, "treatyid");
            return (Criteria) this;
        }

        public Criteria andTreatyidNotBetween(Long value1, Long value2) {
            addCriterion("TREATYID not between", value1, value2, "treatyid");
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

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("POST_ID like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("POST_ID not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeIsNull() {
            addCriterion("NEWTREATYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeIsNotNull() {
            addCriterion("NEWTREATYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeEqualTo(String value) {
            addCriterion("NEWTREATYTYPE =", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeNotEqualTo(String value) {
            addCriterion("NEWTREATYTYPE <>", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeGreaterThan(String value) {
            addCriterion("NEWTREATYTYPE >", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeGreaterThanOrEqualTo(String value) {
            addCriterion("NEWTREATYTYPE >=", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeLessThan(String value) {
            addCriterion("NEWTREATYTYPE <", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeLessThanOrEqualTo(String value) {
            addCriterion("NEWTREATYTYPE <=", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeLike(String value) {
            addCriterion("NEWTREATYTYPE like", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeNotLike(String value) {
            addCriterion("NEWTREATYTYPE not like", value, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeIn(List<String> values) {
            addCriterion("NEWTREATYTYPE in", values, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeNotIn(List<String> values) {
            addCriterion("NEWTREATYTYPE not in", values, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeBetween(String value1, String value2) {
            addCriterion("NEWTREATYTYPE between", value1, value2, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andNewtreatytypeNotBetween(String value1, String value2) {
            addCriterion("NEWTREATYTYPE not between", value1, value2, "newtreatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeIsNull() {
            addCriterion("TREATYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTreatytypeIsNotNull() {
            addCriterion("TREATYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTreatytypeEqualTo(String value) {
            addCriterion("TREATYTYPE =", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeNotEqualTo(String value) {
            addCriterion("TREATYTYPE <>", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeGreaterThan(String value) {
            addCriterion("TREATYTYPE >", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeGreaterThanOrEqualTo(String value) {
            addCriterion("TREATYTYPE >=", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeLessThan(String value) {
            addCriterion("TREATYTYPE <", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeLessThanOrEqualTo(String value) {
            addCriterion("TREATYTYPE <=", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeLike(String value) {
            addCriterion("TREATYTYPE like", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeNotLike(String value) {
            addCriterion("TREATYTYPE not like", value, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeIn(List<String> values) {
            addCriterion("TREATYTYPE in", values, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeNotIn(List<String> values) {
            addCriterion("TREATYTYPE not in", values, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeBetween(String value1, String value2) {
            addCriterion("TREATYTYPE between", value1, value2, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatytypeNotBetween(String value1, String value2) {
            addCriterion("TREATYTYPE not between", value1, value2, "treatytype");
            return (Criteria) this;
        }

        public Criteria andTreatydateIsNull() {
            addCriterion("TREATYDATE is null");
            return (Criteria) this;
        }

        public Criteria andTreatydateIsNotNull() {
            addCriterion("TREATYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTreatydateEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYDATE =", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYDATE <>", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateGreaterThan(Date value) {
            addCriterionForJDBCDate("TREATYDATE >", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYDATE >=", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateLessThan(Date value) {
            addCriterionForJDBCDate("TREATYDATE <", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYDATE <=", value, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYDATE in", values, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYDATE not in", values, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYDATE between", value1, value2, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYDATE not between", value1, value2, "treatydate");
            return (Criteria) this;
        }

        public Criteria andTreatybeginIsNull() {
            addCriterion("TREATYBEGIN is null");
            return (Criteria) this;
        }

        public Criteria andTreatybeginIsNotNull() {
            addCriterion("TREATYBEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTreatybeginEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN =", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN <>", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginGreaterThan(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN >", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN >=", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginLessThan(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN <", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYBEGIN <=", value, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYBEGIN in", values, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYBEGIN not in", values, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYBEGIN between", value1, value2, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatybeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYBEGIN not between", value1, value2, "treatybegin");
            return (Criteria) this;
        }

        public Criteria andTreatyendIsNull() {
            addCriterion("TREATYEND is null");
            return (Criteria) this;
        }

        public Criteria andTreatyendIsNotNull() {
            addCriterion("TREATYEND is not null");
            return (Criteria) this;
        }

        public Criteria andTreatyendEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYEND =", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendNotEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYEND <>", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendGreaterThan(Date value) {
            addCriterionForJDBCDate("TREATYEND >", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYEND >=", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendLessThan(Date value) {
            addCriterionForJDBCDate("TREATYEND <", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TREATYEND <=", value, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYEND in", values, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendNotIn(List<Date> values) {
            addCriterionForJDBCDate("TREATYEND not in", values, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYEND between", value1, value2, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatyendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TREATYEND not between", value1, value2, "treatyend");
            return (Criteria) this;
        }

        public Criteria andTreatylastIsNull() {
            addCriterion("TREATYLAST is null");
            return (Criteria) this;
        }

        public Criteria andTreatylastIsNotNull() {
            addCriterion("TREATYLAST is not null");
            return (Criteria) this;
        }

        public Criteria andTreatylastEqualTo(Long value) {
            addCriterion("TREATYLAST =", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastNotEqualTo(Long value) {
            addCriterion("TREATYLAST <>", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastGreaterThan(Long value) {
            addCriterion("TREATYLAST >", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastGreaterThanOrEqualTo(Long value) {
            addCriterion("TREATYLAST >=", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastLessThan(Long value) {
            addCriterion("TREATYLAST <", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastLessThanOrEqualTo(Long value) {
            addCriterion("TREATYLAST <=", value, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastIn(List<Long> values) {
            addCriterion("TREATYLAST in", values, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastNotIn(List<Long> values) {
            addCriterion("TREATYLAST not in", values, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastBetween(Long value1, Long value2) {
            addCriterion("TREATYLAST between", value1, value2, "treatylast");
            return (Criteria) this;
        }

        public Criteria andTreatylastNotBetween(Long value1, Long value2) {
            addCriterion("TREATYLAST not between", value1, value2, "treatylast");
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

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
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