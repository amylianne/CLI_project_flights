import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import interfaces.Booking;

public class Flight {
    private String id;
    private String destination;
    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> availableFlights;

    public Flight(String id, String destination){
        this.id = id;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = new ArrayList<>();
    }


    public void countPassengers(int numberOfPassenger){
        this.passengers.size();
    }

    public void cancelFlight(String removeFlight){
        this.passengers.remove(0);
    }

    public boolean bookPassengerOnFlight(){
        return bookPassengerOnFlight();
    }

}
