import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private static ArrayList<Passenger> allPassengers;
    private static ArrayList<Flight> flights;
    private Scanner scanner;
    private static Flight flight;
    private static Passenger passenger;

    public static void main(String[] args) {
       flights = new ArrayList<>();
       allPassengers = new ArrayList<>();
//       scanner = new Scanner(System.in);
//       flight = new Flight()



//    }
//        public void createNewBooking (interfaces.Booking bookings){

//    Booking bookings = new FLight();
            System.out.println("Welcome to our booking website!");
            boolean booking = true;
            while (booking) {
                System.out.println("Please choose from our menu: ");
                System.out.println("1. Add a new flight");
                System.out.println("2. Display all available flights");
                System.out.println("3. Add a new passenger");
                System.out.println("4. Book a passenger onto a flight");
                System.out.println("5. Cancel a flight");

            Scanner scanner = new Scanner(System.in);

                scanner.nextInt();
                if (scanner.nextInt() == 1) {
                    System.out.println("You have chosen to add a new flight.");
                    addNewFlight();
                }else if (scanner.nextInt() == 2) {
                    System.out.println("You have chosen to display all available flights.");
                    displayFlights();
                } else if (scanner.nextInt() == 3) {
                    System.out.println("You have chosen to add a new passenger.");
                    addNewPassenger();
                } else if (scanner.nextInt() == 4) {
                    System.out.println("You have chosen to book a passenger onto a flight.");
//                //Call book passenger onto flight method
                    bookNumberOfPassengerOnFlight();

                } else if (scanner.nextInt() == 5) {
                    System.out.println("You have chosen to cancel your flight.");
                    cancelFlights();
                } else {
                    System.out.println("Sorry that's not an option.");
                    System.out.println("Would you like to see our menu again?");
                }
            }

            System.out.println("Thank you for booking with us!");

        }
        //    interfaces.Booking bookings = addNewPassenger();
//if 1
        public static void addNewFlight () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your flight id: ");
         //   scanner.nextLine();
            String flightId = scanner.nextLine();
            System.out.println("id: " + flightId);
            System.out.println("Please input your flight destination: ");
            String flightDestination = scanner.nextLine();
            System.out.println("Your flight destination is: " + flightDestination);
            Flight flight = new Flight(flightId, flightDestination);
            flights.add(flight);
            System.out.println("This is your flight " + flight.getId() + " " + flight.getDestination());
        }

        //if 2
        public static void displayFlights () {
            System.out.println(flights.toString());
//            System.out.println("Would you like to return to the main menu?");
//            Scanner userInput = new Scanner(System.in);
//            if (userInput.equals("Yes") || userInput.equals("yes")){
//                continue;
//            } else{
//            break;}
        }

        //if 3
        public static void addNewPassenger () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your passenger's name: ");
            String passengerName = scanner.nextLine();
            System.out.println("Your passenger's name is: " + passengerName);
            System.out.println("Please input your passenger's id: ");
            String passengerId = scanner.nextLine();
            System.out.println("Your passenger's id is: " + passengerId);
            System.out.println("Please input your contact number: ");
            String passengerContactNumber = scanner.nextLine();
            System.out.println("Your contact number is: " + passengerContactNumber);
            Passenger passenger = new Passenger(passengerName, passengerId, passengerContactNumber);
            allPassengers.add(passenger);
            System.out.println("You added a new passenger!");
        }

        //if 4:
        public static boolean bookNumberOfPassengerOnFlight () {
            Flight matchingFlight;

            //user input passengerId
            //user input flightId
            // Flight matchingFlight;
            //for loop to find passenger matching passengerId
            //for loop to find flight matching flightId
            //matchingFlight.bookPassengerOnFlight()

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your passage ID: ");
            String passengerId = scanner.nextLine();
            System.out.println("Your passenger's id is: " + passengerId);


            for (Passenger matchingPassenger : allPassengers) {
                if (passengerId.equals(passenger.getId())) {
                    System.out.println("This is your ID: " + matchingPassenger);
                    return true;
                }
            }

            System.out.println("Please input your flight id: ");
            String flightId = scanner.nextLine();
            System.out.println("Your flight id is: " + flightId);

            for (Flight matchingFlights : flights) {
                if (flightId.equals(flight.getId())) {
                    System.out.println("You have been booked onto this flight" + matchingFlights);
                    return true;
                }
                return matchingFlights.bookPassengerOnFlight();

            }
            return false;

        }
//if 5
        public static void cancelFlights () {

            System.out.println("Please input the flight id you want to cancel: ");
            Scanner scanner = new Scanner(System.in);
            String flightId = scanner.nextLine();
            for (Flight cancelFlight : flights){
                if (flightId.equals(flight.getId())){
                    cancelFlight.remove(0);
                    System.out.println("You have cancelled flight " + flight.getId());
                }
            }

        }

    }



