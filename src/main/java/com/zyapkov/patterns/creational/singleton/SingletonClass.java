package com.zyapkov.patterns.creational.singleton;

public class SingletonClass {

    // create a single instance of the class
    private static SingletonClass instance = new SingletonClass();

    // private constructor so that this class cannot be instantiated
    private SingletonClass(){}

    // access the only instance available
    public static SingletonClass getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Hello World!");
    }
}
