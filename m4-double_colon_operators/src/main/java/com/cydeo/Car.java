package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.function.Supplier;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }


    class CarTest {

        Supplier<Car> c1 = () -> new Car();
        Supplier<Car> c2 = Car::new;
        //we can use double coma for calling constructor

    }
}
