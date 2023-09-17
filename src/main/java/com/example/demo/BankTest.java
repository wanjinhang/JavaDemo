package com.example.demo;

import java.util.Objects;

public class BankTest {
    public static void main(String[] args) {
        Bank b  = Bank.getBankInstance();
        Bank a = Bank.getBankInstance();

        if (Objects.equals(a, b)) System.out.println("一致");

    }
}
