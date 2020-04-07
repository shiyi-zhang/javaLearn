package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppUserDrawRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUserDrawRegionExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Long value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Long value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Long value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Long value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Long value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Long> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Long> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Long value1, Long value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Long value1, Long value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
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