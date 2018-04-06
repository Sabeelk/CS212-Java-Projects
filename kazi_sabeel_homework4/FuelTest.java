//Tests the Fuelguage and Odometer classes
public class FuelTest{
  public static void main(String[] args){
    //create fuelGauge object, arg is initial amount of gas
    FuelGauge test = new FuelGauge(5);
    Odometer tesla = new Odometer();

    //Begin simulation for filling up gas
    System.out.println("Begin filling up gas: ");
    while (test.getFuel() != 15){
      test.increment();
      test.displayFuel();
    }

    //Simulate trip, i is the length of the trip
    //can change i to scanner input if desired
    System.out.println("\nBegin the trip ");
    System.out.println("Displaying: Mileage+Fuel");
    for(int i = 1; i <= 100; i++){
      tesla.increment(test);
      System.out.println(tesla.getMileage() + " " + test.getFuel());
    }
  }
}
