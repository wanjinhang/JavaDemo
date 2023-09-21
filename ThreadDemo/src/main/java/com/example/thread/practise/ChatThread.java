package com.example.thread.practise;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author wansui
 * @date 2023/09/21
 */
public class ChatThread extends Thread{
    @Override
    public void run() {
       Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("是否输入Y结算打印？");
           String answer = scanner.nextLine();
           if (!"".equals(answer) && Character.toUpperCase(answer.charAt(0))=='Y'){
               break;
           }

       }
       scanner.close();
    }
}

