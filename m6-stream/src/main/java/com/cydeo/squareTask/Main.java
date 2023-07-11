package com.cydeo.squareTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);

        list.stream()
                .map(p -> p*p)
                .forEach(System.out::println);


    }
}
