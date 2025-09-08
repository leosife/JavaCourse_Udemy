import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BankService {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int account,clientenumber;
    double balance;
    String name, lname, actype;
    ArrayList<BankAccount> listaclientes = new ArrayList<>();


    public void create() {

        System.out.println("Name: ");
        name = sc.nextLine();

        if (listaclientes.isEmpty()) {
            account = 10;
        } else {
            account = listaclientes.getLast().getAccountNumber() + 1;
        }
        System.out.println("Account created");

        balance = 00.00;
        System.out.println("Which account would you like to create? \n" +
                "Type 1: Normal account\n" +
                "Type 2: Saving account");
        int acc = sc.nextInt();
        sc.nextLine();
        switch (acc) {
            case 1:
                BankAccount contacriada = new CurrentAccount(name,account,balance,1);
                System.out.println("Current Account created.");
                actype = "Current";
                listaclientes.add(contacriada);
                break;
            case 2:
                BankAccount contacriada1 = new SavingsAccount(name,account,balance, 2);
                System.out.println("Saving Account created.");
                actype = "Savings";
                listaclientes.add(contacriada1);
                break;
        }

    }

    public void showClients() {
        for (BankAccount cliente : listaclientes) {
            System.out.println(cliente.getAccountHolderName() + "---" + cliente.getAccountNumber() + "---");

        }
    }

    public int getClient() {
        System.out.println("Please insert the account number: ");
        int acc = sc.nextInt();
        for (int i = 0; i < listaclientes.size(); i++) {
            if (acc == listaclientes.get(i).getAccountNumber()) {
                System.out.println("Client founded");
                clientenumber = i;
            } else {
                System.out.println("Client not founded");
                clientenumber = 999999999;
            }
        }
        return clientenumber;
    }

    public void getBalance() {
        System.out.println("Balance: " + listaclientes.get(getClient()).getBalance());

    }
    public void deposit(double value) {
        listaclientes.get(getClient()).deposit(value);

    }
     public void withdraw(double value){
        listaclientes.get(getClient()).withdraw(value);
     }

     public void transfer(double value,int fromacc, int toacc){
         listaclientes.get(getClient()).transfer(value,fromacc,toacc);

     }

}

