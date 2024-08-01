package com.xxx.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Wolf();
        a.run();
        b.run();
    }
}
