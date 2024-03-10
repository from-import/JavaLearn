package com.xxxxx.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //  自动类型转换
        byte a = 20;
        int b = a;

        int age = 23;
        double c = age; // 自动类型转换
        System.out.println(c);

        char ch = 'a';
        int code = ch;
        System.out.println(code);
    }
}
