package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotels=new ArrayList<>();

    public static void findCheapestHotel(LocalDate startDate, LocalDate endDate, boolean isRewardCustomer){
        int lakewoodRate = 0, bridgewoodRate = 0, ridgewoodRate = 0;
        int bestRatedRate = Integer.MAX_VALUE;
        Hotel bestRatedHotel = null;

        while (!startDate.isAfter(endDate)) {
            DayOfWeek dayOfWeek = startDate.getDayOfWeek();
            String day = String.valueOf(dayOfWeek);

            lakewoodRate += hotels.get(0).rateCalculation(day, isRewardCustomer);
            bridgewoodRate += hotels.get(1).rateCalculation(day, isRewardCustomer);
            ridgewoodRate += hotels.get(2).rateCalculation(day, isRewardCustomer);

            startDate = startDate.plusDays(1);
        }
        bestRatedHotel = hotels.get(0);  // Initialize bestRatedHotel with the first hotel

        if (hotels.get(1).getRating() > bestRatedHotel.getRating()) {
            bestRatedHotel = hotels.get(1);
            bestRatedRate = bridgewoodRate;
        }

        if (hotels.get(2).getRating() > bestRatedHotel.getRating()) {
            bestRatedHotel = hotels.get(2);
            bestRatedRate = ridgewoodRate;
        }
        System.out.println("Hotel Name: Lakewood Rate: " + lakewoodRate + "$  Rating "+ hotels.get(0).rating);
        System.out.println("Hotel Name: Bridgewood Rate: " + bridgewoodRate + "$  Rating "+ hotels.get(1).rating);
        System.out.println("Hotel Name: Ridgewood Rate: " + ridgewoodRate + "$  Rating "+ hotels.get(2).rating);

        System.out.println("Cheapest, Best Rated Hotel: " + bestRatedHotel.getHotelName() + ", Rating: " + bestRatedHotel.getRating() + " and Total Rates: $" + bestRatedRate);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel reservation system");

        Hotel Lakewood = new Hotel( "Lakewood", 110,90, 3, 80, 80);
        Hotel Bridgewood = new Hotel("Bridgewood", 160,60, 4, 110, 50);
        Hotel Ridgewood = new Hotel("Ridgewood", 220,150, 5, 100, 40);
        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        findCheapestHotel(startDate, endDate, true);
    }
}
