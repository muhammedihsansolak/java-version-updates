package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        //after these operation you can not have any other stream operations, because they all return boolean expression

        //Checks if all the elements of the stream match the given predicate. returns boolean
        //**** allMatch() ****

        boolean result = DishData.getAll().stream().allMatch( p -> p.getCalories() < 1000 ); //if all the dish's calories less than 1000, return true
        System.out.println(result);

        System.out.println("-------------");

        // Checks if there is an element in the stream matching the given predicate. returns boolean
        //**** anyMatch() ****

        if ( DishData.getAll().stream().anyMatch(Dish::isVegetarian) ) {
            System.out.println("Menu is vegetarian friendly");
        }

        System.out.println("-------------");

        //  Ensures no elements in the stream match the given predicate. returns boolean
        //**** noneMatch() ****

        boolean isHealthy = DishData.getAll().stream().noneMatch(p -> p.getCalories() >= 1000); //--> if none of them match with the given condition returns true
        System.out.println(isHealthy);

        System.out.println("-------------");

        // Returns any element from a Stream. returns "Optional Interface" (is created for avoiding null pointer exceptions)
        //**** findAny() ****

        Optional<Dish> findAny = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(findAny.get());

        //findAny() returns Optional type, if you want you can use get() method for original object type
        //IF THE CONDITION IS TRUE, IT RETURNS ANY OF THE MATCHED ONES

        System.out.println("-------------");

        // Returns the first element from a Stream. returns "Optional Interface"
        //**** findFirst() ****

        Optional<Dish> findFirst= DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(findAny.get());

        System.out.println("PARALLEL STREAMS (Async)");

        System.out.println( IntStream.range(0,100).parallel().findAny() );
        System.out.println( IntStream.range(0,100).parallel().findFirst() );

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        String result2 =  list1.parallelStream().filter(p -> p.startsWith("D")).findAny().get();
        System.out.println(result2);

        String result3 =  list2.parallelStream().filter(p -> p.startsWith("J")).findFirst().get();
        System.out.println(result3);



        System.out.println("-------------");

        //accepts comparator finds min&max
        //min() & max() operations

        Optional<Dish> minCaloric =
        DishData.getAll().stream()
                .min( Comparator.comparing( Dish::getCalories ) );

        System.out.println(minCaloric);

        Optional<Dish> maxCaloric =
        DishData.getAll().stream()
                .max( Comparator.comparing(Dish::getCalories) );

        System.out.println(maxCaloric);

    }
}
