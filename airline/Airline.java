import java.util.ArrayList;

public class Airline{
    private String name;
    //flights array needs to be static and public so it can be
    //accessed by passenger class later when booking a ticket
    public static ArrayList<Flight> flights = new ArrayList<Flight>();

    public Airline(String na){
      name = na;
    }

    public String getName(){
      return name;
    }

    //method to generate flights
    //will be called in main
    public void generateFlights(){
      while(true){
        Flight f = new Flight();
        //infinite loop will break once all the
        //flights have been generated
        //stop generating flights once we reach August 32
        if(f.getDate() == 32) break;
        flights.add(f);
        System.out.println(f.getFlightNumber() + " " +
                           f.getDate() + " " +
                           f.getDepartureTime() + " " +
                           f.getDestination());
      }
    }
}
