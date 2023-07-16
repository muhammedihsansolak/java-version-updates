package com.cydeo.review.behavioralParameterization;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>(List.of(
                new Car("Toyota", 140, 1998),
                new Car("Audi", 200, 2008),
                new Car("BMW", 210, 2020),
                new Car("Nissan", 170, 2018)
        ));
        System.out.println("Fast cars:");
        System.out.println(filter(list, new CarFastPredicate()));
        System.out.println("New cars:");
        System.out.println(filter(list, new CarNewPredicate()));

    }
    //we have one "test()" method in interface. We implemented them in subclasses of this interface. If we want to call both of them in same method we can use polymorphism. We use implemented versions of "test()" method for achieve different behaviours.
    private static List<Car> filter(List<Car> list, CarPredicate carPredicate){

        List<Car> filtered = new ArrayList<>();

        for (Car car : list) {
            if ( carPredicate.test(car) ){
                filtered.add(car);
            }
        }
        return filtered;
    }

}
