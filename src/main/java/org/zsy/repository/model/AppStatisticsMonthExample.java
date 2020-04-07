package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppStatisticsMonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppStatisticsMonthExample() {
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

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andTrendIsNull() {
            addCriterion("trend is null");
            return (Criteria) this;
        }

        public Criteria andTrendIsNotNull() {
            addCriterion("trend is not null");
            return (Criteria) this;
        }

        public Criteria andTrendEqualTo(Integer value) {
            addCriterion("trend =", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotEqualTo(Integer value) {
            addCriterion("trend <>", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThan(Integer value) {
            addCriterion("trend >", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThanOrEqualTo(Integer value) {
            addCriterion("trend >=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThan(Integer value) {
            addCriterion("trend <", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThanOrEqualTo(Integer value) {
            addCriterion("trend <=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendIn(List<Integer> values) {
            addCriterion("trend in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotIn(List<Integer> values) {
            addCriterion("trend not in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendBetween(Integer value1, Integer value2) {
            addCriterion("trend between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotBetween(Integer value1, Integer value2) {
            addCriterion("trend not between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTotalRankIsNull() {
            addCriterion("total_rank is null");
            return (Criteria) this;
        }

        public Criteria andTotalRankIsNotNull() {
            addCriterion("total_rank is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRankEqualTo(Integer value) {
            addCriterion("total_rank =", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotEqualTo(Integer value) {
            addCriterion("total_rank <>", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankGreaterThan(Integer value) {
            addCriterion("total_rank >", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_rank >=", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankLessThan(Integer value) {
            addCriterion("total_rank <", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankLessThanOrEqualTo(Integer value) {
            addCriterion("total_rank <=", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankIn(List<Integer> values) {
            addCriterion("total_rank in", values, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotIn(List<Integer> values) {
            addCriterion("total_rank not in", values, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankBetween(Integer value1, Integer value2) {
            addCriterion("total_rank between", value1, value2, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotBetween(Integer value1, Integer value2) {
            addCriterion("total_rank not between", value1, value2, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalTrendIsNull() {
            addCriterion("total_trend is null");
            return (Criteria) this;
        }

        public Criteria andTotalTrendIsNotNull() {
            addCriterion("total_trend is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTrendEqualTo(Integer value) {
            addCriterion("total_trend =", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotEqualTo(Integer value) {
            addCriterion("total_trend <>", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendGreaterThan(Integer value) {
            addCriterion("total_trend >", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_trend >=", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendLessThan(Integer value) {
            addCriterion("total_trend <", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendLessThanOrEqualTo(Integer value) {
            addCriterion("total_trend <=", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendIn(List<Integer> values) {
            addCriterion("total_trend in", values, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotIn(List<Integer> values) {
            addCriterion("total_trend not in", values, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendBetween(Integer value1, Integer value2) {
            addCriterion("total_trend between", value1, value2, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotBetween(Integer value1, Integer value2) {
            addCriterion("total_trend not between", value1, value2, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Long value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Long value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Long value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Long value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Long value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Long value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Long> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Long> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Long value1, Long value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Long value1, Long value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("uv is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("uv is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Integer value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Integer value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Integer value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Integer value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Integer value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Integer> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Integer> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Integer value1, Integer value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Integer value1, Integer value2) {
            addCriterion("uv not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andNuvIsNull() {
            addCriterion("nuv is null");
            return (Criteria) this;
        }

        public Criteria andNuvIsNotNull() {
            addCriterion("nuv is not null");
            return (Criteria) this;
        }

        public Criteria andNuvEqualTo(Integer value) {
            addCriterion("nuv =", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotEqualTo(Integer value) {
            addCriterion("nuv <>", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvGreaterThan(Integer value) {
            addCriterion("nuv >", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvGreaterThanOrEqualTo(Integer value) {
            addCriterion("nuv >=", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvLessThan(Integer value) {
            addCriterion("nuv <", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvLessThanOrEqualTo(Integer value) {
            addCriterion("nuv <=", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvIn(List<Integer> values) {
            addCriterion("nuv in", values, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotIn(List<Integer> values) {
            addCriterion("nuv not in", values, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvBetween(Integer value1, Integer value2) {
            addCriterion("nuv between", value1, value2, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotBetween(Integer value1, Integer value2) {
            addCriterion("nuv not between", value1, value2, "nuv");
            return (Criteria) this;
        }

        public Criteria andKeepIsNull() {
            addCriterion("keep is null");
            return (Criteria) this;
        }

        public Criteria andKeepIsNotNull() {
            addCriterion("keep is not null");
            return (Criteria) this;
        }

        public Criteria andKeepEqualTo(Integer value) {
            addCriterion("keep =", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepNotEqualTo(Integer value) {
            addCriterion("keep <>", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepGreaterThan(Integer value) {
            addCriterion("keep >", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepGreaterThanOrEqualTo(Integer value) {
            addCriterion("keep >=", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepLessThan(Integer value) {
            addCriterion("keep <", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepLessThanOrEqualTo(Integer value) {
            addCriterion("keep <=", value, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepIn(List<Integer> values) {
            addCriterion("keep in", values, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepNotIn(List<Integer> values) {
            addCriterion("keep not in", values, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepBetween(Integer value1, Integer value2) {
            addCriterion("keep between", value1, value2, "keep");
            return (Criteria) this;
        }

        public Criteria andKeepNotBetween(Integer value1, Integer value2) {
            addCriterion("keep not between", value1, value2, "keep");
            return (Criteria) this;
        }

        public Criteria andActiveRateIsNull() {
            addCriterion("active_rate is null");
            return (Criteria) this;
        }

        public Criteria andActiveRateIsNotNull() {
            addCriterion("active_rate is not null");
            return (Criteria) this;
        }

        public Criteria andActiveRateEqualTo(BigDecimal value) {
            addCriterion("active_rate =", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotEqualTo(BigDecimal value) {
            addCriterion("active_rate <>", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateGreaterThan(BigDecimal value) {
            addCriterion("active_rate >", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("active_rate >=", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateLessThan(BigDecimal value) {
            addCriterion("active_rate <", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("active_rate <=", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateIn(List<BigDecimal> values) {
            addCriterion("active_rate in", values, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotIn(List<BigDecimal> values) {
            addCriterion("active_rate not in", values, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("active_rate between", value1, value2, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("active_rate not between", value1, value2, "activeRate");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeIsNull() {
            addCriterion("month_active_time is null");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeIsNotNull() {
            addCriterion("month_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeEqualTo(Integer value) {
            addCriterion("month_active_time =", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeNotEqualTo(Integer value) {
            addCriterion("month_active_time <>", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGreaterThan(Integer value) {
            addCriterion("month_active_time >", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_active_time >=", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeLessThan(Integer value) {
            addCriterion("month_active_time <", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("month_active_time <=", value, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeIn(List<Integer> values) {
            addCriterion("month_active_time in", values, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeNotIn(List<Integer> values) {
            addCriterion("month_active_time not in", values, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeBetween(Integer value1, Integer value2) {
            addCriterion("month_active_time between", value1, value2, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("month_active_time not between", value1, value2, "monthActiveTime");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowIsNull() {
            addCriterion("month_active_time_grow is null");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowIsNotNull() {
            addCriterion("month_active_time_grow is not null");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowEqualTo(String value) {
            addCriterion("month_active_time_grow =", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowNotEqualTo(String value) {
            addCriterion("month_active_time_grow <>", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowGreaterThan(String value) {
            addCriterion("month_active_time_grow >", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowGreaterThanOrEqualTo(String value) {
            addCriterion("month_active_time_grow >=", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowLessThan(String value) {
            addCriterion("month_active_time_grow <", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowLessThanOrEqualTo(String value) {
            addCriterion("month_active_time_grow <=", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowLike(String value) {
            addCriterion("month_active_time_grow like", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowNotLike(String value) {
            addCriterion("month_active_time_grow not like", value, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowIn(List<String> values) {
            addCriterion("month_active_time_grow in", values, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowNotIn(List<String> values) {
            addCriterion("month_active_time_grow not in", values, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowBetween(String value1, String value2) {
            addCriterion("month_active_time_grow between", value1, value2, "monthActiveTimeGrow");
            return (Criteria) this;
        }

        public Criteria andMonthActiveTimeGrowNotBetween(String value1, String value2) {
            addCriterion("month_active_time_grow not between", value1, value2, "monthActiveTimeGrow");
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