package com.cydeo.stateTask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class State {

    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city) {
        cities.add(city);
    }

    public List<String> getCities() {
        return this.cities;
    }
}
