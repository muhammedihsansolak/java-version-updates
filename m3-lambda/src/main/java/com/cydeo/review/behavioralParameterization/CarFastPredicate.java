package com.cydeo.review.behavioralParameterization;

public class CarFastPredicate implements CarPredicate{

    @Override
    public boolean test(Car car) {
        return car.getTopSpeed() > 160;
    }
}
