package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.Date;

public class AppStatisticsMonth {
    private String id;

    private Date getTime;

    private Integer rank;

    private Integer trend;

    private Integer totalRank;

    private Integer totalTrend;

    private Long pv;

    private Integer uv;

    private Integer nuv;

    private Integer keep;

    private BigDecimal activeRate;

    private Integer monthActiveTime;

    private String monthActiveTimeGrow;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getTrend() {
        return trend;
    }

    public void setTrend(Integer trend) {
        this.trend = trend;
    }

    public Integer getTotalRank() {
        return totalRank;
    }

    public void setTotalRank(Integer totalRank) {
        this.totalRank = totalRank;
    }

    public Integer getTotalTrend() {
        return totalTrend;
    }

    public void setTotalTrend(Integer totalTrend) {
        this.totalTrend = totalTrend;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getNuv() {
        return nuv;
    }

    public void setNuv(Integer nuv) {
        this.nuv = nuv;
    }

    public Integer getKeep() {
        return keep;
    }

    public void setKeep(Integer keep) {
        this.keep = keep;
    }

    public BigDecimal getActiveRate() {
        return activeRate;
    }

    public void setActiveRate(BigDecimal activeRate) {
        this.activeRate = activeRate;
    }

    public Integer getMonthActiveTime() {
        return monthActiveTime;
    }

    public void setMonthActiveTime(Integer monthActiveTime) {
        this.monthActiveTime = monthActiveTime;
    }

    public String getMonthActiveTimeGrow() {
        return monthActiveTimeGrow;
    }

    public void setMonthActiveTimeGrow(String monthActiveTimeGrow) {
        this.monthActiveTimeGrow = monthActiveTimeGrow == null ? null : monthActiveTimeGrow.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}