package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotels=new ArrayList<>();

    public static void findCheapestHotel(LocalDate startDate, LocalDate endDate, boolean isRewardCustomer){
        try {
            List<Hotel> eligibleHotels = hotels.stream()
                    .sorted((hotel1, hotel2) -> Integer.compare(hotel2.getRating(), hotel1.getRating()))
                    .filter(hotel -> {
                        LocalDate date = startDate;
                        int totalRate = 0;
                        while (!date.isAfter(endDate)) {
                            DayOfWeek dayOfWeek = date.getDayOfWeek();
                            String day = dayOfWeek.toString();
                            totalRate += hotel.rateCalculation(day, isRewardCustomer);
                            date = date.plusDays(1);
                        }
                        hotel.setTotalRate(totalRate);
                        return true;
                    })
                    .toList();

            if (eligibleHotels.isEmpty()) {
                throw new RuntimeException("No eligible hotels found.");
            }

            Hotel cheapestBestRatedHotel = eligibleHotels.get(0);

            System.out.println("Cheapest, Best Rated Hotel: " + cheapestBestRatedHotel.getHotelName() +
                    ", Rating: " + cheapestBestRatedHotel.getRating() +
                    " and Total Rates: $" + cheapestBestRatedHotel.getTotalRate());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
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
