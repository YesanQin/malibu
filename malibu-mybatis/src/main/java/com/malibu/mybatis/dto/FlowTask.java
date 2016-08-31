package com.malibu.mybatis.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by qinyisheng on 16/8/31.
 */
//@Data
public class FlowTask {
    private int taskModelId;
    private int parentTaskId;
    private int taskType;
    private int flowModelId;
    private Date gmtCreate;
    private Date gmtModify;
    private int isDeleted;
    private String addUser;

    public void setTaskModelId(int taskModelId) {
        this.taskModelId = taskModelId;
    }

    public void setParentTaskId(int parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public void setFlowModelId(int flowModelId) {
        this.flowModelId = flowModelId;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public int getTaskModelId() {
        return taskModelId;
    }

    public int getParentTaskId() {
        return parentTaskId;
    }

    public int getTaskType() {
        return taskType;
    }

    public int getFlowModelId() {
        return flowModelId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public String getAddUser() {
        return addUser;
    }

    @Override
    public String toString() {
        return "FlowTask{" +
                "taskModelId=" + taskModelId +
                ", parentTaskId=" + parentTaskId +
                ", taskType=" + taskType +
                ", flowModelId=" + flowModelId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", isDeleted=" + isDeleted +
                ", addUser='" + addUser + '\'' +
                '}';
    }
}
