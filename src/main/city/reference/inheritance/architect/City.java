package main.city.reference.inheritance.architect;

import main.city.reference.inheritance.infrastructure.Building;

import java.util.ArrayList;

public class City {

    ArrayList<Building> buildings = new ArrayList<Building>();

    private String name;
    private int population;


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
