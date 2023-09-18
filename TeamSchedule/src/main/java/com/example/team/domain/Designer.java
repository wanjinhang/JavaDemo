package com.example.team.domain;/**
 * @author wansui
 * @date 2023/9/16 20:34
 * @version 1.0
 */

/**
 * @projectName: demo
 * @package: com.example.team.domain
 * @className: Designer
 * @author: wansui
 * @description: TODO
 * @date: 2023/9/16 20:34
 * @version: 1.0
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
