package com.kvks.singleton.lazy;

public class DoubleLockSingleton {

    private static DoubleLockSingleton threadSafeInstance;

    private DoubleLockSingleton(){

    }

    public static DoubleLockSingleton getInstance(){
        if(threadSafeInstance == null) {
            synchronized (DoubleLockSingleton.class) {
                if(threadSafeInstance == null) {
                    threadSafeInstance = new DoubleLockSingleton();
                }
            }
        }
        return threadSafeInstance;
    }

    public void getMessage(){
        System.out.println("Message from Singleton lazy synchronized Object");
    }
}
