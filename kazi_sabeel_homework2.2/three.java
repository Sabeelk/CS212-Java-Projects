import java.util.Scanner;

public class three{

 public static void main(String[] args){
   double length = getLength();
   double width = getWidth();
   double area = getArea( length, width);
   displayData( length, width, area);

 }
 //obtains length
 public static double getLength(){
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the length");
   double length = input.nextDouble();
   return length;
 }
 //obtains width
 public static double getWidth(){
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the width");
   double length = input.nextDouble();
   return length;
 }
 //calculates and returns area
 public static double getArea(double x, double y){
   double area = x * y;
   return area;
 }
 //calculates and returns area
 public static void displayData(double x, double y, double z){
   System.out.println("The length is: " + x);
   System.out.println("The width is: " + y);
   System.out.println("The area is: " + z);

 }


}
