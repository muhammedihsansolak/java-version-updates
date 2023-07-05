package com.cydeo.tasks;
@FunctionalInterface
public interface UnaryPredicate <T>{
    public boolean test(T obj);
}
