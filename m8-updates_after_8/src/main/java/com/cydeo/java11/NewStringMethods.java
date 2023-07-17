package com.cydeo.java11;

public class NewStringMethods {
    public static void main(String[] args) {

        //repeat()

        String str = "Muhammed";
        System.out.println((str+ " " ).repeat(10));

        //isBlank()

        String s = "   ";
        System.out.println(s.isBlank()); // true

        //lines()

        String names = "Muhammed \nMaxwell \nOzzy";
        names.lines().forEach(System.out::println);

    }
}
