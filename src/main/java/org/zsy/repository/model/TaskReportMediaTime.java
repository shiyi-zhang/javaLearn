package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.Date;

public class TaskReportMediaTime {
    private Integer id;

    private String code;

    private String appId;

    private Integer pv;

    private Integer uv;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private BigDecimal grow;

    private BigDecimal activeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
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

    public BigDecimal getGrow() {
        return grow;
    }

    public void setGrow(BigDecimal grow) {
        this.grow = grow;
    }

    public BigDecimal getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(BigDecimal activeTime) {
        this.activeTime = activeTime;
    }
}