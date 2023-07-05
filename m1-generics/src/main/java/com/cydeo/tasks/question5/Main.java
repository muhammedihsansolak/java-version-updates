package com.cydeo.tasks.question5;

public class Main {

    public static void main(String[] args) {

        Node<Circle> nc = new Node<>();
        //Node<Shape> ns = nc;

        /*
        The reason it gives error that generic types are not covariant in Java. In other words, even though Circle is a subtype of Shape, Node<Circle> is not a subtype of Node<Shape>. The type parameters must match exactly.

        To make the code compile, you can use wildcard types to indicate that the generic type parameter of ns can be any type that is a supertype of Circle.
        ** Node<? extends Shape> ns = nc; **
         */
    }
}
