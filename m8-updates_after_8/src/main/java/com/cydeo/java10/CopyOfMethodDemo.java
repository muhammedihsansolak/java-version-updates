package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfMethodDemo {
    public static void main(String[] args) {

        //creates immutable collection. Difference between List.Of() method is copyOf() method accepts ONLY Collections
        //**** copyOf() ****

        List<String> list = Arrays.asList("Java","Kotlin","Python");

        List<String> immutableList = List.copyOf( list );

        List<Integer> immutableList2 = List.of(1,2,3,4,5);


    }
}
