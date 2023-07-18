package com.cydeo.java14;

public class SwitchCaseTest {
    public static void main(String[] args) {

        Days days = Days.SUNDAY;

        Days.print(days);

        String result = switch (days){
            case MONDAY, TUESDAY , WEDNESDAY ,THURSDAY,FRIDAY -> "Work day";
            case SATURDAY , SUNDAY -> "Weekend";
        };

        System.out.println(result);





    }
}
