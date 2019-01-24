
package com.collections;

import java.util.*;

/**
 *
 * @author Robert Palmer
 * This code is just for practice
 * 
 */
public class CollectionExample {
    
    // Create an array list to manipulate
    private static void heroArray() {
        List<String> goodGuys = new ArrayList<>();
        
        // List of my heroes
        goodGuys.add("Thor");
        goodGuys.add("Iron Man");
        goodGuys.add("Hulk");
        goodGuys.add("Captain America");
        goodGuys.add("Black Panther");
        
        System.out.println("****Inside Good Guys list****\n");
        // Printing in this manner prints everything on the same line
        System.out.println("These are the good guys in Avengers: " + goodGuys);
        
        // Displays a new list of heroes after 1 is removed
        goodGuys.remove(2);
        System.out.println("\n" + goodGuys);
        /*
         * New list is carried over and a newer list is displayed 
        */
        goodGuys.remove(2);
        System.out.println("\n" + goodGuys);
        
        System.out.println("\n");
        System.out.println(goodGuys.size());
        
        System.out.println("\n");
        goodGuys.add("Black Widow");
        System.out.println(goodGuys);
        System.out.println("==========================================");
        
        goodGuys.clear();// Clears the list. Start by adding new objects.
        
        if(goodGuys.isEmpty()) {
            System.out.println("All of the heroes are dead!");
        }
        else {
            System.out.println("You still have a chance to win! Don't die!");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        // This is where we will call our methods
        heroArray();
    }
}
