package com.example.team.domain;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 17:47
 */
public class NoteBook implements Equipment{
    private String model;
    private int price;
    @Override
    public String getDescription() {
        return "%s(%s)".formatted(getModel(), getPrice());
    }

    public NoteBook(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
