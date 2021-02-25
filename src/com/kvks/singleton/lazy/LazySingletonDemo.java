package com.kvks.singleton.lazy;

public class LazySingletonDemo {

    public static void main(String args[]){

        LazySingleton instance = LazySingleton.getInstance();
        instance.getMessage();

        DoubleLockSingleton instance2 = DoubleLockSingleton.getInstance();
        instance2.getMessage();

    }
}
