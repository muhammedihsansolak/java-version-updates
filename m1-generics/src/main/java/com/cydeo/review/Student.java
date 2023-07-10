package com.cydeo.review;

import lombok.*;

//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student extends Person {
    private String name;
    private final int id;

//if there is inheritance, lombok can not call super class constructor by using "super()". for conclusion, if there is inheritance avoid using lombok for constructors
}
