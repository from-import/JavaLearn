package com.xxx.d5_map;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo1 {
    public static void main(String[] args) {
        // map
        Map<String, Integer> maps = new HashMap<>();
        maps.put("player1",15);
        maps.put("player2",35);
        maps.put("player3",66);

        System.out.println(maps.isEmpty());

        Integer num1 = maps.get("player1");
        System.out.println(num1);

        System.out.println(maps.containsKey("player4"));
        System.out.println(maps.containsValue(35));

        // 获取全部key的集合
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        // 获取所有value
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 1.遍历 键找值
        for (String key : keys){
            System.out.println(maps.get(key));
        }

        // 2.遍历 键值对实例化
        for (Map.Entry<String, Integer> stringIntegerEntry : maps.entrySet()) {
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }

        // 3.遍历 Lambda
        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + " " + value);
            }
        });

        // 4. Lambda Plus
        maps.forEach((k, v) -> {System.out.println(k + " " + v);});


    }
}
