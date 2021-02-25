package com.kvks.singleton.eager;

public class EagerSingletonDemo {

    public static void main(String args[]){

        SingletonInstance instance = SingletonInstance.getInstance();
        instance.getMessage();

        StaticBlockSingletonInstance instance1 = StaticBlockSingletonInstance.getInstance();
        instance1.getMessage();
    }
}
