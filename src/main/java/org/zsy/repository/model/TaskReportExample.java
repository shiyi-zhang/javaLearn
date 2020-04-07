package org.zsy.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskReportExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdIsNull() {
            addCriterion("dimension_id is null");
            return (Criteria) this;
        }

        public Criteria andDimensionIdIsNotNull() {
            addCriterion("dimension_id is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionIdEqualTo(String value) {
            addCriterion("dimension_id =", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdNotEqualTo(String value) {
            addCriterion("dimension_id <>", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdGreaterThan(String value) {
            addCriterion("dimension_id >", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdGreaterThanOrEqualTo(String value) {
            addCriterion("dimension_id >=", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdLessThan(String value) {
            addCriterion("dimension_id <", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdLessThanOrEqualTo(String value) {
            addCriterion("dimension_id <=", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdLike(String value) {
            addCriterion("dimension_id like", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdNotLike(String value) {
            addCriterion("dimension_id not like", value, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdIn(List<String> values) {
            addCriterion("dimension_id in", values, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdNotIn(List<String> values) {
            addCriterion("dimension_id not in", values, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdBetween(String value1, String value2) {
            addCriterion("dimension_id between", value1, value2, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionIdNotBetween(String value1, String value2) {
            addCriterion("dimension_id not between", value1, value2, "dimensionId");
            return (Criteria) this;
        }

        public Criteria andDimensionContentIsNull() {
            addCriterion("dimension_content is null");
            return (Criteria) this;
        }

        public Criteria andDimensionContentIsNotNull() {
            addCriterion("dimension_content is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionContentEqualTo(String value) {
            addCriterion("dimension_content =", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentNotEqualTo(String value) {
            addCriterion("dimension_content <>", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentGreaterThan(String value) {
            addCriterion("dimension_content >", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentGreaterThanOrEqualTo(String value) {
            addCriterion("dimension_content >=", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentLessThan(String value) {
            addCriterion("dimension_content <", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentLessThanOrEqualTo(String value) {
            addCriterion("dimension_content <=", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentLike(String value) {
            addCriterion("dimension_content like", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentNotLike(String value) {
            addCriterion("dimension_content not like", value, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentIn(List<String> values) {
            addCriterion("dimension_content in", values, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentNotIn(List<String> values) {
            addCriterion("dimension_content not in", values, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentBetween(String value1, String value2) {
            addCriterion("dimension_content between", value1, value2, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andDimensionContentNotBetween(String value1, String value2) {
            addCriterion("dimension_content not between", value1, value2, "dimensionContent");
            return (Criteria) this;
        }

        public Criteria andUntitledIsNull() {
            addCriterion("untitled is null");
            return (Criteria) this;
        }

        public Criteria andUntitledIsNotNull() {
            addCriterion("untitled is not null");
            return (Criteria) this;
        }

        public Criteria andUntitledEqualTo(String value) {
            addCriterion("untitled =", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotEqualTo(String value) {
            addCriterion("untitled <>", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledGreaterThan(String value) {
            addCriterion("untitled >", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledGreaterThanOrEqualTo(String value) {
            addCriterion("untitled >=", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLessThan(String value) {
            addCriterion("untitled <", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLessThanOrEqualTo(String value) {
            addCriterion("untitled <=", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLike(String value) {
            addCriterion("untitled like", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotLike(String value) {
            addCriterion("untitled not like", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledIn(List<String> values) {
            addCriterion("untitled in", values, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotIn(List<String> values) {
            addCriterion("untitled not in", values, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledBetween(String value1, String value2) {
            addCriterion("untitled between", value1, value2, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotBetween(String value1, String value2) {
            addCriterion("untitled not between", value1, value2, "untitled");
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