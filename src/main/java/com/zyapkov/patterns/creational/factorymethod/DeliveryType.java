package com.zyapkov.patterns.creational.factorymethod;

public enum DeliveryType {
    LAND("Land"),
    AIR("Air");

    private String value;

    DeliveryType(String value) {
        this.value = value;
    }
}
