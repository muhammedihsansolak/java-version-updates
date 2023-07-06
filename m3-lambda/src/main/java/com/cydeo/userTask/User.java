package com.cydeo.userTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class User {
    private String firstName, lastName;
    private int age;
}
