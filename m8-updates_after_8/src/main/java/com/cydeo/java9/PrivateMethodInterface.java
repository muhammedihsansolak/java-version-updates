package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        if ( date.isBefore(LocalDate.of(2001,01,01)) ){
            throw new RuntimeException();
        }
        LocalDate nextDate = date.plusDays(1);
        return !isHoliday(nextDate);
    }

    default LocalDate nextDay(LocalDate date){
        if ( date.isBefore(LocalDate.of(2001,01,01)) ){
            throw new RuntimeException();
        }
        LocalDate nexDate = date.plusDays(1);
        return isHoliday(nexDate)? nextDay(nexDate) : nexDate;
    }
    // only accessible in interface
    private void validate(LocalDate date){
        if ( date.isBefore(LocalDate.of(2001,01,01)) ){
            throw new RuntimeException();
        }
    }

}
