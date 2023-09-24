package com.example.test.set;

import java.util.Comparator;
import java.util.TreeSet;

/****
 * 练习2：**TreeSet的自然排序和定制排序

 1. 定义一个Employee类。
 该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
 并为每一个属性定义 getter, setter 方法；
 并重写 toString 方法输出 name, age, birthday

 2. MyDate类包含:
 private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；

 3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）

 4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出：

 1). 使Employee 实现 Comparable 接口，并按 name 排序
 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。

 * @author wansui
 * @version 1.0
 * @date 2023/9/24 22:04
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Comparator<Employee> objectComparator = new Comparator<>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1 == o2){
                    return 0;
                }
                if(o1.getBirthday().getYear() > o2.getBirthday().getYear()){
                    return 1;
                }
                if(o1.getBirthday().getYear() < o2.getBirthday().getYear()){
                    return -1;
                }
                if(o1.getBirthday().getMonth() > o2.getBirthday().getMonth()){
                    return 1;
                }
                if(o1.getBirthday().getMonth() < o2.getBirthday().getMonth()){
                    return -1;
                }
                if(o1.getBirthday().getDay() > o2.getBirthday().getDay()){
                    return 1;
                }
                if(o1.getBirthday().getDay() < o2.getBirthday().getDay()){
                    return -1;
                }
                return 0;

                }

        };

        TreeSet<Employee> set = new TreeSet<>(objectComparator);

        Employee e1 = new Employee("Tom",23,new MyDate(1999,7,9));
        Employee e2 = new Employee("Rose",43,new MyDate(1999,7,19));
        Employee e3 = new Employee("Jack",54,new MyDate(1998,12,21));
        Employee e4 = new Employee("Jerry",12,new MyDate(2002,4,21));
        Employee e5 = new Employee("Tony",22,new MyDate(2001,9,12));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        //遍历
        for (Employee employee : set) {
            System.out.println(employee);
        }


    }
}
