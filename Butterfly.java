package com.company;

/**
 * Created by qs1685mv on 3/17/2016.
 */
public class Butterfly extends Insect {
    protected String wingColor;
    protected String favFlower;

    public Butterfly(String name, int wings, String wingColor, String favFlower) {
        this.name = name;
        this.wings = wings;
        this.wingColor = wingColor;
        this.favFlower = favFlower;
    }

    public void printSpeciesData() {
        System.out.println ("Name = " + this.name + ", Leg Count = " + this.legs + ", Wing Count = " + this.wings + ", Wing Color = " + this.wingColor + ", Favorite Flower = " + this.favFlower + ".");
    }
}
