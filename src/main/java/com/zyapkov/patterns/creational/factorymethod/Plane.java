package com.zyapkov.patterns.creational.factorymethod;

public class Plane implements IVehicle {
    @Override
    public DeliveryType getDeliveryType() {
        return DeliveryType.AIR;
    }
}
