abstract class BankAccount{
  public double balance;
  public int deposits;
  public int withdrawals;
  public double interest;
  public double monthlyCharge;


  public BankAccount(double bal, double intr){
    balance = bal;
    interest = intr;
    deposits = 0;
    withdrawals = 0;
  }

  public double getBalance(){
    return balance;
  }

  public void deposit(double amount){
    balance += amount;
    deposits++;
    System.out.println("your balance is: " + balance);
  }

  public void withdraw(double amount){
    balance -= amount;
    withdrawals++;
    System.out.println("your balance is: " + balance);
  }

  public void calcInterest(){
    double monthly = interest/12;
    double monthlyInterest = balance * monthly;
    balance += monthlyInterest;
  }

  public void monthlyProcess(){
    balance -= monthlyCharge;
    this.calcInterest();
    deposits = 0;
    withdrawals = 0;
    monthlyCharge = 0;
  }
}
