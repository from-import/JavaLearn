package com.xxx.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("a is running");
            }
        };
        a.run();

        Animal b = () -> {
            System.out.println("b is running");
        };
        b.run();
    }
}

interface Animal{
    void run();
}