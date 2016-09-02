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
    private String addUser;

    public void setTaskModelId(int taskModelId) {
        this.taskModelId = taskModelId;
    }

    public void setParentTaskId(int parentTaskId) {
        this.parentTaskId = parentTaskId;
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


    public String getAddUser() {
        return addUser;
    }
}
