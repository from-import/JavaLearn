package com.xxx.d2_stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class GetStreamDemo {
    public static void main(String[] args) {
        // Collection
        Collection<String> list = new ArrayList<>();
        Stream<String> col = list.stream();

        // Map
        Map<String, Integer> maps = new HashMap<>();
        Stream<String> keyStream = maps.keySet().stream();
        Stream<Integer> valueStream = maps.values().stream();

        Stream<Map.Entry<String,Integer>> keyAndValueStream = maps.entrySet().stream();

        // ArrayList
        String[] namesh = {"a","b","c"};
        Stream<String> stringStream = Arrays.stream(namesh);

        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("bvv");
        names.add("ac");
        names.add("dasdfwerf");

        names.stream().forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.startsWith("a")); // 过滤
        names.stream().filter(s -> s.startsWith("a")).limit(2);// 只要前两个符合条件的
        names.stream().filter(s -> s.startsWith("a")).skip(2);// 跳过前两个符合条件的

        // 加工方法
        names.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "worked " + s;
            }
        });

        // 简化的加工方法
        names.stream().map(s -> "worked " + s).forEach(s -> System.out.println(s));

        // 把每个字符串加工成学生对象
        names.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));

        // 构造器引用 + 方法引用
        names.stream().map(Student::new).forEach(System.out::println);

        // 合并流
        Stream<String> stream1 = names.stream().filter(s -> s.length() >= 1);
        Stream<String> stream2 = Stream.of("jhhhh","adsdfwe");

        Stream<String> stream3 = Stream.concat(stream1,stream2);
        System.out.println(stream3.toList());







    }
}
