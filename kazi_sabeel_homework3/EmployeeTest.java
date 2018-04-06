public class EmployeeTest{
  public static void main(String[] args){
    //creating first employee object
    //declare using the first constructor
    Employee one = new Employee("Susan Meyers", 47899, "Accounting",
    "Vice President");

    Employee two = new Employee("Mark Jones", 39119, "IT", "Programmer");

    Employee three = new Employee("Joy Rogers", 81774, "Manufacturing",
    "Engineer");

    //prints the data
    //classs to the methods directly in prints
    //not formatted 
    System.out.println(one.getName() + " " + one.getidNumber() + " "
    + one.getDepartment() + " " + one.getPosition());

    System.out.println(two.getName() + " " + two.getidNumber() + " "
    + two.getDepartment() + " " + two.getPosition());

    System.out.println(three.getName() + " " + three.getidNumber() + " "
    + three.getDepartment() + " " + three.getPosition());
  }
}
