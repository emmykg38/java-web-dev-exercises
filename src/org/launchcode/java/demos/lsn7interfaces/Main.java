package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneCompare = new ConeComparator();



        //Use a Comparator class to sort the 'flavors' array alphabetically by the 'name field.

        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        flavors.sort(comparator);

        System.out.println("\n**flavors sorted**");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\n*cones, no sort*");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(coneCompare);

        System.out.println("\n**cones, sorted**");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }


    }
}
