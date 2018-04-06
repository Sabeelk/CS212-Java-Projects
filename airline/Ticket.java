public class Ticket{
   private int ticketNumber;
   private String myAirline = "Jet Red";  //Single airline program
   private String myPassenger;
   private int myFlight;
   private double price = 329.00;         //our price will always be the same
   private static int counter = 1;        //counter for ticketNumber

   public Ticket(String names, int fli){
     ticketNumber = counter;
     myPassenger = names;
     myFlight = fli;
     counter++;
   }

   public void showTicket(){
     System.out.println("Ticketnumber: " + ticketNumber);
     System.out.println("Passenger Name: " + myPassenger);
     System.out.println("Flight Number: " + myFlight);
   }
}
  
