package com.example.thread.synchronize.demo1;

public class Account1Test {

    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        c1.setName("A");
        c2.setName("B");
        c1.start();
        c2.start();
    }
}
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public synchronized void deposit(double amt){
        //synchronized (this.getClass()) {
        if (amt>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功，余额为"+balance);
        }
        // }
    }
}
class Customer extends Thread{
    private Account acc;
    public Customer(Account acc){
        this.acc=acc;
    }

    @Override
    public void run() {
        for (int i=0;i<3;i++){
            acc.deposit(1000);
        }
    }
}

