package com.example.test.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/23 22:50
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner in  = new Scanner(System.in);

        while (true) {
            System.out.println("选择(1 录入; 0 退出)");
            if(in.nextInt() == 1) {
                System.out.println("姓名:");
                String name = in.next();
                System.out.println("年龄:");
                int age = in.nextInt();
                arrayList.add(new Student(name,age));


            }else{
                break;
            }

        }


        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }

}
