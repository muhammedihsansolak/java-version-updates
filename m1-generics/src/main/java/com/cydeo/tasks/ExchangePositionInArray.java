package com.cydeo.tasks;

import java.util.Arrays;

public class ExchangePositionInArray {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4};
        System.out.println(Arrays.toString( swap(arr, 0, 2) ));

    }

    private static <T> T[] swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}
