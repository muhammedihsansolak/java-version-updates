package com.cydeo;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

     //  Predicate<Integer> pred = p -> p%2 == 0; --> lambda short explanation

        Calculate calculate = (a,b) -> {
            System.out.println(a+b);
        };

        Calculate calculate2 = (x,y) -> Calculator.findMultiply(x,y);//you can use method in lambda expression as long as the signatures match

    }
}
