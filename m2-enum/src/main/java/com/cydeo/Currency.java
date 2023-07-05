package com.cydeo;

public enum Currency {
    PENNY(1), // *PENNY* is a fixed constant object of a Currency class
    NICKLE(5),
    DIME(10),
    QUARTER(25); //---> assigning a value to the constants

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
