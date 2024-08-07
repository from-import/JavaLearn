package com.xxx.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("555");
        System.out.println(list);

        // 无序 不重复 无索引
        Collection list2 = new HashSet();
        list2.add("a");
        list2.add("a");
        list2.add("555");
        System.out.println(list2);

        // 指定任意类型
        Collection<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("!3");

        // 存储基本数据类型
        Collection<Integer> list4 = new ArrayList<>();
        list4.add(134);
        list4.add(1231111);
        System.out.println(list4);

    }


}
