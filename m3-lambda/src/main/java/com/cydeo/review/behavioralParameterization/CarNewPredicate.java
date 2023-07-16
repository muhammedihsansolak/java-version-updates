package com.cydeo.review.behavioralParameterization;

public class CarNewPredicate implements CarPredicate {


    @Override
    public boolean test(Car car) {
        return car.getYear() > 2015;
    }
}
