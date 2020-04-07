package org.zsy.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppStatisticsDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppStatisticsDayExample() {
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

        public Criteria andRankEqualTo(Long value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Long value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Long value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Long value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Long value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Long value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Long> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Long> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Long value1, Long value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Long value1, Long value2) {
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

        public Criteria andTrendEqualTo(Long value) {
            addCriterion("trend =", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotEqualTo(Long value) {
            addCriterion("trend <>", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThan(Long value) {
            addCriterion("trend >", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThanOrEqualTo(Long value) {
            addCriterion("trend >=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThan(Long value) {
            addCriterion("trend <", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThanOrEqualTo(Long value) {
            addCriterion("trend <=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendIn(List<Long> values) {
            addCriterion("trend in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotIn(List<Long> values) {
            addCriterion("trend not in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendBetween(Long value1, Long value2) {
            addCriterion("trend between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotBetween(Long value1, Long value2) {
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

        public Criteria andTotalRankEqualTo(Long value) {
            addCriterion("total_rank =", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotEqualTo(Long value) {
            addCriterion("total_rank <>", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankGreaterThan(Long value) {
            addCriterion("total_rank >", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankGreaterThanOrEqualTo(Long value) {
            addCriterion("total_rank >=", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankLessThan(Long value) {
            addCriterion("total_rank <", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankLessThanOrEqualTo(Long value) {
            addCriterion("total_rank <=", value, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankIn(List<Long> values) {
            addCriterion("total_rank in", values, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotIn(List<Long> values) {
            addCriterion("total_rank not in", values, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankBetween(Long value1, Long value2) {
            addCriterion("total_rank between", value1, value2, "totalRank");
            return (Criteria) this;
        }

        public Criteria andTotalRankNotBetween(Long value1, Long value2) {
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

        public Criteria andTotalTrendEqualTo(Long value) {
            addCriterion("total_trend =", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotEqualTo(Long value) {
            addCriterion("total_trend <>", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendGreaterThan(Long value) {
            addCriterion("total_trend >", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendGreaterThanOrEqualTo(Long value) {
            addCriterion("total_trend >=", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendLessThan(Long value) {
            addCriterion("total_trend <", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendLessThanOrEqualTo(Long value) {
            addCriterion("total_trend <=", value, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendIn(List<Long> values) {
            addCriterion("total_trend in", values, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotIn(List<Long> values) {
            addCriterion("total_trend not in", values, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendBetween(Long value1, Long value2) {
            addCriterion("total_trend between", value1, value2, "totalTrend");
            return (Criteria) this;
        }

        public Criteria andTotalTrendNotBetween(Long value1, Long value2) {
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

        public Criteria andUvEqualTo(Long value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Long value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Long value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Long value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Long value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Long value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Long> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Long> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Long value1, Long value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Long value1, Long value2) {
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

        public Criteria andNuvEqualTo(Long value) {
            addCriterion("nuv =", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotEqualTo(Long value) {
            addCriterion("nuv <>", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvGreaterThan(Long value) {
            addCriterion("nuv >", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvGreaterThanOrEqualTo(Long value) {
            addCriterion("nuv >=", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvLessThan(Long value) {
            addCriterion("nuv <", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvLessThanOrEqualTo(Long value) {
            addCriterion("nuv <=", value, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvIn(List<Long> values) {
            addCriterion("nuv in", values, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotIn(List<Long> values) {
            addCriterion("nuv not in", values, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvBetween(Long value1, Long value2) {
            addCriterion("nuv between", value1, value2, "nuv");
            return (Criteria) this;
        }

        public Criteria andNuvNotBetween(Long value1, Long value2) {
            addCriterion("nuv not between", value1, value2, "nuv");
            return (Criteria) this;
        }

        public Criteria andDayKeepIsNull() {
            addCriterion("day_keep is null");
            return (Criteria) this;
        }

        public Criteria andDayKeepIsNotNull() {
            addCriterion("day_keep is not null");
            return (Criteria) this;
        }

        public Criteria andDayKeepEqualTo(Long value) {
            addCriterion("day_keep =", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepNotEqualTo(Long value) {
            addCriterion("day_keep <>", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepGreaterThan(Long value) {
            addCriterion("day_keep >", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepGreaterThanOrEqualTo(Long value) {
            addCriterion("day_keep >=", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepLessThan(Long value) {
            addCriterion("day_keep <", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepLessThanOrEqualTo(Long value) {
            addCriterion("day_keep <=", value, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepIn(List<Long> values) {
            addCriterion("day_keep in", values, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepNotIn(List<Long> values) {
            addCriterion("day_keep not in", values, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepBetween(Long value1, Long value2) {
            addCriterion("day_keep between", value1, value2, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andDayKeepNotBetween(Long value1, Long value2) {
            addCriterion("day_keep not between", value1, value2, "dayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepIsNull() {
            addCriterion("three_day_keep is null");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepIsNotNull() {
            addCriterion("three_day_keep is not null");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepEqualTo(Long value) {
            addCriterion("three_day_keep =", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepNotEqualTo(Long value) {
            addCriterion("three_day_keep <>", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepGreaterThan(Long value) {
            addCriterion("three_day_keep >", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepGreaterThanOrEqualTo(Long value) {
            addCriterion("three_day_keep >=", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepLessThan(Long value) {
            addCriterion("three_day_keep <", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepLessThanOrEqualTo(Long value) {
            addCriterion("three_day_keep <=", value, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepIn(List<Long> values) {
            addCriterion("three_day_keep in", values, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepNotIn(List<Long> values) {
            addCriterion("three_day_keep not in", values, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepBetween(Long value1, Long value2) {
            addCriterion("three_day_keep between", value1, value2, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andThreeDayKeepNotBetween(Long value1, Long value2) {
            addCriterion("three_day_keep not between", value1, value2, "threeDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepIsNull() {
            addCriterion("seven_day_keep is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepIsNotNull() {
            addCriterion("seven_day_keep is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepEqualTo(Long value) {
            addCriterion("seven_day_keep =", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepNotEqualTo(Long value) {
            addCriterion("seven_day_keep <>", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepGreaterThan(Long value) {
            addCriterion("seven_day_keep >", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepGreaterThanOrEqualTo(Long value) {
            addCriterion("seven_day_keep >=", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepLessThan(Long value) {
            addCriterion("seven_day_keep <", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepLessThanOrEqualTo(Long value) {
            addCriterion("seven_day_keep <=", value, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepIn(List<Long> values) {
            addCriterion("seven_day_keep in", values, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepNotIn(List<Long> values) {
            addCriterion("seven_day_keep not in", values, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepBetween(Long value1, Long value2) {
            addCriterion("seven_day_keep between", value1, value2, "sevenDayKeep");
            return (Criteria) this;
        }

        public Criteria andSevenDayKeepNotBetween(Long value1, Long value2) {
            addCriterion("seven_day_keep not between", value1, value2, "sevenDayKeep");
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

        public Criteria andActiveRateEqualTo(Double value) {
            addCriterion("active_rate =", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotEqualTo(Double value) {
            addCriterion("active_rate <>", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateGreaterThan(Double value) {
            addCriterion("active_rate >", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateGreaterThanOrEqualTo(Double value) {
            addCriterion("active_rate >=", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateLessThan(Double value) {
            addCriterion("active_rate <", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateLessThanOrEqualTo(Double value) {
            addCriterion("active_rate <=", value, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateIn(List<Double> values) {
            addCriterion("active_rate in", values, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotIn(List<Double> values) {
            addCriterion("active_rate not in", values, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateBetween(Double value1, Double value2) {
            addCriterion("active_rate between", value1, value2, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveRateNotBetween(Double value1, Double value2) {
            addCriterion("active_rate not between", value1, value2, "activeRate");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Integer value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Integer value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Integer value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Integer value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Integer> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Integer> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Integer value1, Integer value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(Integer value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(Integer value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(Integer value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(Integer value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<Integer> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<Integer> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(Integer value1, Integer value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("download not between", value1, value2, "download");
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