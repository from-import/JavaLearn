package com.xxxxxx.branch;

public class WhileDemo {
    public static void main(String[] args) {
        double paper = 0.1;
        double high = 8848860;
        int count = 0;

        while(high >= paper){
            paper = paper*2;
            count += 1;
        }
        System.out.println(count);
    }
}
