package com.example.team.domain;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 17:29
 */
public class PC implements Equipment{
    private String model;
    private String display;

    @Override
    public String getDescription() {
        return "%s(%s)".formatted(getModel(), getDisplay());
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
