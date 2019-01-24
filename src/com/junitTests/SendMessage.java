package com.junitTests;

/**
 *
 * @author Robert Palmer
 * 
 */
public class SendMessage {
    
    private String message = "Hello World!";

    // Constructor function
    public SendMessage(String message) {
        this.message = message;
    }
    
    // method to print message
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
