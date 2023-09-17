package com.example.team.service;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 20:23
 */
public enum Status {
    FREE("空闲"),
    BUSY("已加入开发团队"),
    VOCATION("正在休假");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
