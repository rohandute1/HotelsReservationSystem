package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;
    int weekendRegularCustomer;
    int rating;
    int weekdayRewardCustomerRate;
    int weekendRewardCustomerRate;


    public Hotel(String hotelName, int weekdayRegularCustomer, int weekendRegularCustomer, int rating, int weekdayRewardCustomerRate, int weekendRewardCustomerRate) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = weekdayRegularCustomer;
        this.weekendRegularCustomer = weekendRegularCustomer;
        this.rating = rating;
        this.weekdayRewardCustomerRate = weekdayRewardCustomerRate;
        this.weekendRewardCustomerRate = weekendRewardCustomerRate;
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
    public int getWeekdayRewardCustomerRate() {
        return weekdayRewardCustomerRate;
    }

    public int getWeekendRewardCustomerRate() {
        return weekendRewardCustomerRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomer=" + weekdayRegularCustomer +
                ", weekendRegularCustomer=" + weekendRegularCustomer +
                ", rating=" + rating +
                ", weekdayRewardCustomerRate=" + weekdayRewardCustomerRate +
                ", weekendRewardCustomerRate=" + weekendRewardCustomerRate +
                '}';
    }
    public int rateCalculation(String day, boolean isRewardCustomer) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return isRewardCustomer ? getWeekdayRewardCustomerRate() : getWeekdayRegularCustomer();
        }
        return isRewardCustomer ? getWeekendRewardCustomerRate() : getWeekendRegularCustomer();
    }
}
