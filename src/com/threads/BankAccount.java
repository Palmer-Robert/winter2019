package com.threads;

import java.util.Scanner;

/**
 * Sandbox code
 */
public class BankAccount implements Runnable{
    // Variable/Attribute
    private int balance;
    // Contructor
    public void setBalance(int balance){
        this.balance = balance;
    }
    
    // Run method
    public void run(){
        makeWithdrawal();
        if(balance < 0){
            System.out.println("Money overdrawn!");
        }
    }
    
    private synchronized void makeWithdrawal(){
        
        Scanner cashout = new Scanner(System.in);
        System.out.println("Enter amount: ");
        
        int amount = cashout.nextInt();
        int bal = balance -= amount;
        System.out.println("Balance: " + bal);
        if(balance >= amount){
            System.out.println("\n" + Thread.currentThread().getName() + " has withdrawn $" + amount);
            
        } else if(balance <= 0){
            System.out.println("Sorry, " + Thread.currentThread().getName() + ". Insufficient funds!");
               
        }
    }
}
