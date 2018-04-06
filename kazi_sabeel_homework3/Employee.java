public class Employee{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  //all three constructors declared here
  public Employee(String a, int b, String c, String d){
    name = a;
    idNumber = b;
    department = c;
    position = d;
  }
  public Employee(String a, int b){
    name = a;
    idNumber = b;
    department = "";
    position = "";
  }
  public Employee(){
      name = "";
      idNumber = 0;
      department = "";
      position = "";
    }

  //mutators written below
  public void setName(String a){
    name = a;
  }
  public void setidNumber(int b){
    idNumber = b;
  }
  public void setDepartment(String c){
    department = c;
  }
  public void setPosition(String d){
    position = d;
  }

  //accessors written below
  public String getName(){
    return name;
  }
  public int getidNumber(){
    return idNumber;
  }
  public String getDepartment(){
    return department;
  }
  public String getPosition(){
    return position;
  }
}
