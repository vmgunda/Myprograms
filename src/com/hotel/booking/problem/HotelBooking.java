package com.hotel.booking.problem;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBooking {

    public static boolean hasBooking(ArrayList<Integer> arrivals, ArrayList<Integer> departures,
                              Integer n, Integer k) {
        Collections.sort(arrivals);
        Collections.sort(departures);
        int roomsRequired=1;
        int i = 0;
        int j = 0;

        for(i=0;i<arrivals.size()-1;i++) {
            if (arrivals.get(i+1) < departures.get(i)) {
                roomsRequired++;
            }
           /* } else {
                roomsRequired--;
            }*/
        }

        return (roomsRequired <= k);
    }

    public static void main(String args[]) {
        ArrayList<Integer> arrivals = new ArrayList<>();
        arrivals.add(1);
        arrivals.add(3);
        arrivals.add(5);

        ArrayList<Integer> departures = new ArrayList<>();
        departures.add(2);
        departures.add(6);
        departures.add(8);
        System.out.println(hasBooking(arrivals, departures, 3, 3));
    }

}
