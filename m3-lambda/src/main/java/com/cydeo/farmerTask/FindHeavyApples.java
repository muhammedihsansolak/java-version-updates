package com.cydeo.farmerTask;

public class FindHeavyApples implements ApplePredicate{
    @Override
    public boolean find(Apple apple) {
        return apple.getWeight()>200;
    }
}
