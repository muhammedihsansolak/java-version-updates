package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
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


        BiFunction<String, Integer, String> function = (str,i) -> str.substring(i);

        BiFunction<String, Integer, String> function2 = String::substring;
        System.out.println(function2.apply("Muhammed", 4));

        Function<Integer,Double> function5 = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> function6 = MyClass::method;
        //if we declare the type in parameter, we do not have to create an object for instance methods. we could call them through class name

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

    }
}
