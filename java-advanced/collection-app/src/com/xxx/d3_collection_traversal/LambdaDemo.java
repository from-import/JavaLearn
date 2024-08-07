package com.xxx.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");

        // 遍历
        lists.forEach(s -> System.out.println(s));

    }
}
