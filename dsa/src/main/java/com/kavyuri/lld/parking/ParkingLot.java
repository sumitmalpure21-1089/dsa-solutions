package com.kavyuri.lld.parking;

public class ParkingLot {

    private boolean isAvailable;
    private final VehicleSize size;
    private Car parkedCar;

    public ParkingLot(VehicleSize size) {
        this.isAvailable = true;
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public VehicleSize getSize() {
        return size;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void parkCar(Car car) {
        this.parkedCar = car;
        this.isAvailable = false;
    }

    public void freeLot() {
        this.parkedCar = null;
        this.isAvailable = true;
    }
}
