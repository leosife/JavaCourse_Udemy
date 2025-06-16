import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        System.out.println("Seja vem vindo ao banco Bankoso!");
        System.out.println("---------------------------------");
        Scanner sc = new Scanner(System.in);
        int choice;
        double value;
        do {
            System.out.println("Escolha como deseja prosseguir: ");
            System.out.println("" +
                    "1 - Create account\n" +
                    "2 - Deposit money\n" +
                    "3 - Withdraw money\n" +
                    "4 - Transfer\n" +
                    "5 - Check balance\n" +
                    "6 - Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    bank.create();
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?: ");
                    value = sc.nextDouble();
                    bank.deposit(value);
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw?: ");
                    value = sc.nextDouble();
                    bank.withdraw(value);
                case 4:
                case 5:
                    bank.getBalance();
                case 6:
            }
        } while(choice != 6);





        sc.close();





    }
}