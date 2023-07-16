package com.cydeo.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Car {
    private String make;
    private int topSpeed, year;

}
