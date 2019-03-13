package com.threads.realTime;


public class Multithread {
    public static void main(String[] args){
        
        String[] names = {"Robert", "Nancy", "Addison", "Davin", "Janey"};
        for(int i = 0; i <= names.length; i++){
            NameThread obj = new NameThread();
            obj.start();
        }
    }
}
