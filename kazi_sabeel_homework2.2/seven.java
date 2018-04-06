import java.util.Scanner;

class seven{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //ask for inut and assign grades
    System.out.println("Please enter the five test scores.");
    int test1 = input.nextInt();
    int test2 = input.nextInt();
    int test3 = input.nextInt();
    int test4 = input.nextInt();
    int test5 = input.nextInt();
    //prints the test score plus the letter grade
    System.out.println("The letter grades are as follows")
    System.out.println(test1 + " - " + determineGrade(test1));
    System.out.println(test2 + " - " + determineGrade(test2));
    System.out.println(test3 + " - " + determineGrade(test3));
    System.out.println(test4 + " - " + determineGrade(test4));
    System.out.println(test5 + " - " + determineGrade(test5));
    //prints the avg
    System.out.print("The average score is: ");
    System.out.println(calcAverage(test1, test2, test3, test4, test5));
  }
  public static double calcAverage(int x, int y, int z, int a, int b){
    //gives average score for tests
    int avg = (x + y + z + a + b)/5;
    return avg;
  }

  public static String determineGrade(int x){
    //returns the letter grade
    String letter = "";
    if( x > 89 && x < 101){
      letter = "A";
    }
    else if( x > 79 && x < 90){
      letter = "B";
    }
    else if( x > 69 && x < 80){
      letter = "C";
    }
    else if( x > 59 && x < 70){
      letter = "D";
    }
    else if( x < 60){
      letter = "F";
    }
    return letter;
  }

}
