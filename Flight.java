/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ics111assignment08;

import java.util.ArrayList;

/**
 *
 * @author imbuh
 */
public class Flight {
    private static final int CAPACITY = 6;
    private int flightNumber;
    private ArrayList<String> passengers;
    
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
        this.passengers = new ArrayList<>();
    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public boolean addPassenger(String name){
        if (passengers.size() < CAPACITY){
            passengers.add(name);
            return true;
        }else{
            return false;
        }
    }
    public boolean cancelPassenger(String name){
        if (passengers.contains(name)){
            passengers.remove(name);
            return true;
        }else {
            return false;
        }
    }
    public String getPassengerManifest(){
        StringBuilder manifest = new StringBuilder();
        manifest.append("Flight Number: ").append(flightNumber).append("\n");
        manifest.append("Number of Passengers: ").append(passengers.size()).append("\n");
        manifest.append("Passenger List:\n");
        for (String passenger : passengers){
            manifest.append(passenger).append("\n");
        }
        return manifest.toString();
                
    }
}

    

