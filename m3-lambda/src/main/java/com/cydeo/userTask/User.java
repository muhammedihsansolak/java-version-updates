package com.cydeo.userTask;

import lombok.*;
/*
@ToString
@Setter
@Getter
@AllArgsConstructor
 */
@Data //--> Getter,Setter,ToString and NoArgConstructor
@AllArgsConstructor
public class User {
    private String firstName, lastName;
    private int age;
}
