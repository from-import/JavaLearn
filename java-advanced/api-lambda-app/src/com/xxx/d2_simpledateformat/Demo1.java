package com.xxx.d2_simpledateformat;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf.format(d);
        System.out.println(rs);

        System.out.println(sdf.format(d.getTime() + 1 * 1000));


        // 字符串时间解析为机器可读
        // 往后推 2 d 14 h 49 m 6 s
        String dateString = rs;
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        Date d2 = null;
        try {
            d2 = sdf2.parse(rs);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long time = d2.getTime();
        Long rsTime = time + (2L*24*60*60 + 14*60*60 + 49 * 60 + 6)*1000;
        Date finalDay = new Date(rsTime);
        System.out.println(sdf.format(finalDay));

    }
}
