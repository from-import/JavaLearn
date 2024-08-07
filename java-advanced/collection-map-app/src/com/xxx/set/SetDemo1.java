package com.xxx.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("JAVA");
        sets.add("JAVA");

        sets.add("PHP");
        System.out.println(sets);
    }
}
