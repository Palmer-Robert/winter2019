package com.practice;


public class FirstFunction {
    // Who can use it - How it is used (public/static)
    public static int multiply(int firstNum, int secondNum){
        // Return is a special keyword
        // It means "take what's coming next and make it be what comes out of my function.
        return firstNum * secondNum;
    }
    
    public static void main(String[] args){
        int product = FirstFunction.multiply(3, 4);
        System.out.printf("3 * 4 = %d\n",product);
    }
}
