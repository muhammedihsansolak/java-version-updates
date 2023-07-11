package com.cydeo.stateTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DataGenerator {

    public static List<State> data(){
        return List.of(
                new State("VA",Arrays.asList("Ankara","Manisa","İzmir")),
                new State("HU", List.of("Düzce","Çorum","Yozgat")),
                new State("OK", List.of("Bursa","Istanbul","Edirne"))
        );
    }
}
