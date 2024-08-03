package com.xxx.d6_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {


    public static void main(String[] args) {

        double a = 3.0;
        double b = 10.0;

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        System.out.println(b1.divide(a1,5, RoundingMode.HALF_UP));
    }

}
