//Question 10 class
public class FuelGauge{
  private int gallons;

  public FuelGauge(int x){
    gallons = x;
  }

  public void displayFuel(){
    System.out.println("Fuel: " + gallons);
  }

  public int getFuel(){
    return gallons;
  }
  //put fuel into car
  public void increment(){
    if(gallons < 15){
          gallons += 1;
    }
  }
  //remove fuel from car
  public void decrement(){
    if(gallons > 0){
      gallons -= 1;
    }
  }
}
