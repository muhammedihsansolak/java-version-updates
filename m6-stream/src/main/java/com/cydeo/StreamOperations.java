package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations { //Intermediate Operations
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(System.out::println);

        System.out.println("===============");

        //takes predicate return all elements that match with it
        //**** filter() ****

        list.stream()
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);

        System.out.println("===============");

        //transforms each element by applying the given mapper function
        //**** map() ****

        list.stream()
                .filter(p -> p % 2 == 0)
                .map(p -> p * 3)
                .forEach(System.out::println);

        System.out.println("===============");

        //removes the duplicated elements, returns unique ones
        //**** distinct() ****

        list.stream()
                .filter(p -> p % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("===============");

        //return a stream with length of given number
        //**** limit() ****

        Stream<Integer> stream = list.stream()
                .filter(p -> p > 1)
                .limit(2);

        stream.forEach(System.out::println);

        System.out.println("===============");

        //discards the first given number of elements
        //**** skip() ****

        list.stream()
                .filter(p -> p > 1)
                .skip(2)
                .forEach(System.out::println);

        //returns how many data stream object has, return long
        //**** count() ****

        long count =
                DishData.getAll().stream().count();

        System.out.println(count);

    }
}
