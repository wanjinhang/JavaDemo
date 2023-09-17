package com.example.demo.implementTest;

public class Computer {
    public Computer() {
    }

    public void transfer(USB usb){
        System.out.println("usb 已连接");
        usb.start();
        System.out.println("数据开始传输");
        usb.stop();
    }
}
