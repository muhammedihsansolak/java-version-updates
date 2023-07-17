package com.cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1-amount2); // 0.30000000000001137

        //******************* DO NOT USE DOUBLE USE "BIGDECIMAL" *******************

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        System.out.println(b1.subtract(b2)); // 0.30

        //other way to create BigDecimal object -->
        BigDecimal b3 = BigDecimal.valueOf(374.56);

        // compareTo()

        System.out.println( new BigDecimal("2").compareTo(new BigDecimal("2")) );//0
        System.out.println( new BigDecimal("3").compareTo(new BigDecimal("1")) );//1
        System.out.println( new BigDecimal("1").compareTo(new BigDecimal("2")) );//-1

    }
}
