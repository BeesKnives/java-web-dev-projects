package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator<Flavor> flavorComparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("________________FLAVORS_______________");
        for (Flavor i : flavors){
            System.out.println(i.getName());
        }
        System.out.println("________________sorted");
        flavors.sort(flavorComparator);
        for (Flavor i : flavors){
            System.out.println(i.getName());
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("________________CONES__________________");
        for (Cone i : cones){
            System.out.println(i.getCost());
        }

        System.out.println("________________sorted");
        cones.sort(new ConeComparator());
        for (Cone i : cones){
            System.out.println(i.getCost());
        }



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}