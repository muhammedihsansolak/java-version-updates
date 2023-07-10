package com.cydeo;

import lombok.*;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
@ToString
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

}
