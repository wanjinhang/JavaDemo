package com.example.test.map;

import java.util.*;

/**
 * 将省份和城市的名称保存在集合中，当用户选择省份以后，二级联动，显示对应省份的地级市供用户选择。
 * @author wansui
 * @version 1.0
 * @date 2023/9/24 23:44
 */
public class CityMapTest {
    public static void main(String[] args) {
        Set<String> provinceSet = CityMap.model.keySet();
        Iterator<String> iterator = provinceSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ "   ");
        }
        String provinceName = getProvinceName();

        String cityName = getCityName(provinceName);

        System.out.println("信息等级完毕");
        System.out.println(provinceName +"----"+cityName);



    }

    public static String getProvinceName(){
        System.out.println();
        System.out.println("请输入你的所在的省份\n");
        Scanner in = new Scanner(System.in);
        String next = in.next();
        if(!CityMap.model.containsKey(next)){
            System.out.println("输入信息有误,请重新输入");
            getProvinceName();
        }
        return next;
    }

    public static String getCityName(String provinceName) {
        String[] cityArr = CityMap.model.get(provinceName);
        for (int i = 0; i < cityArr.length; i++) {
            System.out.print(cityArr[i] + "   ");
        }
        List<String> cityList = Arrays.asList(cityArr);
        System.out.println();
        System.out.println("请输入你的所在的城市\n");
        Scanner in = new Scanner(System.in);
        String next = in.next();


        if (!cityList.contains(next)) {
            System.out.println("输入信息有误,请重新输入");
            getCityName(provinceName);

        }
        return next;
    }
}
