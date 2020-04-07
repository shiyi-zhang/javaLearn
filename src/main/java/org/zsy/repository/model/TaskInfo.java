package org.zsy.repository.model;

import java.math.BigDecimal;
import java.util.Date;

public class TaskInfo {
    private Integer id;

    private String name;

    private String taskType;

    private String objs;

    private String objsFrequency;

    private String apps;

    private String appsFrequency;

    private String dataType;

    private String dataPath;

    private Integer dataLength;

    private Date sampleStartTime;

    private Date sampleEndTime;

    private Integer upperLimit;

    private String dataSource;

    private String status;

    private BigDecimal matching;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getObjs() {
        return objs;
    }

    public void setObjs(String objs) {
        this.objs = objs == null ? null : objs.trim();
    }

    public String getObjsFrequency() {
        return objsFrequency;
    }

    public void setObjsFrequency(String objsFrequency) {
        this.objsFrequency = objsFrequency == null ? null : objsFrequency.trim();
    }

    public String getApps() {
        return apps;
    }

    public void setApps(String apps) {
        this.apps = apps == null ? null : apps.trim();
    }

    public String getAppsFrequency() {
        return appsFrequency;
    }

    public void setAppsFrequency(String appsFrequency) {
        this.appsFrequency = appsFrequency == null ? null : appsFrequency.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath == null ? null : dataPath.trim();
    }

    public Integer getDataLength() {
        return dataLength;
    }

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    public Date getSampleStartTime() {
        return sampleStartTime;
    }

    public void setSampleStartTime(Date sampleStartTime) {
        this.sampleStartTime = sampleStartTime;
    }

    public Date getSampleEndTime() {
        return sampleEndTime;
    }

    public void setSampleEndTime(Date sampleEndTime) {
        this.sampleEndTime = sampleEndTime;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getMatching() {
        return matching;
    }

    public void setMatching(BigDecimal matching) {
        this.matching = matching;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}