package com.xxx.Anonymous;

public class Swimming {
    public static void main(String[] args) {
        Swim student = new Swim() {
            @Override
            public void swim() {
                System.out.println("Student is swimming");
            }
        };
        goSwim(student);

    }

    public static void goSwim(Swim s){
        System.out.println("Swimming");
        s.swim();
    }
}

interface Swim{
    void swim();
}