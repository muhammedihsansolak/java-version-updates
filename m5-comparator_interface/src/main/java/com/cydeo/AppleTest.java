package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));
        inventory.add(new Apple(350,Color.GREEN));
        inventory.add(new Apple(180,Color.GREEN));

        Comparator<Apple> sortApple = comparing( (Apple apple) -> apple.getWeight() );
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort( comparing(Apple::getWeight) );

        //Chaining Methods
        inventory
                .sort( comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor) );

    }
}
