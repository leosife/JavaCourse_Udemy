import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Welcome to the guessing game: ");
        System.out.println("Please choose a number between 1 - 100");
        int high = 100,low = 0,mid= 50,number = sc.nextInt();
        sc.nextLine();
        String choice = "";
        System.out.println("The computer is trying to guess your number...");

        int guess = rd.nextInt(1,101);

        do {
            mid = low + (high-low)/2;
            System.out.println("I think your number is "+ mid);
            System.out.println(
                    "\nPress h if your number in higuer " +
                    "\nPress l if your number is low" +
                    "\nPress c if is the correct number");
            choice = sc.nextLine();

            switch (choice){
                case "h":
                    low = mid + 1;
                    break;
                case "l":
                    high = mid - 1;
                    break;
                case "c":
                    System.out.println("Correct, the right number is "+ mid);
                    break;
                default:
                    System.out.println("Choose a valida option");

            }

        } while(!choice.equals("c"));


        sc.close();

    }


}