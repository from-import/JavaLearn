package com.xxx.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoubleElevenDemo {
    public static void main(String[] args) throws ParseException {
        String startTime = "2024-11-11 00:00:00";
        String endTime = "2024-11-11 00:10:00";

        String player1 = "2024-11-11 00:08:00";
        String player2 = "2024-11-11 00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);

        Date playerDate1 = sdf.parse(player1);
        Date playerDate2 = sdf.parse(player2);

        if (playerDate1.after(startDate) && (playerDate1.before(endDate))){
            System.out.println("Player1 Wins");
        }

        if (playerDate2.after(startDate) && (playerDate2.before(endDate))){
            System.out.println("Player2 Wins");
        }



    }
}
