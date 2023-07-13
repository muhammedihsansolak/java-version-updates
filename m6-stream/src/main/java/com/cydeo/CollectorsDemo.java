package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;
import com.cydeo.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //IN ORDER TO USE COLLECTORS, WE HAVE TO FIRST CALL COLLECT() METHOD


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //.collect( Collectors.toCollection() )
        //**** toCollection() ****

        ArrayList<Integer> result =
                list.stream()
                        .filter(p -> p % 2 == 0)
                        //.collect(Collectors.toCollection( () -> new ArrayList<>()) );
                        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

        Set<Integer> result2 =
                list.stream()
                        .map(p -> p * 2)
                        .collect(Collectors.toCollection(HashSet::new));

        System.out.println(result2);

        //**** toList() ****
        List<Integer> result3 =
                list.stream()
                        .filter(p -> p < 5)
                        .collect(Collectors.toList());

        System.out.println(result3);

        //**** toSet() ****
        Set<Integer> result4 =
                list.stream()
                        .map(p -> p + 1)
                        .collect(Collectors.toSet());

        System.out.println(result4);

        //**** toMap(Function,Function) ****

        Map<String, Integer> map =
                DishData.getAll().stream()
                        .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(map);

        //**** summingInt(ToIntFunction) ****
        Integer sum =
                DishData.getAll().stream()
                        .collect(Collectors.summingInt(p -> p.getCalories()));

        System.out.println(sum);

        //counts the number of elements. return Long
        //**** counting() ****

        long result5 =
                list.stream()
                        .filter(p -> p%2 != 0)
                        .collect(Collectors.counting());
        System.out.println(result5);

        //returns average of given elements
        //**** averagingInt(ToIntFunction) ****

        double averageCalories =
                DishData.getAll().stream()
                        .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(averageCalories);


        //joining(): is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        //returns:  Map< Boolean, List<T> >
        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //returns:  Map< K, List<T> >
        //groupingBy(); is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);

    }
}
