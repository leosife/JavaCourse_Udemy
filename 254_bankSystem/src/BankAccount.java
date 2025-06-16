 abstract class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private int acctype;

     public BankAccount(String name,int account, double balance, int acctype) {
         this.accountHolderName = name;
         this.accountNumber = account;
         this.balance = balance;
         this.acctype = acctype;
     }
    public void deposit(double amount){
        balance += amount;
    }

    public abstract void withdraw(double amount);
    abstract void transfer(double amount,int accountNumber,String accountHolderName);

    public int getAccountNumber(){
        return accountNumber;
    }
     public int getAcctype(){
         return acctype;
     }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        balance += amount;
    }

    public void showBalance(){
        System.out.println("Your balance is $" + balance);
    }
    // deposit, withdraw, balance, transfer, getaccountnumber, getaccholternumber
}
