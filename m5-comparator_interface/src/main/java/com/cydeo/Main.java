package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20,50);
        System.out.println(list);

        Collections.sort(list);//ascending

        System.out.println(list);

        Collections.sort( list, new MyComparator() );//descending

        Collections.sort(list , (o1,o2) -> (o1>o2)? -1:(o1<o2)? 1 : 0);

        //***********************

        list.sort( (o1, o2) -> o1.compareTo(o2) );//---> Ascending
        System.out.println( list );

        list.sort( (o2, o1) -> o1.compareTo(o2) );//----> Descending
        System.out.println(list);





    }
}
