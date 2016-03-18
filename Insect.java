package com.company;

/**
 * Created by qs1685mv on 3/17/2016.
 */
public abstract class Insect {
    protected String name;
    protected int wings;
    protected static final int legs = 6;

    public void setName(String name) {
        this.name = name;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public String getName() {
        return name;
    }

    public int getWings() {
        return wings;
    }

    public int getLegs() {
        return legs;
    }

    public abstract void printSpeciesData();
}