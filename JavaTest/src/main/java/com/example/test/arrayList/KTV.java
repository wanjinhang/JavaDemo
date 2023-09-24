package com.example.test.arrayList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/24 0:14
 */
public class KTV {
    public static void main(String[] args) {
        boolean f = true;
        System.out.println("---------欢迎来到点歌系统----------");
        System.out.println("1.添加歌曲至列表");
        System.out.println("2.播放歌曲置顶");
        System.out.println("3.将歌曲前移一位");
        System.out.println("4.退出");
        System.out.println("请输入你的选择:");
        Scanner in = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        while (f){
            switch (in.nextInt()) {
                case 1:
                    System.out.println("请输入歌曲名称:");
                    String songName = in.next();
                    if(linkedList.contains(songName)){
                        System.out.println("歌曲已存在");
                        break;
                    }
                    linkedList.add(songName);
                    break;
                case 2:
                    System.out.println("请输入歌曲名称:");
                    String songName1  = in.next();
                    if(!linkedList.contains(songName1)){
                        System.out.println("歌曲不存在");
                        break;
                    }
                    if(linkedList.getFirst().equals(songName1)){
                        System.out.println("歌曲已置顶");
                        break;
                    }
                    linkedList.remove(songName1);
                    linkedList.addFirst(songName1);

                    break;
                case 3:
                    System.out.println("请输入歌曲名称:");
                    String songName2  = in.next();
                    if(!linkedList.contains(songName2)){
                        System.out.println("歌曲不存在");
                        break;
                    }

                    int i = linkedList.indexOf(songName2);
                    if (i==0){
                        System.out.println("歌曲已是第一个,无法前移");
                        break;
                    }
                    linkedList.remove(songName2);
                    linkedList.add(i-1,songName2);

                    break;
                case 4:
                    f = false;
                    break;
                default:
                    break;
            }

        }
        for (Object o : linkedList) {
            System.out.println(o);
        }

    }
}
