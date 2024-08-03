package com.xxx.d1_date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        // 1. Date
        Date d = new Date();
        System.out.println(d);

        // 2. times
        long time = d.getTime();
        System.out.println(time);

        // add times test
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
        time2 += (60 * 60 * 1 + 121)*1000;
        System.out.println(d);

        Date d2 = new Date(time2);
        System.out.println(d2);
    }
}
