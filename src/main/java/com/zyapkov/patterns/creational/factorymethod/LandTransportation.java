package com.zyapkov.patterns.creational.factorymethod;

public class LandTransportation extends AbstractTransportation {
    @Override
    public IVehicle getVehicle() {
        return new Truck();
    }
}
