/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ics111assignment08;

/**
 *
 * @author imbuh
 */
public class ICS111Assignment08 {

    public static void main(String[] args) {
        // Create two flights
        Flight f1 = new Flight(473);
        Flight f2 = new Flight(474);
        
        //When using this passenger list, eveyrone gets added to a flight
        //The first six passengers will be added to flight 473
        //and the next two will automatically be added to flight 474
        String[] passenger = 
        {"Alice","Bob","Cynthia","Derick","Elmo","Francis","George","Helen"};
        
        //When using this passenger list, six passengers get assigned to Flight 473
        //the next six passengers get automatically assigned to Flight 474
        //and the last passenger does not get on either flight
        //String[] passenger =
        //{"Alice", "Bob", "Cynthia", "Derick", "Elmo", "Francis", "George", "Helen", 
        // "Irene", "James", "Kelly", "Laurie", "Mary"};
        
        //Add all of the passengers to the flights
        for (String p : passenger) { //Iterate through the passangers
            if(f1.addPassenger(p)) //try flight 473
                System.out.println(p + " is booked on flight " + f1.getFlightNumber());
            else if(f2.addPassenger(p))  // try flight 474
                System.out.println(p + " is booked on flight " + f2.getFlightNumber());
            else //both flights are full
                System.out.println(p + " could not be booked on any flights.");
        }
        System.out.println(f1.getPassengerManifest());
        System.out.println(f2.getPassengerManifest());
        
        //Cancel a passenger
        if (f1.cancelPassenger(passenger[2]))
            System.out.println(passenger[2] + " has cancelled flight " + f1.getFlightNumber());
        if(f2.addPassenger(passenger[2]))
            System.out.println(passenger[2] + " is booked on flight " + f2.getFlightNumber());
        else
            System.out.println(passenger[2] + " could not be booked on flight " + f2.getFlightNumber());
        
        System.out.println(f1.getPassengerManifest());
        System.out.println(f2.getPassengerManifest());
    }
}

