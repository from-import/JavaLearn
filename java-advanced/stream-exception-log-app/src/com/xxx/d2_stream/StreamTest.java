package com.xxx.d2_stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("bvv");
        names.add("ac");
        names.add("dasdfwerf");

        // 找到a开头的
        List<String> aStart = new ArrayList<>();
        for(String name: names){
            if (name.startsWith("a")){
                aStart.add(name);
            }
        }

        // 长度大于3
        List<String> lenSuper3 = new ArrayList<>();
        for(String name: names){
            if (name.length() >= 3){
                lenSuper3.add(name);
            }
        }

        // Stream实现
        names.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() >= 1).forEach(s -> System.out.println(s));

    }
}
