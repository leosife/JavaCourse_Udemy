public class Cliente {
    String name,lname,accounttype;
    int account;
    double balance;

    public Cliente(String accounttype, String name, String lname, int account, double balance){
        this.name = name;
        this.lname = lname;
        this.account = account;
        this.accounttype = accounttype;
        this.balance = balance;
    }
}
