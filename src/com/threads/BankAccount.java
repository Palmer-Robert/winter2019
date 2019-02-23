package com.threads;

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
        makeWithdrawal(75);
        if(balance < 0){
            System.out.println("Money overdrawn!");
        }
    }
    
    private void makeWithdrawal(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " withdrawing ...");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn $" + amount);
            
        } else if(balance <= 0){
            
            System.out.println("Sorry, " + Thread.currentThread().getName() + ". Insufficient funds!");
        }
    }
}
