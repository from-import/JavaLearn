package com.xxx.polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        System.out.println(a instanceof Tortoise);

    }
}
