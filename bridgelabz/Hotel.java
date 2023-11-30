package com.bridgelabz;

public class Hotel {
    final private String hotelName;
    final private int rateForRegularCustomer;

    public Hotel(String hotelName, int rateForRegularCustomer) {
        this.hotelName = hotelName;
        this.rateForRegularCustomer = rateForRegularCustomer;
    }
    public String getHotelName(){
        return hotelName;
    }
    public int getRateForRegularCustomer(){
        return rateForRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rateForRegularCustomer=" + rateForRegularCustomer +
                '}';
    }
    public int rateCalculation(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")){
            return getRateForRegularCustomer();
        }
        return 0;
    }
}
