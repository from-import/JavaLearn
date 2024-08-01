package com.xxx.d4_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.run();
    }

}

class Tiger extends Animal{
    @Override
    public void run() {
        System.out.println("tiger run fast");
    }
}

abstract class Animal{
    public abstract void run();
}

