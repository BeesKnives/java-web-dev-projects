package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }


    public void addItem(MenuItem item){
        items.add(item);
    }

}

//Menu handles: constructing/compiling menuItems into different hashmaps (by category), date when last updated

   // The menu consists of several menu items
        // Each menu item has a price, description, and category (appetizer, main course, or dessert)
        // It should be possible to display whether a menu item is new or not
        //The app should know when the menu was last updated, so visitors can see that the restaurant
        //      is constantly changing and adding exciting new items