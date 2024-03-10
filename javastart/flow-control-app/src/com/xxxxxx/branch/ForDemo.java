package com.xxxxxx.branch;

public class ForDemo {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
