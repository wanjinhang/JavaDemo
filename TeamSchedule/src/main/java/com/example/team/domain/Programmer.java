package com.example.team.domain;


import com.example.team.service.Status;

import static com.example.team.service.Status.FREE;

/**
 * @projectName: demo
 * @package: com.example.team.domain
 * @className: Programmer
 * @author: wansui
 * @description: TODO
 * @date: 2023/9/16 20:18
 * @version: 1.0
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
