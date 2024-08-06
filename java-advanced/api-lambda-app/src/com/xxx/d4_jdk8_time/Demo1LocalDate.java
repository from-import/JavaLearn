package com.xxx.d4_jdk8_time;

import java.time.LocalDate;

public class Demo1LocalDate {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("today:" + nowDate);

        int year = nowDate.getYear();
        int month = nowDate.getMonthValue();
        int day = nowDate.getDayOfYear();
        System.out.println("year:" + year);
    }

}
