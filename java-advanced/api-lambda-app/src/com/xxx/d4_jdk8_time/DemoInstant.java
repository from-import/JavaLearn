package com.xxx.d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class DemoInstant {
    public static void main(String[] args) {
        // instant get
        Instant instant = Instant.now();
        System.out.println(instant);

        // System Now Time
        Instant instant1 = Instant.now();
        instant1.atZone(ZoneId.systemDefault());
        System.out.println(instant1);

        System.out.println(instant.isAfter(instant1));

        // Instant to Date
        Date date = Date.from(instant);
        System.out.println(date);

        Instant instant2 = date.toInstant();
        System.out.println(instant2);
    }
}
