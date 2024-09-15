package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Allow for default constructor


    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }
}
