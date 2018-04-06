import java.util.Scanner;

class thirteen {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number larger than 2");
    int num = input.nextInt();
    //function is called to check result here
    if(isPrime(num) == false){
      System.out.println("This number is prime");
    }
    else System.out.println("This number is not prime");
  }

  public static boolean isPrime(int x){
    //test variable returns the result, changes if number is not prime
    boolean test = false;
    for(int i = 2; i < x; i++){
      if(x % i == 0){
        test = true;
      }
    }
    return test;
  }

}
