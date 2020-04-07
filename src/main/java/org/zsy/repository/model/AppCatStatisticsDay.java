package org.zsy.repository.model;

import java.util.Date;

public class AppCatStatisticsDay {
    private String id;

    private Date getTime;

    private Long pv;

    private Long uv;

    private Long nuv;

    private Double activeRate;

    private Double activeTime;

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

    public Double getActiveRate() {
        return activeRate;
    }

    public void setActiveRate(Double activeRate) {
        this.activeRate = activeRate;
    }

    public Double getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Double activeTime) {
        this.activeTime = activeTime;
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