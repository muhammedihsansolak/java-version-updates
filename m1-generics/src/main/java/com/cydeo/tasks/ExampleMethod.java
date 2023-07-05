package com.cydeo.tasks;

import java.util.List;

public class ExampleMethod {

    public static void print( List<? extends Number> list ){
        for (Number number : list) {
            System.out.println(number+" ");
            System.out.println();
        }
    }
    //code will compile because list can be a List of any type that is a subtype of Number (including Number itself).


}
