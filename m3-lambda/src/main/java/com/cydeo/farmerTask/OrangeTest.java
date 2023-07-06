package com.cydeo.farmerTask;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(150, Color.RED));
        inventory.add(new Orange(350, Color.GREEN));
        inventory.add(new Orange(180, Color.GREEN));

        OrangeFormatter orangeLambda = (orange) -> "An orange of " + orange.getWeight() + " Gr.";
        prettyPrintApple(inventory, orangeLambda);

        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + " Gr." );
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter) {
        for (Orange orange : inventory) {
            String output = orangeFormatter.function(orange);
            System.out.println(output);
        }
    }
}
