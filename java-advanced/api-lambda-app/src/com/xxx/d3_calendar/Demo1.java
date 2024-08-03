package com.xxx.d3_calendar;

import java.util.Calendar;

public class Demo1 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.YEAR,5);
        System.out.println(cal.get(Calendar.YEAR));

    }
}
