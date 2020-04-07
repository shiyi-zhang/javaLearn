package org.zsy.repository.model;

import java.util.Date;

public class TaskReport {
    private String taskId;

    private String dimensionId;

    private String dimensionContent;

    private String untitled;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId == null ? null : dimensionId.trim();
    }

    public String getDimensionContent() {
        return dimensionContent;
    }

    public void setDimensionContent(String dimensionContent) {
        this.dimensionContent = dimensionContent == null ? null : dimensionContent.trim();
    }

    public String getUntitled() {
        return untitled;
    }

    public void setUntitled(String untitled) {
        this.untitled = untitled == null ? null : untitled.trim();
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