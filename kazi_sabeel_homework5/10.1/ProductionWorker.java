public class ProductionWorker extends Employee{
  private int shift;
  private double payRate;

  public ProductionWorker(String na, String nu, String hd, int sh, double pr){
    super(na, nu, hd);
    shift = sh;
    payRate = pr;
  }

  //mutators
  public void setShift(int time){
    shift = time;
  }
  public void setpayRate(double money){
    payRate = money;
  }

  //accessors
  public int getShift(){
    return shift;
  }
  public double getPayRate(){
    return payRate;
  }

  public String toString(){
    super.toString();
    if(shift ==1){
      return super.toString() + "They are working the Day Shift" +
      "\nThey are making $" + payRate + "per hours";
    }
    else {
      return super.toString() + "They are working the Night Shift" +
      "\nThey are making $" + payRate + " per hour";
    }
  }
}
