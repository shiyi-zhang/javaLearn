package org.zsy.repository.model;

import java.util.Date;

public class AppInfoCompetitor {
    private String appId;

    private String competitorId;

    private Double grow;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(String competitorId) {
        this.competitorId = competitorId == null ? null : competitorId.trim();
    }

    public Double getGrow() {
        return grow;
    }

    public void setGrow(Double grow) {
        this.grow = grow;
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