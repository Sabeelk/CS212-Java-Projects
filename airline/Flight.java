import java.util.ArrayList;

public class Flight{
  private int flightNumber;
  private static int counter = 1;         //count for flightNumber
  private int filledSeats = 0;
  private int seats = 50 - filledSeats;   //gives seats left
  private int flightLength = 6;           //Flight will always be 6 hours
  private static int date = 0;            //date will only include day
  private int dateShown = date;
  private String airline = "Jet Red";
  private String origin;
  private String destination;
  private static int departureTime = 5;   //is a counter for time
  private int time;       //will be the actual Departure Time
  ArrayList<Ticket> tickets = new ArrayList<Ticket>();

  //constructor takes no arguments so...
  //that flight generation can be simplified
  public Flight() {
    //sets the unique flight nuumber by using the counter;
    flightNumber = counter;
    counter++;

    //date increments after every 17 flights
    //there are 17 flights per day
    if(flightNumber % 18 == 0){
      date = date + 1;
    }
    dateShown = date;

    //departureTime is a static variable
    //becomes 6am after every 17 flights
    //becomes 1pm evry time 13am is reached
    departureTime +=1;
    if(flightNumber % 18 == 0) departureTime = 6;
    if(departureTime == 13) departureTime = 1;
    time += departureTime;

    //flights go from New York to San Fran at even hours
    //Go from Los Angelos to New York at Odd Hours
    //Simulation insctructed to only go between two cities
    if(departureTime % 2 == 0){
      origin = "New York";
      destination = "San Francisco";
    }
    else {
      origin = "San Francisco";
      destination = "New York";
    }
  }

  //accessor methods
  //compacted for better visibility
  public int getFlightNumber(){return flightNumber; }
  public int getDate() {return dateShown; }
  public int getSeats() {return seats; }
  public int getFilledSeats() {return filledSeats; }
  public int getFlightLength() {return flightLength; }
  public int getDepartureTime() {return time; }
  public String getAirline() {return airline; }
  public String getOrigin() {return origin; }
  public String getDestination() {return destination; }

  //none of the instance variables in
  //this class should be altered so no mutator methods

  //This books a flight when called
  //also changes the seat numbers
  public void bookFlight(Ticket rpt){
    tickets.add(rpt);
    filledSeats++;
  }
}
