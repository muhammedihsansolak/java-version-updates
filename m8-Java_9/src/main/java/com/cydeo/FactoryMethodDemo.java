package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        //creating immutable List before Java 9 --> Collections.unmodifiableList()

        List<String> list = Collections.unmodifiableList(Arrays.asList("Java","Spring","API"));
       // list.add("Python"); //UnsupportedOperationException
        System.out.println(list);


        //after Java 9 --> List.of(), Set.of(), Map.of()

        List<Integer> list1 = List.of(1,2,3,4,5);

        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );

    }
}
