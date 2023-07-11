package com.cydeo.map_vs_flatMap;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //print all emails
        DataGenerator.data()
                .map(Employee::getEMail)
                .forEach(p-> System.out.println(p));

        //print all phone numbers
        DataGenerator.data()
               // .map(Employee::getPhoneNumbers) //---> this returns Stream<List<String>> [123456789, 123456789] I want a method that returns String. flatMAp() accepts stream object and returns String
                .flatMap(p->p.getPhoneNumbers().stream())
                .forEach(System.out::println);

        //clean code-->
        DataGenerator.data()
                .map(Employee::getPhoneNumbers)
                .flatMap(List::stream)//--> before this operation we have a List of phones, so we can call list class stream operator directly
                .forEach(System.out::println);



    }
}
