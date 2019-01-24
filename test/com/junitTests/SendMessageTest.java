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
public class SendMessageTest {
    
    public SendMessageTest() {
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
     * Test of printMessage method, of class SendMessage.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        SendMessage instance = null;
        String expResult = "Hello World!";
        String result = instance.printMessage();
        assertEquals(expResult, result);
    }
    
}
