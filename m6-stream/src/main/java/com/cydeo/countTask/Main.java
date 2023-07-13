package com.cydeo.countTask;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;

public class Main {

    //How would you count the number of dishes in a stream using the map and reduce methods?

    public static void main(String[] args) {

        int numberOfDish =
                DishData.getAll().stream()
                        .map(dish -> 1)//in order to count every dish object in reduce method, I converted every dish object to "1"
                        .reduce(Integer::sum).get();

        System.out.println("Number of dishes: "+numberOfDish);


    }

}
