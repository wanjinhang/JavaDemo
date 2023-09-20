package com.example.thread.demo;

/**
 * @author wansui
 * @date 2023/09/19
 */
public class TestMyThread {
    public static void main(String[] args) {
        // 方式一
        MyThread myThread = new MyThread();
        myThread.start();

        //方式二 匿名类
        new Thread(){
            @Override
            public void run() {
                for (int i = 100; i <200 ; i++) {
                    System.out.println(getName()+"正在执行"+i);
                }
            }
        }.start();
        //方式三
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        //方法四

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hahaha");
            }
        }).start();
    }
}
