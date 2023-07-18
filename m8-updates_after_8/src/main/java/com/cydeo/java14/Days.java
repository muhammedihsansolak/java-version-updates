package com.cydeo.java14;

public enum Days {
    MONDAY(1), TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    int value;

    Days(int value) {
        this.value = value;
    }

    public static void print(Days days){
        System.out.println(days+" value is: "+days.value);
    }

}
