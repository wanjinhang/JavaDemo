package com.example.test.map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/23 18:41
 */
public class TestMap {

    @Test
    public void test(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(789);
        arrayList.add(123);
        arrayList.add(123);
        arrayList.add(123);
        arrayList.add(123);

//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        arrayList.add(456);//增
        arrayList.remove(0);//删
        arrayList.set(0,741);//改
        System.out.println(arrayList.size());//长度

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
