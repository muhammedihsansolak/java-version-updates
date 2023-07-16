package com.cydeo.review.enumAbstractMethod;

public enum Color {

    //Anonymous Class

    RED{
        @Override
        public void print(){
            System.out.println("Red");
        }
    },
    BLUE{
        @Override
        public void print(){
            System.out.println("Blue");
        }
    },
    GREEN{
        @Override
        public void print(){
            System.out.println("Green");
        }
    };

    public abstract void print();
}
