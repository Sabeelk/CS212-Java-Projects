import java.util.Scanner;

class four{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int period = -1;
    System.out.println("Please enter the pay period in days:");

    //doesn't allow input less than one
    while(period < 0){
      System.out.println("try again");
      period = input.nextInt();
    }

    double pay = 0.01;
    for(int i=0; i < period; i++){
      pay = pay * 2;
    }

    System.out.print("The amount for the pay period is: ");
    System.out.println("$" + pay);
  }
}
