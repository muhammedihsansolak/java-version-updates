package com.cydeo.java12;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class TeeingDemo {
    public static void main(String[] args) {


        List<Employee> list = Arrays.asList(
                new Employee(01,"Max",BigDecimal.ONE),
                new Employee(02,"Mike",BigDecimal.TWO),
                new Employee(03,"Ozzy",BigDecimal.TEN),
                new Employee(03,"Max",BigDecimal.valueOf(10))
        );

        Map<String,Employee> result = list.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                (e1,e2) -> {
                    HashMap<String, Employee> map = new HashMap<>();
                    map.put("Max",e1.get());
                    map.put("Mın",e2.get());
                    return map;
                }));
        System.out.println(result);

    }
}

