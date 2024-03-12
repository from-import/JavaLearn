package com.xxx.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String num1 = "fuck";
        String num2 = new String("fuck");

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        System.out.println(num1.equalsIgnoreCase(num2));
    }
}
