package com.example.thread.practise;

/**
 * @author wansui
 * @date 2023/09/21
 */
public class PrintEvenThread extends Thread {
    private boolean flag = true;
    @Override
    public void run() {

        for (int i = 2; i <= 100 && flag; i += 2) {
            System.out.println("偶数线程：" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
