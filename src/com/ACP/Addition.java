package com.ACP;


public class Addition implements MathHandler {
    
    public void handleIt(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        System.out.println("Your answer: " + sum);
    }
}
