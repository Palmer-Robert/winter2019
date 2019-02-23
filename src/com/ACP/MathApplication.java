package com.ACP;

import java.util.Scanner;

/**
 * This class is the application that the user has interaction with. 
 * The user inputs numbers and a symbol which outputs a mathematical equation
 * and answer.
 */
public class MathApplication {
    public static void main(String[] args) {
        AppController deligates = new AppController();
        
//        String add = "add";
//        String sub = "sub";
//        String mult = "mult";
//        String div = "div";
        String command;
        Integer num1;
        Integer num2;
        
        // User input
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter an integer: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.print("Enter symbol(+, -, *, /): ");
        command = in.nextLine();
        System.out.print("Enter second integer: ");
        num2 = Integer.parseInt(in.nextLine());
        
        // Output
        System.out.println(num1 + " " + command + " " + num2);
        deligates.executeNumbers(command, num1, num2);
    }
}
