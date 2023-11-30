package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotels=new ArrayList<>();

    public static void findCheapestHotel(LocalDate startDate, LocalDate endDate){
        int lakewoodRate = 0, bridgewoodRate = 0, ridgewoodRate = 0;

        while (!startDate.isAfter(endDate)) {
            DayOfWeek dayOfWeek = startDate.getDayOfWeek();
            String day = String.valueOf(dayOfWeek);

            lakewoodRate += hotels.get(0).rateCalculation(day);
            bridgewoodRate += hotels.get(1).rateCalculation(day);
            ridgewoodRate += hotels.get(2).rateCalculation(day);

            startDate = startDate.plusDays(1);
        }
        System.out.println("Hotel Name: Lakewood Rate: " + lakewoodRate + "$");
        System.out.println("Hotel Name: Bridgewood Rate: " + bridgewoodRate + "$");
        System.out.println("Hotel Name: Ridgewood Rate: " + ridgewoodRate + "$");

        if (lakewoodRate < bridgewoodRate && lakewoodRate < ridgewoodRate) {
            System.out.println("Cheapest Hotel: Lakewood Total Rate: " + lakewoodRate + "$");
        } else if (bridgewoodRate < lakewoodRate && bridgewoodRate < ridgewoodRate) {
            System.out.println("Cheapest Hotel: Bridgewood Total Rate: " + bridgewoodRate + "$");
        } else {
            System.out.println("Cheapest Hotel: Ridgewood Total Rate: " + ridgewoodRate + "$");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel reservation system");

        Hotel Lakewood = new Hotel( "Lakewood", 110,90);
        Hotel Bridgewood = new Hotel("Bridgewood", 160,60);
        Hotel Ridgewood = new Hotel("Ridgewood", 220,150);
        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        findCheapestHotel(startDate, endDate);
    }
}
