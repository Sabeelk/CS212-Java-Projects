public class CarTest{
  public static void main(String[] args){
    //declare object
    Car test = new Car(2017, "Tesla");

    //acceleration test
    for(int i = 0; i < 5; i++){
      test.accelerate();
      System.out.println(test.getSpeed());
    }
    //brake test
    for(int i = 0; i < 5; i++){
      test.brake();
      System.out.println(test.getSpeed());
    }
  }


}
