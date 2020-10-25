package com.zyapkov.patterns.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // Compilation error: SingletonClass() has private access
        // SingletonClass object = new SingletonClass();

        SingletonClass object = SingletonClass.getInstance();
        object.doSomething();

    }
}
