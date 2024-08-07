package com.xxx.d5_collection_list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> queue = new LinkedList<>();
        queue.addFirst("player1");
        queue.addFirst("player2");
        queue.addFirst("player3");

        System.out.println(queue);
        // 出queue

        queue.removeLast();
        System.out.println(queue);

        LinkedList<String> stack = new LinkedList<>();

        // 入栈
        stack.push("bomb1");
        stack.add("bomb2");
        stack.add("bomb3");

        // 出栈
        stack.removeLast();
        System.out.println(stack);




    }
}
