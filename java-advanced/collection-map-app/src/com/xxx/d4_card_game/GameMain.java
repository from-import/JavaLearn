package com.xxx.d4_card_game;

import java.util.*;

public class GameMain {
    public static List<Card> cards = new ArrayList<>();

    static {
        List<String> colors = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(colors,"♠","♣","♦","♥");
        Collections.addAll(nums,1,2,3,4,5,6,7,8,9,10,11,12,13);

        for (int i = 0; i < colors.size(); i++) {
            for (int i1 = 0; i1 < nums.size(); i1++) {
                cards.add(new Card(colors.get(i) , nums.get(i1)));
            }
        }
        System.out.println(cards);
    }

    public static void getCard(List<Card> cards){
        List<Card> sufCards = new ArrayList<>(cards);
        Collections.shuffle(sufCards);

        int partSize = (int) Math.ceil((double) sufCards.size() / 3);

        // 创建三个子列表
        List<Card> part1 = sufCards.subList(0, Math.min(partSize, sufCards.size()));
        List<Card> part2 = sufCards.subList(Math.min(partSize, sufCards.size()), Math.min(2 * partSize, sufCards.size()));
        List<Card> part3 = sufCards.subList(Math.min(2 * partSize, sufCards.size()), sufCards.size());

        // 输出每个子列表
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
        System.out.println("Part 3: " + part3);
    }

    public static void main(String[] args) {
        getCard(cards);
    }


}
