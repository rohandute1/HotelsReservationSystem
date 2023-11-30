package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;
    int weekendRegularCustomer;
    int rating;

    public Hotel(String hotelName, int weekdayRegularCustomer, int weekendRegularCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = weekdayRegularCustomer;
        this.weekendRegularCustomer = weekendRegularCustomer;
        this.rating = rating;
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
    public int getRating(){
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomer=" + weekdayRegularCustomer +
                ", weekendRegularCustomer=" + weekendRegularCustomer +
                ", rating=" + rating +
                '}';
    }
    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return getWeekdayRegularCustomer();
        }
        return getWeekendRegularCustomer();
    }
}
