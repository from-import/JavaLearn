package com.xxx.Anonymous;

public class Test {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.run();
    }
}
    abstract class Animal{
       public abstract void run();
    }

    class Tiger extends Animal{
        @Override
        public void run() {
            System.out.println("Tiger run");
        }
    }
