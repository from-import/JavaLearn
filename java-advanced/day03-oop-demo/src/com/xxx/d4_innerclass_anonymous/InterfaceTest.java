package com.xxx.d4_innerclass_anonymous;

public class InterfaceTest {
    public static void main(String[] args) {

        Swimming player = new Swimming() {
            @Override
            public void swim() {
                System.out.println("player is swimming");
            }
        };

        go(player);
    }

    public static void go(Swimming player){
        System.out.println("Swimming Start");
        player.swim();
        System.out.println("Swimming End");
    }
}

interface Swimming{
    void swim();
}
