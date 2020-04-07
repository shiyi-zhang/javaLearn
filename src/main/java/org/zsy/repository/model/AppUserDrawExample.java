package org.zsy.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppUserDrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUserDrawExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNull() {
            addCriterion("get_time is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("get_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Date value) {
            addCriterionForJDBCDate("get_time =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("get_time <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("get_time >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("get_time >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Date value) {
            addCriterionForJDBCDate("get_time <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("get_time <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Date> values) {
            addCriterionForJDBCDate("get_time in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("get_time not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("get_time between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("get_time not between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andMrIsNull() {
            addCriterion("mr is null");
            return (Criteria) this;
        }

        public Criteria andMrIsNotNull() {
            addCriterion("mr is not null");
            return (Criteria) this;
        }

        public Criteria andMrEqualTo(Long value) {
            addCriterion("mr =", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrNotEqualTo(Long value) {
            addCriterion("mr <>", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrGreaterThan(Long value) {
            addCriterion("mr >", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrGreaterThanOrEqualTo(Long value) {
            addCriterion("mr >=", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrLessThan(Long value) {
            addCriterion("mr <", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrLessThanOrEqualTo(Long value) {
            addCriterion("mr <=", value, "mr");
            return (Criteria) this;
        }

        public Criteria andMrIn(List<Long> values) {
            addCriterion("mr in", values, "mr");
            return (Criteria) this;
        }

        public Criteria andMrNotIn(List<Long> values) {
            addCriterion("mr not in", values, "mr");
            return (Criteria) this;
        }

        public Criteria andMrBetween(Long value1, Long value2) {
            addCriterion("mr between", value1, value2, "mr");
            return (Criteria) this;
        }

        public Criteria andMrNotBetween(Long value1, Long value2) {
            addCriterion("mr not between", value1, value2, "mr");
            return (Criteria) this;
        }

        public Criteria andMsIsNull() {
            addCriterion("ms is null");
            return (Criteria) this;
        }

        public Criteria andMsIsNotNull() {
            addCriterion("ms is not null");
            return (Criteria) this;
        }

        public Criteria andMsEqualTo(Long value) {
            addCriterion("ms =", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotEqualTo(Long value) {
            addCriterion("ms <>", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThan(Long value) {
            addCriterion("ms >", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThanOrEqualTo(Long value) {
            addCriterion("ms >=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThan(Long value) {
            addCriterion("ms <", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThanOrEqualTo(Long value) {
            addCriterion("ms <=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsIn(List<Long> values) {
            addCriterion("ms in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotIn(List<Long> values) {
            addCriterion("ms not in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsBetween(Long value1, Long value2) {
            addCriterion("ms between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotBetween(Long value1, Long value2) {
            addCriterion("ms not between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andAge1IsNull() {
            addCriterion("age1 is null");
            return (Criteria) this;
        }

        public Criteria andAge1IsNotNull() {
            addCriterion("age1 is not null");
            return (Criteria) this;
        }

        public Criteria andAge1EqualTo(Long value) {
            addCriterion("age1 =", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotEqualTo(Long value) {
            addCriterion("age1 <>", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1GreaterThan(Long value) {
            addCriterion("age1 >", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1GreaterThanOrEqualTo(Long value) {
            addCriterion("age1 >=", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1LessThan(Long value) {
            addCriterion("age1 <", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1LessThanOrEqualTo(Long value) {
            addCriterion("age1 <=", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1In(List<Long> values) {
            addCriterion("age1 in", values, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotIn(List<Long> values) {
            addCriterion("age1 not in", values, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1Between(Long value1, Long value2) {
            addCriterion("age1 between", value1, value2, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotBetween(Long value1, Long value2) {
            addCriterion("age1 not between", value1, value2, "age1");
            return (Criteria) this;
        }

        public Criteria andAge2IsNull() {
            addCriterion("age2 is null");
            return (Criteria) this;
        }

        public Criteria andAge2IsNotNull() {
            addCriterion("age2 is not null");
            return (Criteria) this;
        }

        public Criteria andAge2EqualTo(Long value) {
            addCriterion("age2 =", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotEqualTo(Long value) {
            addCriterion("age2 <>", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2GreaterThan(Long value) {
            addCriterion("age2 >", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2GreaterThanOrEqualTo(Long value) {
            addCriterion("age2 >=", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2LessThan(Long value) {
            addCriterion("age2 <", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2LessThanOrEqualTo(Long value) {
            addCriterion("age2 <=", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2In(List<Long> values) {
            addCriterion("age2 in", values, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotIn(List<Long> values) {
            addCriterion("age2 not in", values, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2Between(Long value1, Long value2) {
            addCriterion("age2 between", value1, value2, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotBetween(Long value1, Long value2) {
            addCriterion("age2 not between", value1, value2, "age2");
            return (Criteria) this;
        }

        public Criteria andAge3IsNull() {
            addCriterion("age3 is null");
            return (Criteria) this;
        }

        public Criteria andAge3IsNotNull() {
            addCriterion("age3 is not null");
            return (Criteria) this;
        }

        public Criteria andAge3EqualTo(Long value) {
            addCriterion("age3 =", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotEqualTo(Long value) {
            addCriterion("age3 <>", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3GreaterThan(Long value) {
            addCriterion("age3 >", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3GreaterThanOrEqualTo(Long value) {
            addCriterion("age3 >=", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3LessThan(Long value) {
            addCriterion("age3 <", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3LessThanOrEqualTo(Long value) {
            addCriterion("age3 <=", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3In(List<Long> values) {
            addCriterion("age3 in", values, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotIn(List<Long> values) {
            addCriterion("age3 not in", values, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3Between(Long value1, Long value2) {
            addCriterion("age3 between", value1, value2, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotBetween(Long value1, Long value2) {
            addCriterion("age3 not between", value1, value2, "age3");
            return (Criteria) this;
        }

        public Criteria andAge4IsNull() {
            addCriterion("age4 is null");
            return (Criteria) this;
        }

        public Criteria andAge4IsNotNull() {
            addCriterion("age4 is not null");
            return (Criteria) this;
        }

        public Criteria andAge4EqualTo(Long value) {
            addCriterion("age4 =", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotEqualTo(Long value) {
            addCriterion("age4 <>", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4GreaterThan(Long value) {
            addCriterion("age4 >", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4GreaterThanOrEqualTo(Long value) {
            addCriterion("age4 >=", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4LessThan(Long value) {
            addCriterion("age4 <", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4LessThanOrEqualTo(Long value) {
            addCriterion("age4 <=", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4In(List<Long> values) {
            addCriterion("age4 in", values, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotIn(List<Long> values) {
            addCriterion("age4 not in", values, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4Between(Long value1, Long value2) {
            addCriterion("age4 between", value1, value2, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotBetween(Long value1, Long value2) {
            addCriterion("age4 not between", value1, value2, "age4");
            return (Criteria) this;
        }

        public Criteria andAge5IsNull() {
            addCriterion("age5 is null");
            return (Criteria) this;
        }

        public Criteria andAge5IsNotNull() {
            addCriterion("age5 is not null");
            return (Criteria) this;
        }

        public Criteria andAge5EqualTo(Long value) {
            addCriterion("age5 =", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotEqualTo(Long value) {
            addCriterion("age5 <>", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5GreaterThan(Long value) {
            addCriterion("age5 >", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5GreaterThanOrEqualTo(Long value) {
            addCriterion("age5 >=", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5LessThan(Long value) {
            addCriterion("age5 <", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5LessThanOrEqualTo(Long value) {
            addCriterion("age5 <=", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5In(List<Long> values) {
            addCriterion("age5 in", values, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotIn(List<Long> values) {
            addCriterion("age5 not in", values, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5Between(Long value1, Long value2) {
            addCriterion("age5 between", value1, value2, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotBetween(Long value1, Long value2) {
            addCriterion("age5 not between", value1, value2, "age5");
            return (Criteria) this;
        }

        public Criteria andAge6IsNull() {
            addCriterion("age6 is null");
            return (Criteria) this;
        }

        public Criteria andAge6IsNotNull() {
            addCriterion("age6 is not null");
            return (Criteria) this;
        }

        public Criteria andAge6EqualTo(Long value) {
            addCriterion("age6 =", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6NotEqualTo(Long value) {
            addCriterion("age6 <>", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6GreaterThan(Long value) {
            addCriterion("age6 >", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6GreaterThanOrEqualTo(Long value) {
            addCriterion("age6 >=", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6LessThan(Long value) {
            addCriterion("age6 <", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6LessThanOrEqualTo(Long value) {
            addCriterion("age6 <=", value, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6In(List<Long> values) {
            addCriterion("age6 in", values, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6NotIn(List<Long> values) {
            addCriterion("age6 not in", values, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6Between(Long value1, Long value2) {
            addCriterion("age6 between", value1, value2, "age6");
            return (Criteria) this;
        }

        public Criteria andAge6NotBetween(Long value1, Long value2) {
            addCriterion("age6 not between", value1, value2, "age6");
            return (Criteria) this;
        }

        public Criteria andAge7IsNull() {
            addCriterion("age7 is null");
            return (Criteria) this;
        }

        public Criteria andAge7IsNotNull() {
            addCriterion("age7 is not null");
            return (Criteria) this;
        }

        public Criteria andAge7EqualTo(Long value) {
            addCriterion("age7 =", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7NotEqualTo(Long value) {
            addCriterion("age7 <>", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7GreaterThan(Long value) {
            addCriterion("age7 >", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7GreaterThanOrEqualTo(Long value) {
            addCriterion("age7 >=", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7LessThan(Long value) {
            addCriterion("age7 <", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7LessThanOrEqualTo(Long value) {
            addCriterion("age7 <=", value, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7In(List<Long> values) {
            addCriterion("age7 in", values, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7NotIn(List<Long> values) {
            addCriterion("age7 not in", values, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7Between(Long value1, Long value2) {
            addCriterion("age7 between", value1, value2, "age7");
            return (Criteria) this;
        }

        public Criteria andAge7NotBetween(Long value1, Long value2) {
            addCriterion("age7 not between", value1, value2, "age7");
            return (Criteria) this;
        }

        public Criteria andAge8IsNull() {
            addCriterion("age8 is null");
            return (Criteria) this;
        }

        public Criteria andAge8IsNotNull() {
            addCriterion("age8 is not null");
            return (Criteria) this;
        }

        public Criteria andAge8EqualTo(Long value) {
            addCriterion("age8 =", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8NotEqualTo(Long value) {
            addCriterion("age8 <>", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8GreaterThan(Long value) {
            addCriterion("age8 >", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8GreaterThanOrEqualTo(Long value) {
            addCriterion("age8 >=", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8LessThan(Long value) {
            addCriterion("age8 <", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8LessThanOrEqualTo(Long value) {
            addCriterion("age8 <=", value, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8In(List<Long> values) {
            addCriterion("age8 in", values, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8NotIn(List<Long> values) {
            addCriterion("age8 not in", values, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8Between(Long value1, Long value2) {
            addCriterion("age8 between", value1, value2, "age8");
            return (Criteria) this;
        }

        public Criteria andAge8NotBetween(Long value1, Long value2) {
            addCriterion("age8 not between", value1, value2, "age8");
            return (Criteria) this;
        }

        public Criteria andAge9IsNull() {
            addCriterion("age9 is null");
            return (Criteria) this;
        }

        public Criteria andAge9IsNotNull() {
            addCriterion("age9 is not null");
            return (Criteria) this;
        }

        public Criteria andAge9EqualTo(Long value) {
            addCriterion("age9 =", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9NotEqualTo(Long value) {
            addCriterion("age9 <>", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9GreaterThan(Long value) {
            addCriterion("age9 >", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9GreaterThanOrEqualTo(Long value) {
            addCriterion("age9 >=", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9LessThan(Long value) {
            addCriterion("age9 <", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9LessThanOrEqualTo(Long value) {
            addCriterion("age9 <=", value, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9In(List<Long> values) {
            addCriterion("age9 in", values, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9NotIn(List<Long> values) {
            addCriterion("age9 not in", values, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9Between(Long value1, Long value2) {
            addCriterion("age9 between", value1, value2, "age9");
            return (Criteria) this;
        }

        public Criteria andAge9NotBetween(Long value1, Long value2) {
            addCriterion("age9 not between", value1, value2, "age9");
            return (Criteria) this;
        }

        public Criteria andAge10IsNull() {
            addCriterion("age10 is null");
            return (Criteria) this;
        }

        public Criteria andAge10IsNotNull() {
            addCriterion("age10 is not null");
            return (Criteria) this;
        }

        public Criteria andAge10EqualTo(Long value) {
            addCriterion("age10 =", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10NotEqualTo(Long value) {
            addCriterion("age10 <>", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10GreaterThan(Long value) {
            addCriterion("age10 >", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10GreaterThanOrEqualTo(Long value) {
            addCriterion("age10 >=", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10LessThan(Long value) {
            addCriterion("age10 <", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10LessThanOrEqualTo(Long value) {
            addCriterion("age10 <=", value, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10In(List<Long> values) {
            addCriterion("age10 in", values, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10NotIn(List<Long> values) {
            addCriterion("age10 not in", values, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10Between(Long value1, Long value2) {
            addCriterion("age10 between", value1, value2, "age10");
            return (Criteria) this;
        }

        public Criteria andAge10NotBetween(Long value1, Long value2) {
            addCriterion("age10 not between", value1, value2, "age10");
            return (Criteria) this;
        }

        public Criteria andAge11IsNull() {
            addCriterion("age11 is null");
            return (Criteria) this;
        }

        public Criteria andAge11IsNotNull() {
            addCriterion("age11 is not null");
            return (Criteria) this;
        }

        public Criteria andAge11EqualTo(Long value) {
            addCriterion("age11 =", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11NotEqualTo(Long value) {
            addCriterion("age11 <>", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11GreaterThan(Long value) {
            addCriterion("age11 >", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11GreaterThanOrEqualTo(Long value) {
            addCriterion("age11 >=", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11LessThan(Long value) {
            addCriterion("age11 <", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11LessThanOrEqualTo(Long value) {
            addCriterion("age11 <=", value, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11In(List<Long> values) {
            addCriterion("age11 in", values, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11NotIn(List<Long> values) {
            addCriterion("age11 not in", values, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11Between(Long value1, Long value2) {
            addCriterion("age11 between", value1, value2, "age11");
            return (Criteria) this;
        }

        public Criteria andAge11NotBetween(Long value1, Long value2) {
            addCriterion("age11 not between", value1, value2, "age11");
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

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
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