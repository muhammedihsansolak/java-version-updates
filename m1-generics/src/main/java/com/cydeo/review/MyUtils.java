package com.cydeo.review;

import java.util.List;

public class MyUtils<T extends Person> {
    //if you use generic in class level, static content can not accept it. Because static fields created before objects
    //T must be a type that extend Person class ONLY

    public void print(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
        System.out.println("Total: "+list.size());
    }

    public T getLastItem(List<T> list){
        return list.get( list.size()-1 );
    }

}
