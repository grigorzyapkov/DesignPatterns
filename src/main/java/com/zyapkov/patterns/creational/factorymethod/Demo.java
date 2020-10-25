package com.zyapkov.patterns.creational.factorymethod;

public class Demo {
    public static void main(String[] args) {
        AbstractTransportation transportation = new LandTransportation();
        transportation.deliver();

        transportation = new AirTransportation();
        transportation.deliver();
    }
}
