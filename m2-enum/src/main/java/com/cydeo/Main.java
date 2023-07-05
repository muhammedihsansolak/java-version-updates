package com.cydeo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c = Currency.DIME;

        System.out.println(c);//we can print enum class without toString method. toString method is already overridden in enum class

        System.out.println( Currency.QUARTER );

        System.out.println("How to get all constant?"); //values() method collects all the constants

        System.out.println( Arrays.toString( Currency.values() ) );

        Currency[] currencies = Currency.values();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch case in enum?");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case DIME:
                System.out.println("It is 5 cent");
                break;
            case NICKLE:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("=============================");

        calculate(3,5,Operation.PLUS);


    }

    private static void calculate(double x, double y, Operation operation ){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
        }

    }

}
