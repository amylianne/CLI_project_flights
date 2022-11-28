import java.util.ArrayList;
import java.util.Scanner;
import interfaces.Booking;

public class Flight implements Booking {
    private String id;
    private String destination;
    private ArrayList<Passenger> passengers;

    public Flight(String id, String destination, ArrayList<Passenger> passengers){
        this.id = id;
        this.destination = destination;
        this.passengers = passengers;
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
        this.passengers = passengers;
    }
    public void addNewFlight(String addNewFlight){
        Scanner id = new Scanner(System.in);
        System.out.println("Please input your flight id: ");
        Scanner destination = new Scanner(System.in);
        System.out.println("Please input your flight destination: ");

    }

    public void countPassengers(int numberOfPassenger){
        this.passengers.size();
    }

    public void cancelFlight(String removeFlight){
        this.passengers.remove(0);
    }

    public void bookNumberOfPassengerOnFlight(int numberOfPassengersOnFlight){

    }

    public void displayFlights(String displayFlights){

    }
}
