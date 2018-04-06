import java.util.Scanner;

class six{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //ask for input
    System.out.println("Please enter seconds greater than 60.");
    long seconds = input.nextLong();

    //converts and outputs time
    if( seconds >= 60 && seconds < 3600){
      System.out.println("The number of minutes are " + seconds/60);
    }
    else if( seconds >= 3600 && seconds < 86400){
      System.out.println("The number of hours are " + seconds/3600);
    }
    else if( seconds >= 86400){
      System.out.println("The number of days are " + seconds/86400);
    }
  }
}
