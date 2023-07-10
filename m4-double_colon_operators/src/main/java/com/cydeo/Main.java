package com.cydeo;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

     //  Predicate<Integer> pred = p -> p%2 == 0; --> lambda short explanation

        Calculate calculate = (a,b) -> {
            System.out.println(a+b);
        };

        Calculate calculate2 = (x,y) -> Calculator.findSum(x,y);
        //you can use method in lambda expression as long as the signatures match
        //YOU CAN SIMPLIFY IT WITH USING DOUBLE COLON OPERATOR:

        Calculate calculate3 = Calculator::findSum; //just method name needed. no parameter

        calculate3.calculate(10,20);

        //How to use double colon operator for instance methods?
        Calculator obj = new Calculator();
        Calculate calculate4 = obj::findMultiply; //we can call it through object


    }
}
