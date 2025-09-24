import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(500.00);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Bank Account Manager!");
            System.out.println(
                    "\n1. Deposit Money" +
                    "\n2. Withdraw Money" +
                    "\n3. Check Balance" +
                    "\n4. Exit ");
            System.out.println("Please select an option: ");
            int choice = sc.nextInt();

            try{
                switch (choice){
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current Balance: "+ account.getBalance());
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using our service");
                        break;
                }

            }catch (InsufficientFundsException e){
                //Handling the custom exception
                System.out.println("Exception caught "+ e.getMessage());

            } catch (Exception e){
                //Handling any other exceptions
                System.out.println("An error occurred: "+e.getMessage());
            }
        }










        sc.close();


    }
}