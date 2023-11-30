package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotels=new ArrayList<>();

    public static void findCheapestHotel(){
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER,10);
        LocalDate date2 = LocalDate.of(2020,Month.SEPTEMBER,11);
        DayOfWeek localDate1 = date1.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        int add1 = hotels.get(0).rateCalculation(day1) + hotels.get(0).rateCalculation(day2);
        int add2 = hotels.get(1).rateCalculation(day1) + hotels.get(1).rateCalculation(day2);
        int add3 = hotels.get(2).rateCalculation(day1) + hotels.get(2).rateCalculation(day2);

        if (add1 < add2 && add1 < add3) {
            System.out.println("Hotel Name: Lakewood" + " " + "Rate:" + add1 + "$");
        }else if (add2 < add1 && add2 < add3) {
            System.out.println("Hotel Name: Bridgewood" + " " + "Rate:" + add2 + "$");
        }else {
            System.out.println("Hotel Name: Ridgewood" + " " + "Rate:" + add3 + "$");
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
        System.out.println(hotels);
        findCheapestHotel();
    }
}
