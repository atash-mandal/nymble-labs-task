package test_package;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int capacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addItinery(Destination destination) {
        itinerary.add(destination);
    }

    public void removeItinery(Destination destination) {
        itinerary.remove(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Travel package is already full.");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println(destination.getName() + ":");
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger list for " + name + ":");
        System.out.println("Capacity: " + capacity);
        System.out.println("Number of passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getName() + " - Passenger Number: " + passenger.getPassengerNum());
        }
    }
    
}
