package com.cydeo.review;

public class Test {
    public static void main(String[] args) {
        User employee = new User("Max","Muhammed","SOLAK",Role.EMPLOYEE);
        System.out.println(Role.EMPLOYEE.ordinal());
    }

}
