package com.xxx.overload;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        String [] target = {"placeA","placeB"};
        fire();
        fire(target);
        fire(target,5);
    }
    public static void fire(){
        System.out.println("fire");
    }
    public static void fire(String [] target){
        System.out.println("fire on " + Arrays.toString(target));
    }

    public static void fire(String [] target, int num){
        System.out.println("fire on " + Arrays.toString(target) + "x" + num);
    }
}
