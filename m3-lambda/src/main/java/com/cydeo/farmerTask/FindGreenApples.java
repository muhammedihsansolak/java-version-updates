package com.cydeo.farmerTask;

public class FindGreenApples implements ApplePredicate{
    @Override
    public boolean find(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
