package com.xxxxxx.branch;

public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println("洗碗第"+i+"天");
            if (i==3){
                System.out.println("-------");
                break;
            }


        }

        for (int i=1; i<=5; i++){
            if (i==3){continue;}
            System.out.println("洗碗第"+i+"天");

        }
    }
}
