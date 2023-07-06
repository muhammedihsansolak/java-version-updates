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

        /*
        OrangeFormatter printBasedOnWeight = (orange) -> "An orange of " + orange.getWeight() + " Gr.";
        prettyPrintApple(inventory, printBasedOnWeight);
         */

        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + " Gr." );

        OrangeFormatter printBasedOnColor = (orange) -> {
            String result = orange.getWeight() > 200 ? "heavy" : "light";
            return "A "+result+" "+orange.getColor()+" orange.";
        };
        prettyPrintApple(inventory,printBasedOnColor);
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter ) {
        for (Orange orange : inventory) {
            String output = orangeFormatter.function(orange);
            System.out.println(output);
        }
    }
}
