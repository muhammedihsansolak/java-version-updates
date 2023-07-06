package com.cydeo.userTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("Maxwell","Ian",24));
        list.add(new User("Tom","Cruse",55));
        list.add(new User("Anna","Gateway",37));


        //print all elements in the list
        printName(list, p -> true);

        //print all people that last name starts with I

        printName(list, p -> p.getLastName().startsWith("I"));
    }
    private static void printName(List<User> list, Predicate<User> predicate){
        for (User user : list) {
            if (predicate.test(user)) System.out.println(user.toString());
        }
    }
}
