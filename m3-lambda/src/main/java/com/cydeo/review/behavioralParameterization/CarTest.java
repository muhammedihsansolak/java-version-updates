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
        //behaviour parameterization

        System.out.println("Fast cars:");
        System.out.println( filter( list, new CarFastPredicate() ) );
        System.out.println("New cars:");
        System.out.println( filter( list, new CarNewPredicate() ) );

        System.out.println("---------------");
        //lambda

        CarPredicate fastCarPredicate = car -> car.getTopSpeed()>160;

        System.out.println("New Cars");
        System.out.println( filter(list, car -> car.getYear() > 2015) ); // true - false
        System.out.println("Fast Cars");
        System.out.println( filter(list, fastCarPredicate) );


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
