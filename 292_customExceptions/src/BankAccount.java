public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }


    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            //throwing custom exception with a meaningful message
            throw new InsufficientFundsException("Insufficient funds. Your balance is "+balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: "+balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful! New balance: "+balance);
    }

    public double getBalance(){
        return balance;
    }
}
