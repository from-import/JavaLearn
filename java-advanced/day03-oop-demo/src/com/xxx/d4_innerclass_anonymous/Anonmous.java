package com.xxx.d4_innerclass_anonymous;

public class Anonmous {
    public static void main(String[] args) {
        Animal tiger = new Animal() {
            @Override
            public void run() {
                System.out.println("Tiger Run");
            }
        };
        tiger.run();
    }
}

abstract class Animal2{
    public abstract void run();
}

