package com.xxx.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");

        System.out.println(lists);

        // 迭代
//        Iterator<String> it = lists.iterator();
//        System.out.println(it.next()); // a
//        System.out.println(it.next()); // b

        // 循环迭代
        Iterator<String> it = lists.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 增强循环
        for (String str : lists){
            System.out.println(str);
        }

    }
}
