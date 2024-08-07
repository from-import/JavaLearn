package com.xxx.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("haha");
        list.clear();
        list.add("hello");
        System.out.println(list.isEmpty());
        System.out.println(list.contains("hello"));
        System.out.println(list.size());
        list.remove("hello");

        list.add("haha");
        list.add("haha");   
        list.add("haha");

        for(Object o : list){
            System.out.println(o);
        }

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
