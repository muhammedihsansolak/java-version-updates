package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Predicate<Integer> isEven = a -> a % 2 ==0;
        Predicate<Integer> isOdd = Predicate.not(isEven); // ---> opposite of isEven predicate

        List<Integer> evenNumbers = list.stream()
                .filter(isEven)
                .toList();

    }
}
