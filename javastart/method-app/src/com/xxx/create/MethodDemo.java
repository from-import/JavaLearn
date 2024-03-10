package com.xxx.create;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        haha();
        check(9);
    }

    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }

    public static void haha(){
        System.out.println("Fake");
    }

    public static void check(int a){
        if (a%2 == 1){
            System.out.println("奇数");
        }
        else{
            System.out.println("偶数");
        }
    }
}
