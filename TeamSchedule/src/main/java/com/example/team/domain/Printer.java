package com.example.team.domain;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 17:52
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "%s(%s)".formatted(getName(), getType());
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
