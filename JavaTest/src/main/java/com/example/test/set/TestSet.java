package com.example.test.set;

import org.junit.Test;

import java.util.*;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/24 18:55
 */
public class TestSet {
    @Test
    public void randomValueTest() {
        Set<Integer> hashSet = new HashSet();

        while (hashSet.size() < 10) {
            hashSet.add((int) (Math.random() * (20-1)+1));
        }

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test(){
        Comparator<User> comparator = new Comparator<>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<User> users = new TreeSet<>(comparator);

        users.add(new User("wansui",1));
        users.add(new User("wansui1",2));

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
    //**练习1：**在一个List集合中存储了多个无大小顺序并且有重复的字符串，定义一个方法，让其有序(从小到大排序)，并且不能去除重复元素。
    @Test
    public void test1(){
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(2);
        ints.add(3);
        ints.add(1);
        ints.add(2);
        ints.add(1);
        ints.add(5);
        ints.add(2);
        ints.add(1);

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Objects.equals(o1, o2)){
                    return 1;
                }else{
                    return o1-o2;
                }

            }


        };

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);

        treeSet.addAll(ints);
        ints.clear();
        ints.addAll(treeSet);

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


    }
}
