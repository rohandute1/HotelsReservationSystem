package com.bridgelabz;

public class Hotel {
    String hotelName;
    int rateForRegularCustomer;

    public Hotel(String hotelName, int rateForRegularCustomer) {
        this.hotelName = hotelName;
        this.rateForRegularCustomer = rateForRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rateForRegularCustomer=" + rateForRegularCustomer +
                '}';
    }
}
