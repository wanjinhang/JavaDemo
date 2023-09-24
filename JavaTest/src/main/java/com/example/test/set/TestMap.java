package com.example.test.set;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/24 23:28
 */
public class TestMap {

    @Test
    public void test() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("number", 12);//添加
        hashMap.put("age", 100);

        Set<String> strings = hashMap.keySet();

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        for (Map.Entry<String, Integer> set : entries) {
            System.out.println(set.getKey()+">>>"+set.getValue());

        }

    }
}
