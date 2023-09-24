package com.example.test.set;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/24 19:31
 */
public class DistinctTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 创建键盘录入对象
        System.out.println("请输入一行字符串:");
        String line = sc.nextLine(); // 将键盘录入的字符串存储在line中
        char[] arr = line.toCharArray(); // 将字符串转换成字符数组

        HashSet hs = new HashSet(); // 创建HashSet集合对象

        for (Object c : arr) { // 遍历字符数组
            hs.add(c); // 将字符数组中的字符添加到集合中
        }

        for (Object ch : hs) { // 遍历集合
            System.out.print(ch);
        }
    }
}
