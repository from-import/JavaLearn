package com.xxx.d5_integer;

import javax.sql.rowset.spi.SyncResolver;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 11;
        System.out.println("a: " + a + " b: " + b);

        // 支持赋值 null
        // int age = null;
        Integer age = null;

        System.out.println("----------");
        // 1. 包装类可以把基本类型转 String
        Integer c = 23;
        String rs = c.toString();
        System.out.println(rs);

        // 2. String 强转 int Double
        String d = "666";
        int intD = Integer.parseInt(d);
        double doubleD = Double.parseDouble(d);

        System.out.println(intD);
        System.out.println(doubleD);

        int intD2 = Integer.valueOf(d);
        System.out.println(intD2);

    }
}
