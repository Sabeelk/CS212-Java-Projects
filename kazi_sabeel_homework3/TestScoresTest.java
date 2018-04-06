import java.util.Scanner;

public class TestScoresTest{
  public static void main(String[] args){
    //initalize scanner
    Scanner input = new Scanner(System.in);
    //input grades to tests
    System.out.println("Please enter the three test scores: ");
    int one = input.nextInt();
    int two = input.nextInt();
    int three = input.nextInt();
    //initalize the Test object
    TestScores answer = new TestScores(one, two, three);
    System.out.println("The average is: " + answer.avg() + ".");

  }
}
