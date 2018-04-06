//Question 10 Class
public class Odometer{
  private int mileage;

  public Odometer(){
    mileage = 0;
  }

  public void displayMileage(){
    System.out.println("Mileage: " + mileage);
  }
  public int getMileage(){
    return mileage;
  }

  public void increment(FuelGauge car){
    if(car.getFuel() != 0){
      mileage += 1;
    }
    if(mileage > 999999 ){
      mileage = 0;
    }
    if(mileage % 24 == 0 ){
      car.decrement();
    }
  }
}
