package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;

import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {

        //accepts an Integer and binary operator --> Integer is starting point, binary operator is your goal

        //if you do not declare starting point, code will work but return type gonna be Operator

        List<Integer> list = List.of(5, 4, 7, 9);
        /*
        OLD WAY -->
        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }*/

        int result =
                list.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println(result);

        //TOTAL CALORIES OF DISH'S

        int totalCal =
                DishData.getAll().stream()
                        .map(Dish::getCalories)
                        //.reduce(0, (a,b) -> a+b);
                        .reduce(Integer::sum).get();

        System.out.println(totalCal);

    }
}
