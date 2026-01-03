package com.kavyuri.lld.parking;

public class PricingStrategy {
    public static int getPricePerHour(VehicleSize size) {
        switch (size) {
            case SMALL:
                return 10;
            case MEDIUM:
                return 20;
            case LARGE:
                return 30;
            default:
                return 0;
        }
    }
}
