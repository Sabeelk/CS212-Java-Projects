public class Car{
  private int year;
  private String model;
  private int speed;

  //constructor for the fields
  public Car(int a, String b){
      year = a;
      model = b;
      speed = 0; //Speed is defaulted to 0
  }
  //Accessors written below
  public int getYear(){
    return year;
  }
  public String getModel(){
    return model;
  }
  public int getSpeed(){
    return speed;
  }

  public void accelerate(){
    speed += 5;
  }

  public void brake(){
    speed -= 5;
  }

}
