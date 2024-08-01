package com.xxx.d1_polymorphic;

public class Advantage_Test {

    // accept any Animal as Class
    public static void fight(Animal a,Animal b){
        a.run();
        b.run();
        System.out.println("finish");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Wolf();
        fight(a,b);
    }
}
