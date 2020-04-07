package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.Date;

public class AppUserDrawMediaSource {
    private String id;

    private String drawId;

    private String sChannelId;

    private String wChannelId;

    private BigDecimal val;

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

    public String getDrawId() {
        return drawId;
    }

    public void setDrawId(String drawId) {
        this.drawId = drawId == null ? null : drawId.trim();
    }

    public String getsChannelId() {
        return sChannelId;
    }

    public void setsChannelId(String sChannelId) {
        this.sChannelId = sChannelId == null ? null : sChannelId.trim();
    }

    public String getwChannelId() {
        return wChannelId;
    }

    public void setwChannelId(String wChannelId) {
        this.wChannelId = wChannelId == null ? null : wChannelId.trim();
    }

    public BigDecimal getVal() {
        return val;
    }

    public void setVal(BigDecimal val) {
        this.val = val;
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