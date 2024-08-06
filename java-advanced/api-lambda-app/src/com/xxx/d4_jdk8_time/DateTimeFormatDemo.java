package com.xxx.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 解析
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(ldt.format(dtf));

        // 反向解析
        LocalDateTime ldt1 = LocalDateTime.parse("2024-08-06 20:36:41 Tue PM", dtf);

        System.out.println(ldt1);
        System.out.println(ldt1.getMonth());
    }
}
