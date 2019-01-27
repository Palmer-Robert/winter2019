package com.junitTests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Robert Palmer
 */
public class RobertAssertions {
    
    /*
    This program tests all of the assertions. 
    This is a tesing sandbox to get to know the assertions methods.
    */
    @Test
    public void testing() {
        // Data to be tested
        String name = new String("Robert");
        String nickName = new String("Robert");
        String wife = new String("Nancy");
        String randomPerson = null;
        String brother = "Thomas";
        String uncle = "Thomas";
        
        int myAge = 39;
        int wifeAge = 32;
        
        int[] expected = {1, 2, 3, 100, 20};
        int[] result = {1, 2, 3, 100, 20};
        
        /* Checking to see if two objects are equal
         * If numeric values installed, must enter a third argument for accuracy
         * Expected resul and actual result must be entered in the parameter location
         * --> name is expected and nickName is actual result
         */
        assertEquals(name, nickName);
        
        /* Checking true condition. A condition must be entered to test the result
         * of both true and false statements.
        */
        assertTrue(myAge > wifeAge);
        
        // Checking false condition
        assertFalse(myAge == wifeAge);
        
        // Is this value null
        assertNotNull(name);
        
        // Is this value null
        assertNull(randomPerson);
        
        // Test if 2 object references point to the same object
        // This test did not work when name and nickName were used as the parameters.
        assertSame(brother, uncle);
        
        // Testing to see if 2 object references DO NOT point to the same objects
        assertNotSame(wife, randomPerson);
        
        // Checking to see if 2 arrays are equal
        assertArrayEquals(expected, result);
    }
}
