package com.example.test.set;

import java.util.Objects;

/**
 * The type Employee.
 *
 * @author wansui
 * @version 1.0
 * @date 2023 /9/24 21:49
 */
public class Employee implements Comparable {

    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(getBirthday(), employee.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getBirthday());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.toString() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);


        }

        throw new RuntimeException("传入的类型不匹配");
    }
}
