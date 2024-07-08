package com.xxx.staticDemo.cardGame;

import java.util.ArrayList;

public class Card {

    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] colors = {"black1","black2","red1","red2"};

        // 等价于 for (int i = 0; i < colors.length; i++){}
        for (String color : colors) {
            for (String s : number) {
                cards.add(s + " " + color);
            }
        }
        cards.add("King");
        cards.add("Little King");
    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
