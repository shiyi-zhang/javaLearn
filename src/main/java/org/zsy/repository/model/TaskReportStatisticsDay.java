package org.zsy.repository.model;

import java.util.Date;

public class TaskReportStatisticsDay {
    private Integer id;

    private Date getTime;

    private String appId;

    private Integer rank;

    private Integer trend;

    private Integer totalRank;

    private Integer totalTrend;

    private Integer pv;

    private Integer uv;

    private Integer nuv;

    private Integer dayKeep;

    private Integer threeDayKeep;

    private Integer sevenDayKeep;

    private Double activeRate;

    private Integer activeTime;

    private Integer download;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
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

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
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

    public Integer getDayKeep() {
        return dayKeep;
    }

    public void setDayKeep(Integer dayKeep) {
        this.dayKeep = dayKeep;
    }

    public Integer getThreeDayKeep() {
        return threeDayKeep;
    }

    public void setThreeDayKeep(Integer threeDayKeep) {
        this.threeDayKeep = threeDayKeep;
    }

    public Integer getSevenDayKeep() {
        return sevenDayKeep;
    }

    public void setSevenDayKeep(Integer sevenDayKeep) {
        this.sevenDayKeep = sevenDayKeep;
    }

    public Double getActiveRate() {
        return activeRate;
    }

    public void setActiveRate(Double activeRate) {
        this.activeRate = activeRate;
    }

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
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