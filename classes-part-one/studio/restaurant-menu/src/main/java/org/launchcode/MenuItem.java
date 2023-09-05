package org.launchcode;

import java.util.Scanner;

public class MenuItem {
    private final String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }
    public String getCategory(){
        return category;
    }

    public String toString(){ //special method
        if (isNew){
            return "New! " + name + ": $" + price + " (" + description + ")";
        }
        return name + ": $" + price + " (" + description + ")";
    }





}



// The menu consists of several menu items
// Each menu item has a price, description, and category (appetizer, main course, or dessert)
// It should be possible to display whether a menu item is new or not
//The app should know when the menu was last updated, so visitors can see that the restaurant
//      is constantly changing and adding exciting new items