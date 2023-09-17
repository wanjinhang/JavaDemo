package com.example.demo;

//饿汉式 单例模式
public class Bank {

    private static final Bank instance = new Bank();
    private  Bank() {

    }
    public static Bank getBankInstance(){
        return instance;
    }
}
//懒汉式 单例模式
class  Bank1{
    private static Bank1 instance;

    private Bank1(){

    }

    public static Bank1 getInstance() {
        if (instance == null) instance = new Bank1();
        return instance;
    }
}