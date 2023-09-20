package com.example.thread.demo;

/**
 * @author wansui
 * @date 2023/09/19
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"优先级"+getPriority());
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+"正在执行"+i);
        }
    }

}

