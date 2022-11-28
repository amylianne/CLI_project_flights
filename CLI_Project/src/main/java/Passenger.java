import java.util.Scanner;

public class Passenger {
    private String name;
    private int id;
    private int contactNumber;

    public Passenger(String name, int id, int contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }


    public void addNewPassenger(String addNewPassenger){
        Scanner passengerName = new Scanner(System.in);
        System.out.println("Please input the new passenger's name: " + passengerName);
        Scanner passengerId = new Scanner(System.in);
        System.out.println("Please input the new passenger's id: " + passengerId);
        Scanner passengerContactNumber = new Scanner(System.in);
        System.out.println("Please input the new passenger's contact number: " + passengerContactNumber);
//        this.addNewPassenger();
//        this.Passenger.addNewPassenger();
//

    }
}

