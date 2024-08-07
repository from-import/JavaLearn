package com.xxx.d4_card_game;

public class Card {
    private String color;
    private int num;

    public Card() {
    }

    public Card(String color, int num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return color + num;
    }

}
