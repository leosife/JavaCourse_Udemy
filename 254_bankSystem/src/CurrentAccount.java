public class CurrentAccount extends BankAccount{


    public CurrentAccount(String name, int account, double balance, int acctype) {
        super(name, account, balance, acctype);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount >= -500){
            setBalance(-amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
        if(getBalance()<0){
            System.out.println("Overdraft accepted");
            showBalance();
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
