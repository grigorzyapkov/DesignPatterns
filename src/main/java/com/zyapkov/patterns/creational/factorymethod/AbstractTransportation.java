package com.zyapkov.patterns.creational.factorymethod;

public abstract class AbstractTransportation {

    public abstract IVehicle getVehicle();

    public void deliver(){
        IVehicle vehicle = getVehicle();
        System.out.println(String.format("Delivery is made by %s", vehicle.getDeliveryType()));
    }
}
