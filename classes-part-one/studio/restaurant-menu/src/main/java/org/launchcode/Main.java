package org.launchcode;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.LocalDate.now;

public class Main {
    LocalDate lastUpdated = LocalDate.now(); //_______make menu parts and new menu
    ArrayList<MenuItem> items = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    Menu menu = new Menu(lastUpdated, items);


    public static void main(String[] args) {
	    // write your code here

        //_____________________________________________make menuItem
//        Main newMain = new Main();
//        newMain.newItemPrompt();
        Main main = new Main();
        main.newItem();

    }

//    public void newItemPrompt(){
//        System.out.println("Add a new menu item? (y/n)");//________prompt for adding a menu item
//        String addItem = input.nextLine();
//        if(addItem.equals("y")){
//
//            main.newItem();
//        }
//    }

    public void newItem() {
        System.out.println("Add a new menu item? (y/n)");//________prompt for adding a menu item
        String addItem = input.nextLine();
        while(addItem.equals("y")) {


            //Scanner input = new Scanner(System.in);//________________________get info you need


            System.out.println("Item Name: ");
            String name = input.nextLine();
            System.out.println("Price: $");
            Double price = input.nextDouble();
            input.nextLine();
            System.out.println("Description: ");
            String description = input.nextLine();
            String category = "";  //____________CATEGORY START - asking the user to input a # and setting category to the corresponding word
            do {
                if (category.equals("try again")) {
                    System.out.println("Incorrect input, try again:");
                }
                System.out.println("1: Appetizer, 2: Main Course, 3: Dessert ");
                System.out.println("Pick a category (1, 2, 3)");
                category = input.nextLine();
                switch (category) {
                    case "1":
                        category = "Appetizer";
                        break;
                    case "2":
                        category = "Main Course";
                        break;
                    case "3":
                        category = "Dessert";
                        break;
                    default:
                        category = "try again";
                }
            } while (category.equals("try again")); //________CATEGORY END
            System.out.println("Is this a new item? true/false");
            Boolean isNew = input.nextBoolean();
            input.nextLine();


            //______________________________________________________make new MenuItem, add it to menu

            MenuItem menuItem = new MenuItem(name, price, description, category, isNew);
            menu.addItem(menuItem);

            //______________________________________________________display menu
            menu.display();

            System.out.println("Add a new menu item? (y/n)");//________prompt for adding a menu item
            addItem = input.nextLine();
        }


    }





//        if (category.equals("1")){
//            category = "Appetizer";
//        }


        // get info you need
        //make new MenuItem? (MenuItem(things you need)     MenuItem name = new MenuItem(params)
        //add new MenuItem to Menu (Menu.addItem())



}


// The menu consists of several menu items
// Each menu item has a price, description, and category (appetizer, main course, or dessert)
// It should be possible to display whether a menu item is new or not
//The app should know when the menu was last updated, so visitors can see that the restaurant
//      is constantly changing and adding exciting new items


//should print:
// restaurant name

//Menu:

// Category:

// (if new or not) menu item: name, price: $
//brief description

// (if new or not) menu item: name, price: $
//brief description

// (if new or not) menu item: name, price: $
//brief description



//Menu handles: constructing/compiling menuItems into different hashmaps (by category), date when last updated
//MenuItem handles: name, price, category, description, new(t or f)
