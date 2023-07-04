package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if (members.contains(player)){
            System.out.println(player.getName()+" is already on the team");
            return false;
        }
        System.out.println(player.getName()+" is picked for the team"+this.name);
        return members.add(player);
    }
}
