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
    void transfer(double amount,int fromAccountNumber,int toAccountNumber) {
        if(getBalance() - amount >= -500){
            setBalance(-amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
        if(getBalance()<0){
            System.out.println("Overdraft accepted");
            System.out.println("Transfer succeed");
            showBalance();
        }
    }
}
