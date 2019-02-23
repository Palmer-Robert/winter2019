
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
        System.out.println(goodGuys.size());// Returns the size of the list in integer.
        
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
    
    private static void myHash() {
        
    }
    
    private static void myTreeSet() {
        // Tree set object created
        TreeSet ts = new TreeSet();
        
        //Add an element to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        
        //This should print the list in alphabetical order.
        for(Object i : ts) {
        System.out.println(i);
        }
        
        //Show how many elements there are in this object
        System.out.println(ts.size());
    }
    
    
    
    
    public static void main(String[] args) {
        // This is where we will call our methods
        //heroArray();
        //myHash();
        myTreeSet();
    }
}
