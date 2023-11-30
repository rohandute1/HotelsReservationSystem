package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;
    int weekendRegularCustomer;


    public Hotel(String hotelName, int weekdayRegularCustomer, int weekendRegularCustomer) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = weekdayRegularCustomer;
        this.weekendRegularCustomer = weekendRegularCustomer;
    }
    public String getHotelName(){
        return hotelName;
    }
    public int getWeekdayRegularCustomer(){
        return weekdayRegularCustomer;
    }
    public int getWeekendRegularCustomer(){
        return weekendRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomer=" + weekdayRegularCustomer +
                ", weekendRegularCustomer=" + weekendRegularCustomer +
                '}';
    }
    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return getWeekdayRegularCustomer();
        }
        return getWeekendRegularCustomer();
    }
}
