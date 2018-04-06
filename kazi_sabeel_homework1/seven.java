import java.util.Scanner;
import java.lang.String;

class seven{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //ask for inputs
    System.out.println("Please enter three names.");
    String name1 = input.next();
    String name2 = input.next();
    String name3 = input.next();

    //sorting positions alphabetically
    //simple sorting for only 3 inputs w/o using arrays
    if(name1.compareTo(name2) > 0 ){
      String temp = name1;
      name1 = name2;
      name2 = temp;
    }
    if(name2.compareTo(name3) > 0 ){
      String temp = name2;
      name2 = name3;
      name3 = temp;
    }
    if(name1.compareTo(name2) > 0 ){
      String temp = name1;
      name1 = name2;
      name2 = temp;
    }


    //displays sorted list of names
    System.out.println("The sorted list is:");
    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name3);
  }
}
