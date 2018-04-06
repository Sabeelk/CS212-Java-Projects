//Sabeel Kazi - Question 1
public class Area{
    //no constructors or class variables, only methods to calculate area
    // pie should be 3.14

    //for circle, takes two doubles
    public double calcArea(double rad, double pie ){
      double circleArea = pie * (rad * rad);
      return circleArea;
    }

    //for square, takes two ints
    public int calcArea(int width, int length ){
      int squareArea = length * width;
      return squareArea;
    }

    //for cylinder, takes three doubles
    public double calcArea(double rad, double height, double pie ){
      double cylinderArea = pie * (rad * rad) * height;
      return cylinderArea;
    }
}
