import java.util.Scanner;

class three{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //ask for inut and assign grades
    System.out.println("Please enter the three test scores.");
    int test1 = input.nextInt();
    int test2 = input.nextInt();
    int test3 = input.nextInt();

    //gives average score for tests
    int avg = (test1 + test2 + test3)/3;
    System.out.println("Your average score is " + avg + ".");

    //prints the letter grade 
    String letter = "";
    if( avg > 89 && avg < 101){
      letter = "A";
    }
    else if( avg > 79 && avg < 90){
      letter = "B";
    }
    else if( avg > 69 && avg < 80){
      letter = "C";
    }
    else if( avg > 59 && avg < 70){
      letter = "D";
    }
    else if( avg < 60){
      letter = "F";
    }
    System.out.println("Your grade is " + letter + ".");
  }
}
