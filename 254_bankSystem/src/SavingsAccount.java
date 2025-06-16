public class SavingsAccount extends BankAccount{
    public SavingsAccount(String name, int account, double balance, int acctype) {
        super(name, account, balance, acctype);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() < 100){
            System.out.println("Insufficient funds. Minimum balance of $100 required");
        } else {
            setBalance(-amount);
        }
    }

    @Override
    void transfer(double amount, int accountNumber, String accountHolderName) {
        if(getBalance() < 100){
            System.out.println("Insufficient funds. Minimum balance of $100 required");
        } else {
            setBalance(-amount);
        }
    }
}
