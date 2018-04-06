/*
Sabeel Kazi
Project I
Airline Booking Simulation
The airline will be called "Jet Red"
Two cities are San Francisco and New York
Flights go from one city to another at each odd and even hour
Program does not account for errors on user input
Program only displays all flights searched on a specific day
*/
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    //generate a new airline class
    Airline jetBlue = new Airline("Jet Red");

    //generate flights for the month of August
    System.out.println("Generated flights");
    System.out.println("FlightNumber Date Time Origin");
    jetBlue.generateFlights();

    //New array needed to store the Random Passenger objects
    //Begin generation of 1000 passengers here
    //remove commented section from Passenger array if you wish to see the names
    ArrayList<Passenger> generatePersons = new ArrayList<Passenger>();
    for(int i = 0; i < 1000; i++){
      Passenger randPerson = new Passenger(1);
      randPerson.bookRandom();
      generatePersons.add(randPerson);
    }

    //Real User booking begins
    Passenger real = new Passenger();
    real.bookReal();
  }
}
