package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Resteraunt {

    public static void main(String[] args) {
        // write your code here
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu(new Date(), menuItems);

        MenuItem pasta = new MenuItem(5.99, "Italian Noodles", "Entree", true);
        MenuItem pizza = new MenuItem(99.99, "ZAAAAA", "Entree", false);

        menu.addItem(pasta);
        menu.addItem(pizza);
        menu.addItem(pizza);
        System.out.println(menu.printSingleFood(pasta));
        System.out.println(menu.printFullMenu());
        menu.removeItem(pasta);
        System.out.println(menu.printFullMenu());
        System.out.println("The Menu was last updated on " + menu.getLastUpdated());

    }
}
