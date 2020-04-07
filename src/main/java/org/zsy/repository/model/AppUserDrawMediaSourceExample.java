package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppUserDrawMediaSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUserDrawMediaSourceExample() {
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

        public Criteria andDrawIdIsNull() {
            addCriterion("draw_id is null");
            return (Criteria) this;
        }

        public Criteria andDrawIdIsNotNull() {
            addCriterion("draw_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrawIdEqualTo(String value) {
            addCriterion("draw_id =", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdNotEqualTo(String value) {
            addCriterion("draw_id <>", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdGreaterThan(String value) {
            addCriterion("draw_id >", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("draw_id >=", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdLessThan(String value) {
            addCriterion("draw_id <", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdLessThanOrEqualTo(String value) {
            addCriterion("draw_id <=", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdLike(String value) {
            addCriterion("draw_id like", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdNotLike(String value) {
            addCriterion("draw_id not like", value, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdIn(List<String> values) {
            addCriterion("draw_id in", values, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdNotIn(List<String> values) {
            addCriterion("draw_id not in", values, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdBetween(String value1, String value2) {
            addCriterion("draw_id between", value1, value2, "drawId");
            return (Criteria) this;
        }

        public Criteria andDrawIdNotBetween(String value1, String value2) {
            addCriterion("draw_id not between", value1, value2, "drawId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdIsNull() {
            addCriterion("s_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andSChannelIdIsNotNull() {
            addCriterion("s_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andSChannelIdEqualTo(String value) {
            addCriterion("s_channel_id =", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdNotEqualTo(String value) {
            addCriterion("s_channel_id <>", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdGreaterThan(String value) {
            addCriterion("s_channel_id >", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_channel_id >=", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdLessThan(String value) {
            addCriterion("s_channel_id <", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdLessThanOrEqualTo(String value) {
            addCriterion("s_channel_id <=", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdLike(String value) {
            addCriterion("s_channel_id like", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdNotLike(String value) {
            addCriterion("s_channel_id not like", value, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdIn(List<String> values) {
            addCriterion("s_channel_id in", values, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdNotIn(List<String> values) {
            addCriterion("s_channel_id not in", values, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdBetween(String value1, String value2) {
            addCriterion("s_channel_id between", value1, value2, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andSChannelIdNotBetween(String value1, String value2) {
            addCriterion("s_channel_id not between", value1, value2, "sChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdIsNull() {
            addCriterion("w_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andWChannelIdIsNotNull() {
            addCriterion("w_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andWChannelIdEqualTo(String value) {
            addCriterion("w_channel_id =", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdNotEqualTo(String value) {
            addCriterion("w_channel_id <>", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdGreaterThan(String value) {
            addCriterion("w_channel_id >", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("w_channel_id >=", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdLessThan(String value) {
            addCriterion("w_channel_id <", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdLessThanOrEqualTo(String value) {
            addCriterion("w_channel_id <=", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdLike(String value) {
            addCriterion("w_channel_id like", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdNotLike(String value) {
            addCriterion("w_channel_id not like", value, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdIn(List<String> values) {
            addCriterion("w_channel_id in", values, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdNotIn(List<String> values) {
            addCriterion("w_channel_id not in", values, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdBetween(String value1, String value2) {
            addCriterion("w_channel_id between", value1, value2, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andWChannelIdNotBetween(String value1, String value2) {
            addCriterion("w_channel_id not between", value1, value2, "wChannelId");
            return (Criteria) this;
        }

        public Criteria andValIsNull() {
            addCriterion("val is null");
            return (Criteria) this;
        }

        public Criteria andValIsNotNull() {
            addCriterion("val is not null");
            return (Criteria) this;
        }

        public Criteria andValEqualTo(BigDecimal value) {
            addCriterion("val =", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotEqualTo(BigDecimal value) {
            addCriterion("val <>", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThan(BigDecimal value) {
            addCriterion("val >", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("val >=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThan(BigDecimal value) {
            addCriterion("val <", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("val <=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValIn(List<BigDecimal> values) {
            addCriterion("val in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValNotIn(List<BigDecimal> values) {
            addCriterion("val not in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("val between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("val not between", value1, value2, "val");
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