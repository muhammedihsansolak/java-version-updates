package com.cydeo.messageTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Max", 24, Gender.MALE);
        Person p2 = new Person("Ozzy", 35, Gender.MALE);
        Person p3 = new Person("Elizabeth", 28, Gender.FEMALE);
        Person p4 = new Person("Jamal", 33, Gender.MALE);

        List<Person> list = new ArrayList<>(Arrays.asList( p1,p2,p3,p4 ));

        CheckMember checkMember = p -> p.getGender() == Gender.MALE && p.getAge()>=18 && p.getAge()<=25;

        print(list,checkMember);
    }

    private static void print(List<Person> list, CheckMember checkMember){
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (checkMember.test(person)) result.add(person);
        }
        System.out.println(result);
    }

}
