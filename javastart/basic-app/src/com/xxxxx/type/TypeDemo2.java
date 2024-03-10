package com.xxxxx.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        System.out.println(a+b);

        byte aa = 1;
        byte bb = 2;
        double c = aa + bb;
        System.out.println(c);

        // 强制转换
        int i = 1000;
        byte num = (byte) i;
        System.out.println(num); // error

        double aac = 14.22;
        int caa = (int) aac;
        System.out.println(caa); // 14.22 -> 14


    }
}
