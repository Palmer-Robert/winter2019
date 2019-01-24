/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palmerfam
 */
public class MultiplyTwoNumbersTest {
    
    public MultiplyTwoNumbersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiply method, of class MultiplyTwoNumbers.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int numb1 = 10;
        int numb2 = 20;
        MultiplyTwoNumbers instance = new MultiplyTwoNumbers();
        int expResult = 200;
        int result = instance.multiply(numb1, numb2);
        assertEquals(expResult, result);
    }
    
    
}
