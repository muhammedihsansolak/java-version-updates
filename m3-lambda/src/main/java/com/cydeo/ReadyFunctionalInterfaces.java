package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ReadyFunctionalInterfaces {
    public static void main(String[] args) {

        //**** PREDICATE ****

        //accepts an object returns a boolean value

        Predicate<Integer> lesserThan = i -> i < 18 ;
        System.out.println( lesserThan.test(10) );

        System.out.println("==================");

        //**** BIPREDICATE ****

        //accepts two objects returns a boolean value

        BiPredicate<String,String> isEqual = (a,b) -> a.equals(b);

        System.out.println("==================");

        //**** CONSUMER ****

        //accepts an object returns void

        Consumer<String> display = s -> System.out.println("You completed "+s);
        display.accept("Task-1");

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach( s -> System.out.println(s) );

        System.out.println("==================");

        //**** BICONSUMER ****

        //accepts two object returns void

        BiConsumer<Integer, Integer> addTwo = (x,y) -> {
            System.out.println(x+y);
        };

        addTwo.accept(5,6);

        System.out.println("==================");

        //**** FUNCTION ****

        //accepts T return R

        Function< String, String> function = (s) -> "Hello "+s;
        System.out.println( function.apply("Muhammed") );

        System.out.println("==================");

        //**** BIFUNCTION ****

        //accepts T and U return R

        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;

        System.out.println("==================");

        //*** SUPPLIER ****

        //has no parameters return T

        Supplier<Double> randomValue = () -> Math.random();




    }
}
