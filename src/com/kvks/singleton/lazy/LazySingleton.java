package com.kvks.singleton.lazy;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("Message from Singleton lazy Object");
    }

}
