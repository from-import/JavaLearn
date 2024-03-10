package com.xxxxx.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        // System.out.println(r.nextInt(10)); // range(10)

        int num = r.nextInt(100);
        int guess = 101;

        Scanner scanner = new Scanner(System.in);

        while(guess != num){
            System.out.print("what's your choice:");
            guess = scanner.nextInt();

            if (guess>num){
                System.out.println("bigger!");
            } else if (guess<num) {
                System.out.println("smaller");
            }
            else{
                System.out.println("\nyou win , the answer is " + num);
            }

        }
    }
}
