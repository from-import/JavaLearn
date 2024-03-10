package com.xxxxxx.branch;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        // int heartbeat = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("what's your heartbeat:");
        int heartbeat = scanner.nextInt();

        if (heartbeat >20 & heartbeat < 100){
            System.out.println("YOU ARE ALIVE");
        }
        else{
            System.out.println("YOU ARE NOT ALIVE");
        }
    }
}
