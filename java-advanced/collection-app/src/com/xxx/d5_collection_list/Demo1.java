package com.xxx.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // for 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // foreach
        for (String str : list){
            System.out.println(str);
        }

        // lambda
        list.forEach(s -> System.out.println(s));

    }
}
