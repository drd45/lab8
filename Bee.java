package com.company;

/**
 * Created by qs1685mv on 3/17/2016.
 */
public class Bee extends Insect {
    protected String color;
    protected boolean honey;
    protected String favFlower;

    public Bee(String name, int wings, String color, boolean honey, String favFlower) {
        this.name = name;
        this.wings = wings;
        this.color = color;
        this.honey = honey;
        this.favFlower = favFlower;
    }

    public void printSpeciesData() {
        String honeyStatus;
        if (this.honey) {
            honeyStatus = "This bee does make honey.";
        } else {
            honeyStatus = "This bee does not make honey.";
        }
        System.out.println ("Name = " + this.name + ", Leg Count = " + getLegs() + ", Wing Count = " + this.wings + ", Color = " + this.color + ", Favorite Flower = " + this.favFlower + ".  " + honeyStatus);
    }
}
