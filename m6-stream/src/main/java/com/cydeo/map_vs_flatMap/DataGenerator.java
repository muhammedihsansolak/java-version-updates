package com.cydeo.map_vs_flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class DataGenerator {
    public static Stream<Employee> data() {
        return Stream.of(
                new Employee(101, "Maxwell", "Ian06@example.com", Arrays.asList("123456789", "123456789")),
                new Employee(102, "Ozzy", "Ozzy44@example.com", Arrays.asList("567876543", "7645346576")),
                new Employee(103, "Sam", "Sam111@example.com", Arrays.asList("1257019587", "98174539871"))
        );
    }
}
