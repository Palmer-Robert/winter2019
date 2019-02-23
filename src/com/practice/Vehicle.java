
package com.practice;

import java.util.*;

/**
 *
 * @author Robert Palmer
 * Taken from Java: A Beginner's Guide
 */
public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;
    
    private static void carList() {
        
        List<String> cars = new ArrayList<>();
        // Allows duplicate elements
        cars.add("Cutlass");
        cars.add("Jeep");
        cars.add("Camry");
        cars.add("Sienna");
        cars.add("Sequoia");
        cars.add("Focus");
        cars.add("impala");
        
        System.out.println("\nInside ArrayList...\n");
        for(String h : cars) {
            System.out.println(h);
        }
        
        cars.add("Sienna");
        System.out.println("\n" + cars);
    }
    
    public static void carList2(){
        // Does not allow duplicate elements
        HashSet<String> cars2 = new HashSet<String>();
        
        cars2.add("Cutlass");
        cars2.add("Jeep");
        cars2.add("Camry");
        cars2.add("Sienna");
        cars2.add("Sequoia");
        cars2.add("Focus");
        cars2.add("impala");
        
        System.out.println("\nInside HashSet...\n");
        for(String h2 : cars2){
            System.out.println(h2);
        }
        
        cars2.add("Sienna");
        System.out.println(cars2);
    }
    
    public static void main(String[] args) {
        carList();
        carList2();
    }
}
