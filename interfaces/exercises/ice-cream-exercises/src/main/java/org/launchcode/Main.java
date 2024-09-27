package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        FlavorComparator comparatorFlavor = new FlavorComparator();
        flavors.sort(comparatorFlavor);
        System.out.println(flavors);

       /* flavors.sort(new FlavorComparator());*/

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
   /*     cones.sort(new ConeComparator());
        System.out.println(cones);*/
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        ArrayList<Topping> toppings = menu.getToppings();

    }
}