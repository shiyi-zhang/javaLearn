package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andObjsIsNull() {
            addCriterion("objs is null");
            return (Criteria) this;
        }

        public Criteria andObjsIsNotNull() {
            addCriterion("objs is not null");
            return (Criteria) this;
        }

        public Criteria andObjsEqualTo(String value) {
            addCriterion("objs =", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsNotEqualTo(String value) {
            addCriterion("objs <>", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsGreaterThan(String value) {
            addCriterion("objs >", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsGreaterThanOrEqualTo(String value) {
            addCriterion("objs >=", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsLessThan(String value) {
            addCriterion("objs <", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsLessThanOrEqualTo(String value) {
            addCriterion("objs <=", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsLike(String value) {
            addCriterion("objs like", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsNotLike(String value) {
            addCriterion("objs not like", value, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsIn(List<String> values) {
            addCriterion("objs in", values, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsNotIn(List<String> values) {
            addCriterion("objs not in", values, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsBetween(String value1, String value2) {
            addCriterion("objs between", value1, value2, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsNotBetween(String value1, String value2) {
            addCriterion("objs not between", value1, value2, "objs");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyIsNull() {
            addCriterion("objs_frequency is null");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyIsNotNull() {
            addCriterion("objs_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyEqualTo(String value) {
            addCriterion("objs_frequency =", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyNotEqualTo(String value) {
            addCriterion("objs_frequency <>", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyGreaterThan(String value) {
            addCriterion("objs_frequency >", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("objs_frequency >=", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyLessThan(String value) {
            addCriterion("objs_frequency <", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyLessThanOrEqualTo(String value) {
            addCriterion("objs_frequency <=", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyLike(String value) {
            addCriterion("objs_frequency like", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyNotLike(String value) {
            addCriterion("objs_frequency not like", value, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyIn(List<String> values) {
            addCriterion("objs_frequency in", values, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyNotIn(List<String> values) {
            addCriterion("objs_frequency not in", values, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyBetween(String value1, String value2) {
            addCriterion("objs_frequency between", value1, value2, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andObjsFrequencyNotBetween(String value1, String value2) {
            addCriterion("objs_frequency not between", value1, value2, "objsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsIsNull() {
            addCriterion("apps is null");
            return (Criteria) this;
        }

        public Criteria andAppsIsNotNull() {
            addCriterion("apps is not null");
            return (Criteria) this;
        }

        public Criteria andAppsEqualTo(String value) {
            addCriterion("apps =", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsNotEqualTo(String value) {
            addCriterion("apps <>", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsGreaterThan(String value) {
            addCriterion("apps >", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsGreaterThanOrEqualTo(String value) {
            addCriterion("apps >=", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsLessThan(String value) {
            addCriterion("apps <", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsLessThanOrEqualTo(String value) {
            addCriterion("apps <=", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsLike(String value) {
            addCriterion("apps like", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsNotLike(String value) {
            addCriterion("apps not like", value, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsIn(List<String> values) {
            addCriterion("apps in", values, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsNotIn(List<String> values) {
            addCriterion("apps not in", values, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsBetween(String value1, String value2) {
            addCriterion("apps between", value1, value2, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsNotBetween(String value1, String value2) {
            addCriterion("apps not between", value1, value2, "apps");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyIsNull() {
            addCriterion("apps_frequency is null");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyIsNotNull() {
            addCriterion("apps_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyEqualTo(String value) {
            addCriterion("apps_frequency =", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyNotEqualTo(String value) {
            addCriterion("apps_frequency <>", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyGreaterThan(String value) {
            addCriterion("apps_frequency >", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("apps_frequency >=", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyLessThan(String value) {
            addCriterion("apps_frequency <", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyLessThanOrEqualTo(String value) {
            addCriterion("apps_frequency <=", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyLike(String value) {
            addCriterion("apps_frequency like", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyNotLike(String value) {
            addCriterion("apps_frequency not like", value, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyIn(List<String> values) {
            addCriterion("apps_frequency in", values, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyNotIn(List<String> values) {
            addCriterion("apps_frequency not in", values, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyBetween(String value1, String value2) {
            addCriterion("apps_frequency between", value1, value2, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andAppsFrequencyNotBetween(String value1, String value2) {
            addCriterion("apps_frequency not between", value1, value2, "appsFrequency");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataPathIsNull() {
            addCriterion("data_path is null");
            return (Criteria) this;
        }

        public Criteria andDataPathIsNotNull() {
            addCriterion("data_path is not null");
            return (Criteria) this;
        }

        public Criteria andDataPathEqualTo(String value) {
            addCriterion("data_path =", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathNotEqualTo(String value) {
            addCriterion("data_path <>", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathGreaterThan(String value) {
            addCriterion("data_path >", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathGreaterThanOrEqualTo(String value) {
            addCriterion("data_path >=", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathLessThan(String value) {
            addCriterion("data_path <", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathLessThanOrEqualTo(String value) {
            addCriterion("data_path <=", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathLike(String value) {
            addCriterion("data_path like", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathNotLike(String value) {
            addCriterion("data_path not like", value, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathIn(List<String> values) {
            addCriterion("data_path in", values, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathNotIn(List<String> values) {
            addCriterion("data_path not in", values, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathBetween(String value1, String value2) {
            addCriterion("data_path between", value1, value2, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataPathNotBetween(String value1, String value2) {
            addCriterion("data_path not between", value1, value2, "dataPath");
            return (Criteria) this;
        }

        public Criteria andDataLengthIsNull() {
            addCriterion("data_length is null");
            return (Criteria) this;
        }

        public Criteria andDataLengthIsNotNull() {
            addCriterion("data_length is not null");
            return (Criteria) this;
        }

        public Criteria andDataLengthEqualTo(Integer value) {
            addCriterion("data_length =", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotEqualTo(Integer value) {
            addCriterion("data_length <>", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthGreaterThan(Integer value) {
            addCriterion("data_length >", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_length >=", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthLessThan(Integer value) {
            addCriterion("data_length <", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthLessThanOrEqualTo(Integer value) {
            addCriterion("data_length <=", value, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthIn(List<Integer> values) {
            addCriterion("data_length in", values, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotIn(List<Integer> values) {
            addCriterion("data_length not in", values, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthBetween(Integer value1, Integer value2) {
            addCriterion("data_length between", value1, value2, "dataLength");
            return (Criteria) this;
        }

        public Criteria andDataLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("data_length not between", value1, value2, "dataLength");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeIsNull() {
            addCriterion("sample_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeIsNotNull() {
            addCriterion("sample_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sample_start_time =", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sample_start_time <>", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sample_start_time >", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_start_time >=", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("sample_start_time <", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_start_time <=", value, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sample_start_time in", values, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sample_start_time not in", values, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_start_time between", value1, value2, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_start_time not between", value1, value2, "sampleStartTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeIsNull() {
            addCriterion("sample_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeIsNotNull() {
            addCriterion("sample_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sample_end_time =", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sample_end_time <>", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sample_end_time >", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_end_time >=", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("sample_end_time <", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sample_end_time <=", value, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sample_end_time in", values, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sample_end_time not in", values, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_end_time between", value1, value2, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andSampleEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sample_end_time not between", value1, value2, "sampleEndTime");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("upper_limit is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("upper_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(Integer value) {
            addCriterion("upper_limit =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(Integer value) {
            addCriterion("upper_limit <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(Integer value) {
            addCriterion("upper_limit >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("upper_limit >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(Integer value) {
            addCriterion("upper_limit <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(Integer value) {
            addCriterion("upper_limit <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<Integer> values) {
            addCriterion("upper_limit in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<Integer> values) {
            addCriterion("upper_limit not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMatchingIsNull() {
            addCriterion("matching is null");
            return (Criteria) this;
        }

        public Criteria andMatchingIsNotNull() {
            addCriterion("matching is not null");
            return (Criteria) this;
        }

        public Criteria andMatchingEqualTo(BigDecimal value) {
            addCriterion("matching =", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingNotEqualTo(BigDecimal value) {
            addCriterion("matching <>", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingGreaterThan(BigDecimal value) {
            addCriterion("matching >", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("matching >=", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingLessThan(BigDecimal value) {
            addCriterion("matching <", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("matching <=", value, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingIn(List<BigDecimal> values) {
            addCriterion("matching in", values, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingNotIn(List<BigDecimal> values) {
            addCriterion("matching not in", values, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("matching between", value1, value2, "matching");
            return (Criteria) this;
        }

        public Criteria andMatchingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("matching not between", value1, value2, "matching");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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