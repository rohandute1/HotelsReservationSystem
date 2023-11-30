package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotels=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");

        Hotel Lakewood = new Hotel("Lakewood", 110);
        Hotel Bridgewood = new Hotel("Bridgewood", 160);
        Hotel Ridgewood = new Hotel("Ridgewood", 220);
        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);
        System.out.println(hotels);
    }
}
