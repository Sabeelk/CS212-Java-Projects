import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Passenger{
  private String firstName;
  private String lastName;
  private String address;
  private String phone;
  private ArrayList<Ticket> myTickets = new ArrayList<Ticket>();

  //new rand object
  Random r = new Random();

  //new Scanner Object
  Scanner input = new Scanner(System.in);

  //no argument constructor will take input from REAL USER
  //this is done so no instance variables are created in main method
  //as stated in the instructions
  public Passenger(){
    System.out.println("Please enter your First Name: ");
    String fname = input.next();
    firstName = fname;

    System.out.println("Please enter your Last Name: ");
    String lname = input.next();
    lastName = lname;

    System.out.println("Please enter your Address: ");
    String addr = input.next();
    address = addr;

    System.out.println("Please enter your Phone Number: ");
    String ph = input.next();
    phone = ph;
  }

  //Single int argument constructor will create a random passenger
  //single int argument to free up the no argument constructor for real user
  public Passenger(int x){
    //will randomly generate a first name of 9 chars or less
    //sometimes will produce a blank name
    //needed only for simulation purposes to book tickets accross flights
    firstName = "";
    for(int i = 0; i < r.nextInt(9); i++){
      char randomChar = (char) (97 + r.nextInt(25));
      firstName += randomChar;
    }

    //will randomly generate for lastname
    lastName = "";
    for(int i = 0; i < r.nextInt(9); i++){
      char randomChar = (char) (97 + r.nextInt(25));
      lastName += randomChar;
    }

    //generating random addresses is too complicated
    //address field will be left as blank for random passengers
    address = "";

    //will randomly generate 10 digit phone number
    phone = "";
    for(int i = 0; i < 10; i++){
      int randomNum = r.nextInt(10);
      phone += randomNum;
    }
    //Remove comment below if you wish to see the generated names
    //System.out.println(firstName + " " + lastName);
  }

  //method will be used for random passengers to book a random flight
  public void bookRandom(){
    int randomNum = r.nextInt(558); //**change after fixing 11 issue**
    Ticket randomPersonTicket = new Ticket(firstName + " " + lastName, randomNum);
    myTickets.add(randomPersonTicket);

    //must access the flights array in Airline directly
    // to assign ticket to flight as well as person
    for(int i = 0; i < Airline.flights.size(); i++){
      if (Airline.flights.get(i).getFlightNumber() == randomNum){
        Airline.flights.get(i).bookFlight(randomPersonTicket);
      }
    }
  }

  public void bookReal(){
    boolean end = false;
    System.out.println("Welcome to Jet Red. Begin booking.");
    int day = 1;
    while(end == false){
      System.out.println("All flight will be shown based on date");
      System.out.println("Enter a date in August 2017 between 1 and 31: ");
      day = input.nextInt();

      //loop finds the matching flight and displays flights their info
      //cannot match time. cannot undertsnad why
      for(int i = 0; i < Airline.flights.size(); i++){
        if (Airline.flights.get(i).getDate() == day){
            System.out.print("FlightNumber: ");
            System.out.println(Airline.flights.get(i).getFlightNumber());

            System.out.print("Date: ");
            System.out.println("August " + Airline.flights.get(i).getDate()
                                + ", 2017");

            System.out.print("Time: ");
            System.out.println(Airline.flights.get(i).getDepartureTime() +
                                " o' clock");

            System.out.print("Seats Available: ");
            System.out.println(Airline.flights.get(i).getSeats());

            System.out.print("Origin: ");
            System.out.println(Airline.flights.get(i).getOrigin());

            System.out.print("Destination: ");
            System.out.println(Airline.flights.get(i).getDestination());

            System.out.print("Flight Length : ");
            System.out.println(Airline.flights.get(i).getFlightLength() +
                                "Hours");

            System.out.println("Price: $329.00");
            System.out.println();
        }
      }

      //Allow booking from the selection
      System.out.println("Enter a flightNumber to Book from above: ");
      int choice  = input.nextInt();
      //creates a new ticket for the passenger
      Ticket userTicket = new Ticket(firstName + " " + lastName, choice);
      myTickets.add(userTicket);
      //creates a ticket for the flight object
      for(int i = 0; i < Airline.flights.size(); i++){
        if (Airline.flights.get(i).getFlightNumber() == choice){
          Airline.flights.get(i).bookFlight(userTicket);
        }
      }

      //begin close loop
      System.out.println("Thank You. Your Flight has been booked.");
      System.out.println("Book Another? Enter yes or no: ");
      String answer = input.next();
      if(answer.equals("yes")){
        end = false;
        System.out.println("Begin again.");
      }
      else{
        end = true;
      }
    }

    //show tickets
    System.out.println("Here are all of your tickets");
    for(int i = 0; i < myTickets.size(); i++){
      myTickets.get(i).showTicket();
      System.out.println();
    }


  }
}
