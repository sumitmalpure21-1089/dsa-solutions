package com.kavyuri.lld.parking;

public class Car {
    private final String carNumber;
    private final VehicleSize size;

    public Car(String carNumber, VehicleSize size) {
        this.carNumber = carNumber;
        this.size = size;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public VehicleSize getSize() {
        return size;
    }
}
