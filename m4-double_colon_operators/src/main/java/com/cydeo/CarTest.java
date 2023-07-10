package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //NoArgsConstructor
        Supplier<Car> c1 = () -> new Car();
        Supplier<Car> c2 = Car::new;
        //we can use double coma for calling constructor

        //OneArgsConstructor
        Function<Integer, Car> c3 = model -> new Car(model);
        Function<Integer, Car> c4 = Car::new;

        //TwoArgsConstructor
        BiFunction<String, Integer, Car> c5 = Car::new;
        System.out.println(c5.apply("Mercedes", 2022));
    }
}
