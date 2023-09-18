package com.example.team.service;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 20:23
 */
public enum Status {
    FREE("FREE","空闲"),
    BUSY("BUSY","已加入开发团队"),
    VOCATION("VOCATION","正在休假");
    private final String name;
    private final String description;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


    Status(String name,String description) {
        this.name = name;
        this.description = description;
    }


}
