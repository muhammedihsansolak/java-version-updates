package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,2,10,23);

        //**** empty() & isPresent() ****

        Optional<String> empty = Optional.empty();
        System.out.println(empty);// "Optional.empty" printed
        System.out.println(empty.isPresent());// checks if the given object is existing

        //**** of() ****

        System.out.println( Optional.of(numbers).isPresent() );

        //**** ifPresent() ****

        Optional<Integer> bigNumber = numbers.stream().filter(p -> p>100).findAny();

        bigNumber.ifPresent(System.out::println);

        //**** get() ****

       // System.out.println(bigNumber.get()); // NoSuchElementException

        //**** orElse() ****

        System.out.println( bigNumber.orElse(5) );


    }
}
