package com.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/**
 *
 * @author palmerfam
 */
public class Application {
    public static void main(String[] args){
        Executor execute = Executors.newCachedThreadPool();
        BankAccount task = new BankAccount();
        execute.execute(task);
        task.setBalance(100);
        Thread robert = new Thread(task);
        Thread nancy = new Thread(task);
        robert.setName("Robert");
        nancy.setName("Nancy");
        robert.start();
        nancy.start();
        
        
    }
}
