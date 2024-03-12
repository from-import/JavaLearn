package com.xxx.string;

import java.util.Random;
import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
        String stringDict = "abcABC123";
        int stringLength = stringDict.length();
        Random random = new Random();
        String finalString = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("expect checkCode length:");
        int expectLength = sc.nextInt();

        for(int i = 0; i < expectLength ; i++){
            int r = random.nextInt(stringLength);
            finalString += stringDict.charAt(r);
        }
        System.out.println("Check Code is :" + finalString);
    }
}
