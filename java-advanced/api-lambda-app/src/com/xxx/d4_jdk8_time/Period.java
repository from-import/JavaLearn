package com.xxx.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Period {
    public static void main(String[] args) {
        // Duration 用于计算两个时间刻的间隔
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthday = LocalDateTime.of(2019, 10, 30, 20, 06, 11);

        Duration duration = Duration.between(birthday, today);
        System.out.println(duration);
        // 获取两个日期间隔的时间

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

    }
}
