package com.cydeo.map_vs_flatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {
    private int ID;
    private String name, eMail;
    private List<String> phoneNumbers;
}
