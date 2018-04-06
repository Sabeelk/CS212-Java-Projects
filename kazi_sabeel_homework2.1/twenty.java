import java.util.Scanner;

class twenty{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number no more than 15");
    int num = input.nextInt();
      for(int i = 0; i < num; i++ ){
        for(int j = 0; j < num; j++ ){
          System.out.print("X");
        }
        System.out.println();
      }
  }
}
