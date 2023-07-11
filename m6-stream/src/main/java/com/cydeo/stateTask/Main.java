package com.cydeo.stateTask;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataGenerator.data().stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
