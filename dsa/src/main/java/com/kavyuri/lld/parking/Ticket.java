package com.kavyuri.lld.parking;

public class Ticket {

    private final Car car;
    private final ParkingLot parkingLot;
    private final long entryTime;
    private long exitTime;

    public Ticket(Car car, ParkingLot parkingLot) {
        this.car = car;
        this.parkingLot = parkingLot;
        this.entryTime = System.currentTimeMillis();

    }

    public Car getCar() {
        return car;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void closeTicket() {
        this.exitTime = System.currentTimeMillis();
    }

    public int getParkingDurationInHours() {
        long endTime = (exitTime == 0) ? System.currentTimeMillis() : exitTime;
        long durationInMillis = endTime - entryTime;
        int hours = (int) Math.ceil(durationInMillis / (1000.0 * 60 * 60));
        return Math.max(1, hours);
    }

}
