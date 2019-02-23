package com.ACP;

/**
 *
 * @author palmerfam
 */
public class Subtraction implements MathHandler {
    public void handleIt(Integer num1, Integer num2) {
        Integer diff = num1 - num2;
        System.out.println("Your answer: " + diff);
    }
}
