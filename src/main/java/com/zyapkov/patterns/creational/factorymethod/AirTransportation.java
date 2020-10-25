package com.zyapkov.patterns.creational.factorymethod;

public class AirTransportation extends AbstractTransportation {
    @Override
    public IVehicle getVehicle() {
        return new Plane();
    }
}
