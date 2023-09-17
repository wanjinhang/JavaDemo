package com.example.team.domain;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 17:24
 */
public class Employee {
    private  int id;
    private  String  name;
    private  int age;
    private  double salary;

    /**
     * @param id
     * @param name
     * @param age
     * @param salary
     */
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
