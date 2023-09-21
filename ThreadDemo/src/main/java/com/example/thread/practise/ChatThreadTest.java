package com.example.thread.practise;

/**
 * @author wansui
 * @date 2023/09/21
 */
public class ChatThreadTest {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5){
                ChatThread chatThread = new ChatThread();
                chatThread.start();
                try {
                    chatThread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i);
        }
    }
}
