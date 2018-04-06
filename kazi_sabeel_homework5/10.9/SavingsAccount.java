public class SavingsAccount extends BankAccount{
  int status;

  public SavingsAccount(double bal, double intr){
    super(bal, intr);
    if(balance <= 25.00) status = 0;
    else status = 1;
    System.out.println("Your balance is: " + balance);
  }

  @Override
  public void withdraw(double amount){
    if(status == 0){
      System.out.println("Account Inactive, Bring balance Above $25.00 to reactivate");
    }
    else {
      super.withdraw(amount);
    }
    //check for status after withdrawal as well
    if(balance <= 25.00){
      status = 0;
    }
  }

  @Override
  public void deposit(double amount){
    if(balance + amount >= 25.00){
      System.out.println("Sufficient amount to reactivate account, Account Reactivated");
      status = 0;
    }
    super.deposit(amount);
  }

  @Override
  public void monthlyProcess(){
    if(super.withdrawals > 4){
      monthlyCharge = 1.00 * (withdrawals - 4.00);
    }
    super.monthlyProcess();
    if(balance <= 25.00){
      status = 0;
      System.out.println("Your Account has become inactive");
    }
  }
}
