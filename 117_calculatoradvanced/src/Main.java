import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        String continueCalculator;
        double n1=0.0,n2=0.0,total=0.0;
        int e=0;
        String a = "";
        // Infinite loop to keep the calculator running until the user decides to quit
        do {
            System.out.println("Wecolme to the Calculador");
            System.out.println("Choose number 1: ");
            n1 = sc.nextDouble();
            System.out.println("Choose number 2: ");
            n2 = sc.nextDouble();
            System.out.println("Choose the number of operation\n\t" +
                    "1 - To Sum\n\t" +
                    "2 - To Subtract\n\t" +
                    "3 - To Multiply\n\t" +
                    "4 - To Divide");
            e = sc.nextInt();
            if (e < 1 || e > 4){
                System.out.println("Choose a valid number");
                continue;
            }
            switch (e){
                case 1-> total = n1+n2;
                case 2-> total = n1-n2;
                case 3-> total = n1*n2;
                case 4-> total = n1/n2;
            }
            sc.nextLine();
            System.out.println("Result is "+ total);
            do {
                System.out.println("Would you like to do another calculation?:y or n ");
                a = sc.nextLine().toLowerCase().strip();
                if (!(a.equals("yes") || a.equals("y") || a.equals("y=no") || a.equals("n"))) {
                    System.out.println("Choose a valid option(y or n)");
                }
            } while(!(a.equals("n") || a.equals("no")));



        } while (!(a.equals("no") || a.equals("n")));
        // Prompt the user to enter two numbers
        // Prompt the user to choose an operation
        // Perform the selected operation using a switch statement
        // Display the result if the operation was valid
        // Ask the user if they want to perform another calculation
        //TODO


        // End the program
        System.out.println("Calculator session ended. Goodbye!");
        sc.close();
    }
}