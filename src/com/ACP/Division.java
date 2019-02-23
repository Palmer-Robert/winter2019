package com.ACP;

/**
 *
 * @author palmerfam
 */
public class Division implements MathHandler {
    public void handleIt(Integer num1, Integer num2) {
        Integer div = num1 / num2;
        System.out.println("Your answer: " + div);
    }
}
