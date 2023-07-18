package com.cydeo.java9.stockTask;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDropWhile2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //takeWhile() will continue to get the items until the first occurrence of an item which does not match with the condition.
        //**** takeWhile() ****

        list.stream()
                .takeWhile(p -> p <= 5)
                .forEach(System.out::println);

        // dropWhile() will continue to not get the items until the first occurrence of an item which does not match with the condition
        //**** dropWhile() ****

        list.stream()
                .dropWhile(p -> p>=5)
                .forEach(System.out::println);


    }
}
