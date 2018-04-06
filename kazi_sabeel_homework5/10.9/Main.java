public class Main{
  public static void main(String[] args){
    BankAccount cust = new SavingsAccount(256.78, .05);
    cust.withdraw(250.00);
    cust.withdraw(1.00);
    //more actions van be taken to see if the program works
  }
}
