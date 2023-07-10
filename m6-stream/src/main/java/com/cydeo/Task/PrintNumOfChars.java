package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class PrintNumOfChars {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        list.stream()
                .map( String::length )
                .forEach(System.out::println);

    }
}
