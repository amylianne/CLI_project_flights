import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private ArrayList<Passenger> passengers;

    public void

    //    interfaces.Booking bookings = addNewPassenger();

//    - Add a new flight
//- Display all available flights
//- Add a new passenger
//- Book a passenger onto a flight
//- Cancel a flight

        public void addNewPassenger(Passenger passenger) {
            Scanner scanner = new Scanner(System.in);
            String passengerName = scanner.nextLine();
            System.out.println("Please input the new passenger's name: " + passengerName);
            String passengerId = scanner.nextLine();
            System.out.println("Please input the new passenger's id: " + passengerId);
            String passengerContactNumber = scanner.nextLine();
            System.out.println("Please input the new passenger's contact number: " + passengerContactNumber);
            Passenger passengers = new Passenger(passengerName, passengerId, passengerContactNumber);
            passengers.add(passenger);
        }
    }

