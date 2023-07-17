package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        System.out.println(optional.orElseThrow());

        System.out.println(optional.orElseThrow( () -> new RuntimeException() ));
    }
}
