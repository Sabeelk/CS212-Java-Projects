public class TestScores{
  private int test1;
  private int test2;
  private int test3;

  public TestScores(int a, int b, int c) {
    test1 = a;
    test2 = b;
    test3 = c;
  }
  //2nd constructor in case no arguments are given
  public TestScores(){
    test1 = 0;
    test2 = 0;
    test3 = 0;
  }
  //mutators to change scores if needed
  public void setTest1(int a){
    test1 = a;
  }
  public void setTest2(int b){
    test2 = b;
  }
  public void setTest3(int c){
    test3 = c;
  }
  //accessor
  public int getTest1(){
    return test1;
  }
  public int getTest2(){
    return test2;
  }
  public int getTest3(){
    return test3;
  }
  //avg method
  public int avg(){
    int average = (test1+test2+test3)/3;
    return average;
  }

}
