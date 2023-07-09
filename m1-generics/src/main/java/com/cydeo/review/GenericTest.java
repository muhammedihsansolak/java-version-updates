package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Muhammed",101));
        studentList.add(new Student("Cundullah",102));
        studentList.add(new Student("Elif",103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Adam",201));
        teacherList.add(new Teacher("Severus",202));

        //write a method that takes list of students, prints each student and the total student count
        print(studentList);
        print(teacherList);

    }
    public static <T> void print(List<T> list){ //in order to apply it for all object we use generic
        for (T each : list) {
            System.out.println(each);
        }
        System.out.println("Total: "+list.size());
    }

    public static <I> I getLastItem(List<I> list){
        return list.get( list.size()-1 );
    }
}
