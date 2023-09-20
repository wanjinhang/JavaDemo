package com.example.thread.synchronize.demo1;

/**
 * @author wansui
 * @date 2023/09/20
 */
public class TicketSaleThread extends Thread{
    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    private static int ticket = 100;
    @Override
    public void run() {
        while (ticket>0){
            saleOnTicket();
        }
    }

    private static synchronized void saleOnTicket() {

        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"卖出一张票，票号为："+ticket);
            ticket--;
        }

    }
}
