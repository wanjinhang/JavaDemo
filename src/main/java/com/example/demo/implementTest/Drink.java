package com.example.demo.implementTest;

public enum Drink {

    WATER("白开水","1"),
    TEA("茶","5");
    private final String name;
    private final String price;

    Drink(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name+this.price;
    }
}

