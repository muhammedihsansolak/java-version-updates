package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Creating stream from arrays
        String[] arr = {"Java", "Python", "Ruby"};
        Stream<String> languages = Arrays.stream(arr);

        //Creating stream from collections
        List<String> list = Arrays.asList("Java", "Python", "Ruby");
        Stream<String> languages2 = list.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 101),
                new Course("Data structure", 102),
                new Course("Micro Services", 103)
        );

        Stream<Course> stream = myCourses.stream();

    }
}
