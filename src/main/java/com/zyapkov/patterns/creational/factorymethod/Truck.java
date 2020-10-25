package com.zyapkov.patterns.creational.factorymethod;

public class Truck implements IVehicle {

    @Override
    public DeliveryType getDeliveryType() {
        return DeliveryType.LAND;
    }
}
