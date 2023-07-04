package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T> {//T-Soccer or Football or Baseball

    private String name;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(  ((Player)player).getName()  +" is already on the team");
            return false;
        }
        System.out.println(  ((Player)player).getName()  +" is picked for the team"+this.name);
        return members.add(player);
    }
}
