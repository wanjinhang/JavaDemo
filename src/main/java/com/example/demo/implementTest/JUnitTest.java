package com.example.demo.implementTest;
import org.junit.Test;

public class JUnitTest {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        Drink[] values = Drink.values();

        for (Drink value : values) {
            System.out.println(value);
        }
    }

   @Test
    public void test1(){
       Integer ii1 = 10;
       Boolean b1 = true;

       float f1 = 12.0f;
       Float f2= f1;
       System.out.println(Integer.MAX_VALUE);

       Computer computer = new Computer();
   }
}
