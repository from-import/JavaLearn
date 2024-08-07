package com.xxx.d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 无序 不重复 无索引
        Set<String> sets = new HashSet<>();
        sets.add("JAVA");
        sets.add("JAVA");
        sets.add("PHP");
        System.out.println(sets);
    }
}
