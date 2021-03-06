package com.company;
import java.util.*;

public class InsectManager {

    public static void main(String[] args) {
        LinkedList<Insect> insects = new LinkedList<>();
        //create two Butterfly objects
	    Butterfly mon = new Butterfly("Monarch", 4, "orange & black", "milkweed");
        insects.add(mon);
        Butterfly cys = new Butterfly("Common Yellow Swallowtail", 4, "yellow & black", "milk parsley");

        mon.printSpeciesData();
        cys.printSpeciesData();



        //create two Bee objects
        Bee hb = new Bee("Honey Bee", 4, "yellow & black", true, "Jasmine");
        Bee bb = new Bee("Bumble Bee", 4, "yellow, black & white", false,"clover");

        hb.printSpeciesData();
        bb.printSpeciesData();
    }

    // create linked list to loop thru all insects

}
