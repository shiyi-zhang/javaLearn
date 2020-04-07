package org.zsy.repository.model;

import java.util.Date;

public class AppStatisticsDay {
    private String id;

    private Date getTime;

    private Long rank;

    private Long trend;

    private Long totalRank;

    private Long totalTrend;

    private Long pv;

    private Long uv;

    private Long nuv;

    private Long dayKeep;

    private Long threeDayKeep;

    private Long sevenDayKeep;

    private Double activeRate;

    private Integer activeTime;

    private Integer download;

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

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getTrend() {
        return trend;
    }

    public void setTrend(Long trend) {
        this.trend = trend;
    }

    public Long getTotalRank() {
        return totalRank;
    }

    public void setTotalRank(Long totalRank) {
        this.totalRank = totalRank;
    }

    public Long getTotalTrend() {
        return totalTrend;
    }

    public void setTotalTrend(Long totalTrend) {
        this.totalTrend = totalTrend;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Long getUv() {
        return uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    public Long getNuv() {
        return nuv;
    }

    public void setNuv(Long nuv) {
        this.nuv = nuv;
    }

    public Long getDayKeep() {
        return dayKeep;
    }

    public void setDayKeep(Long dayKeep) {
        this.dayKeep = dayKeep;
    }

    public Long getThreeDayKeep() {
        return threeDayKeep;
    }

    public void setThreeDayKeep(Long threeDayKeep) {
        this.threeDayKeep = threeDayKeep;
    }

    public Long getSevenDayKeep() {
        return sevenDayKeep;
    }

    public void setSevenDayKeep(Long sevenDayKeep) {
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