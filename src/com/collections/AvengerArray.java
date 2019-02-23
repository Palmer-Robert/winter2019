
package com.collections;

import java.util.*;
/**
 *
 * @author Robert Palmer
 * 
 */
public class AvengerArray extends Avengers{
    
    public static void arrayList() {
        List<String> hero = new ArrayList<>();
    
        hero.add("Iron Man");
        hero.add("Thor");
        hero.add("Black Panther");
        
        
        
        for(String i : hero) {
            if(hero.contains("Thor")) {
                System.out.println("What's up " + hero + "?");
            }
        }
        
        
    } 
    
    public static void main(String[] args) {
        arrayList();
    }
}
