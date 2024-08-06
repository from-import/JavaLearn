package com.xxx.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("23456543456"));
        System.out.println(checkQQ("234565aaaa43456"));

    }

    public static boolean checkQQ(String qqString){
        return qqString != null && qqString.matches("\\d{6,20}");
    }
}
