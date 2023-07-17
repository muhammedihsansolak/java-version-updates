package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeInferenceDemo {
    public static void main(String[] args) {

        //Type Inference --> Compiler can understand the type of data. We do not have to explicitly define it.
        //In java 10 "var" concept has come. var --> any type of variable
        //var variable ONLY be local variables. We can not use for instance variables

        var str = "Cydeo";

        var number = 24;

        var list = Arrays.asList(1,2,3,4,5);





    }
}
