package com.cydeo.dishTask;

import java.util.Comparator;

public class DishTest {
    public static void main(String[] args) {

        //print all dishes that has less than 400 calories

        DishData.getAll().stream()
                .filter( p-> p.getCalories()<400 )
                .map(Dish::getName) //.map( dish -> dish.getName() )
                .forEach(System.out::println);

        System.out.println("-------------------");

        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //print high caloric dish name (>300)

        DishData.getAll().stream()
                .filter(p -> p.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //print all dish names that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(p -> p.getCalories()<400)
                .sorted(Comparator.comparing( Dish::getCalories ))
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}
