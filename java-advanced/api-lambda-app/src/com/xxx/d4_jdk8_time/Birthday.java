package com.xxx.d4_jdk8_time;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1997,8,6);
        LocalDate nowDate = LocalDate.now();

        if (birthDay.getMonth().equals(nowDate.getMonth()) && (birthDay.getDayOfMonth() == (nowDate.getDayOfMonth()))){
            System.out.println("happy birthday");
        }
        else{
            System.out.println("normal day");
        }
    }
}
