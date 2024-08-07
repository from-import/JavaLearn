package com.xxx.d6_remove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        // for 循环，倒序删除避免索引问题
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("b")) {
                list.remove(i);
            }
        }

        // iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("b")) {
                it.remove();
            }
        }

        // foreach 循环，不支持修改操作，会抛出 ConcurrentModificationException
        // for (String str : list) {
        //     if (str.equals("b")) {
        //         list.remove(str); // 不能这样做，会抛出异常
        //     }
        // }

        // lambda 表达式，不支持修改操作
        // list.forEach(s -> {
        //     if (s.equals("b")) {
        //         list.remove(s); // 不能这样做，会抛出异常
        //     }
        // });

        System.out.println(list);
    }
}
