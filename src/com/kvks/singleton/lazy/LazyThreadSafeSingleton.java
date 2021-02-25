package com.kvks.singleton.lazy;

public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton threadSafeInstance;

    private LazyThreadSafeSingleton(){

    }

    public static synchronized LazyThreadSafeSingleton getInstance(){
        if(threadSafeInstance == null) {
            threadSafeInstance = new LazyThreadSafeSingleton();
        }
        return threadSafeInstance;
    }

    public void getMessage(){
        System.out.println("Message from Singleton Object in thread safe");
    }
}
