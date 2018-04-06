import java.util.Random;
import java.util.Scanner;

class seventeen{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    Random r = new Random();
    //set max value 100 to make it easier
    //problem does not ask for seeding
    int num = r.nextInt(100);
    int guess = -1;

    //loop ends when the number is equal
    while( guess != num ){
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      //tells user if number is too high
      if( guess > num ){
        System.out.println("The number is too high");
      }
      else if(guess < num ){
        System.out.println("The number is too low");
      }
    }
    System.out.println("That is correct!");
  }
}
