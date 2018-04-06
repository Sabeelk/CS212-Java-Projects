import java.util.Scanner;

class one{
  public static void main(String[] args){
    System.out.println("Enter a nonzero positve integer value: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int total = 0;
    for(int i=1; i<=number; i++){
      total = total + i;
    }
    System.out.println("The total is: " + total);
  }
}
