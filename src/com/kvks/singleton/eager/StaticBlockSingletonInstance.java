package com.kvks.singleton.eager;

public class StaticBlockSingletonInstance {

    private static StaticBlockSingletonInstance singletonInstance;

    private StaticBlockSingletonInstance(){}

    static{
        try {
            singletonInstance = new StaticBlockSingletonInstance();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton object");
        }
    }

    public static StaticBlockSingletonInstance getInstance(){
        return singletonInstance;
    }

    public void getMessage(){
        System.out.println("Message from static block singleton object");
    }
}
