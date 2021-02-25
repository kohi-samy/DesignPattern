package com.kvks.singleton.eager;

public class SingletonInstance {

    private static final SingletonInstance singletonInstance = new SingletonInstance();

    private SingletonInstance(){

    }

    public static SingletonInstance getInstance(){
        return singletonInstance;
    }

    public void getMessage(){
        System.out.println("Message from Singleton object");
    }
}
