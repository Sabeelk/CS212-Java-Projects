public class Employee{
  private String name;
  private String number;
  private String hireDate;

  public Employee(String na, String nu, String hd){
    name = na;
    number = nu;
    hireDate = hd;
  }

  //mutators
  public void setName(String na){
    name = na;
  }
  public void setNumber(String nu){
    number = nu;
  }
  public void setHireDate(String hd){
    hireDate = hireDate;
  }

  //mutators
  public String getName(){
    return name;
  }
  public String getNumber(){
    return number;
  }
  public String getHireDate(){
    return hireDate;
  }

  //To string method for class main
  public String toString(){
    return "The employee name is: " + name + "\nThe employee number is: "
    + number + "\nThe date of hire was: " + hireDate + "\n";
  }
}
