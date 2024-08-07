package com.xxx.d4_exception_default;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(chu(0, 10));
        System.out.println("haha");
    }

    public static double chu(int a, int b) {
        try {
            double result = a / (double) b; // 将一个操作数转换为double以避免整数除法
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed.");
            return Double.NaN; // 返回默认值，例如NaN（Not a Number）
        }
    }
}
