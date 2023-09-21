package com.example.thread.practise;

/**
 * 声明一个PrintEvenThread线程类，继承Thread类，重写run方法，实现打印[1,100]之间的偶数，要求每隔1毫秒打印1个偶数。
 *
 * 声明一个PrintOddThread线程类，继承Thread类，重写run方法，实现打印[1,100]之间的奇数。
 *
 * 在main线程中：
 *
 * （1）创建两个线程对象，并启动两个线程
 *
 * （2）当打印奇数的线程结束了，让偶数的线程也停下来，就算偶数线程没有全部打印完[1,100]之间的偶数。
 * @author wansui
 * @date 2023/09/21
 */
public class PrintEOTest {
    public static void main(String[] args) {
        PrintEvenThread pe = new PrintEvenThread();
        PrintOddThread po = new PrintOddThread();
        pe.start();
        po.start();

        try {
            po.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pe.setFlag(false);
    }
}
