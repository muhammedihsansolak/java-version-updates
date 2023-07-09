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
    }
    public static void print(List<Student> list){
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("Total student: "+list.size());
    }
}
