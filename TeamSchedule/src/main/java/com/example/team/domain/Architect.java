package com.example.team.domain;/**
 * @author wansui
 * @date 2023/9/16 20:36
 * @version 1.0
 */

/**
 * @projectName: demo
 * @package: com.example.team.domain
 * @className: Architect
 * @author: wansui
 * @description: TODO
 * @date: 2023/9/16 20:36
 * @version: 1.0
 */
public class Architect extends Designer{

    private int stock;//股份


    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
