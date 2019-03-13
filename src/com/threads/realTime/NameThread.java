package com.threads.realTime;


public class NameThread extends Thread {
    
    public void run(){
        try {
            System.out.println("Thread "
            + Thread.currentThread().getName() + " is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}