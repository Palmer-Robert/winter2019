package com.ACP;

import java.util.HashMap;

/**
 *
 * @author palmerfam
 */
public class AppController {
    public static HashMap<String, MathHandler> command = new HashMap<String, MathHandler>();
    
    
    public static void executeNumbers(String aCommand, Integer num1, Integer num2) {
        
        command.put("+", new Addition());
        command.put("-", new Subtraction());
        command.put("*", new Multiplication());
        command.put("/", new Division());
        
        
        MathHandler handler = command.get(aCommand);
        
        handler.handleIt(num1, num2);
    }
}
