package com.ACP;

/**
 *
 * @author palmerfam
 */
public class Multiplication implements MathHandler {
    public void handleIt(Integer num1, Integer num2) {
        Integer times = num1 * num2;
        System.out.println("Your answer: " + times);
    }
}
