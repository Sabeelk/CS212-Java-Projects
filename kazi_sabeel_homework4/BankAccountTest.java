public class BankAccountTest{
  public static void main(String[] args){
    BankAccount copy = new BankAccount(678.56);
    BankAccount test = new BankAccount(copy);

    System.out.println(test.getBalance());
  }
}
