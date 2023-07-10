package com.cydeo;

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

        //removes the duplicated elements, returns unique ones
        //**** distinct() ****

        list.stream()
                .filter(p -> p % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("===============");

        //return a stream with length of given number
        //**** limit() ****

        Stream<Integer> stream =  list.stream()
                .filter(p->p>1)
                .limit(2);

        stream.forEach(System.out::println);

    }
}
