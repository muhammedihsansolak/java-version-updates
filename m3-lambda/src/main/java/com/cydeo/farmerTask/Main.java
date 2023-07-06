package com.cydeo.farmerTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));
        inventory.add(new Apple(350,Color.GREEN));
        inventory.add(new Apple(180,Color.GREEN));

        System.out.println(  filterApple(inventory, new FindGreenApples() )  );
        System.out.println(  filterApple(inventory, new FindHeavyApples() )  );




    }
    private static List<Apple> filterApple(List<Apple> inventory , ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.find(apple)){
                result.add(apple);
            }
        }
        return result;
    }



}
