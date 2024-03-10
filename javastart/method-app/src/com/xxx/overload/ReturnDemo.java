package com.xxx.overload;

public class ReturnDemo {
    public static void main(String[] args) {
        test(1);
        test(1, 4);
    }

    public static int test(int a) {
        return test(a, 0); // 调用具有两个参数的方法，并将第二个参数设为默认值 0
    }

    public static int test(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Only one parameter.");
            return 0; // 当只有一个参数时返回 0
        } else {
            return a + b;
        }
    }
}
