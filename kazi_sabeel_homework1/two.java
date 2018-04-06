import java.util.Scanner;

class two{
  public static void main(String[] args){
    //declare scanner object
    Scanner input = new Scanner(System.in);

    //ask and get input
    System.out.println("Please Enter the Day");
    int day = input.nextInt();

    System.out.println("Please Enter the Month");
    int month = input.nextInt();

    System.out.println("Please Enter the Year");
    int year = input.nextInt();

    if(day * month == year) System.out.println("The date is magic");
    else System.out.println("The date is not magic");
  }
}
