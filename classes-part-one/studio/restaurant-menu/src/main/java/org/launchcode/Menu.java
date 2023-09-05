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


    public void display(){
        ArrayList<MenuItem> appetizer = new ArrayList<MenuItem>();
        ArrayList<MenuItem> mainCourse = new ArrayList<MenuItem>();
        ArrayList<MenuItem> dessert = new ArrayList<MenuItem>();
       // ArrayList<MenuItem>[] categories = new ArrayList<MenuItem>{appetizer, mainCourse, dessert};

        for(MenuItem item : items){ //sort items into their categories
            if(item.getCategory().equals("____________________Appetizer____________________") ){
                appetizer.add(item);
            }
            if(item.getCategory().equals("____________________Main Course____________________")){
                mainCourse.add(item);
            }
            if(item.getCategory().equals("____________________Dessert____________________")){
                dessert.add(item);
            }
        }


        //print appetizers, main course, and dessert categories
        System.out.println("Appetizers:");
        for(MenuItem item : appetizer){
            System.out.println(item);
        }
        System.out.println("Main Course:");
        for(MenuItem item : mainCourse){
            System.out.println(item);
        }
        System.out.println("Dessert:");
        for(MenuItem item : dessert){
            System.out.println(item);
        }

        //code here
        //get a loop going through the different menu items, sort each into different categories for display. Then loop through each category and print the menuItem
        //remove: maybe have an id key that gets set when it's looping through different menu items? or just have the person type out its name and search for that...
    }

}

//Menu handles: constructing/compiling menuItems into different hashmaps (by category), date when last updated

   // The menu consists of several menu items
        // Each menu item has a price, description, and category (appetizer, main course, or dessert)
        // It should be possible to display whether a menu item is new or not
        //The app should know when the menu was last updated, so visitors can see that the restaurant
        //      is constantly changing and adding exciting new items