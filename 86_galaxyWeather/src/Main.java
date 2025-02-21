import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Declare and initialise Scanner object
        Scanner sc = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Hello, welcome to the galaxy weather");

        // Take user input for planet
        System.out.println("Which planet do you want to know about?");
        String planet = sc.nextLine();

        // Take current temperature as input
        System.out.println("What is the current temperature?");
        String temp = sc.nextLine();

        // Compute response based on planet and current temperature
        if (planet.equals("Earth")) {
            System.out.println("Planet Earth");
        } else if (planet.equals("Mars")){
            System.out.println("Planet Mars");
        } else if (planet.equals("Venus")){
            System.out.println("Planet Venus");
        } else if (planet.equals("Jupiter")){
            System.out.println("Planet Jupiter");
        } else {
            System.out.println("Unknown Planet");
        }

        // Display response

        // Close Scanner object (good practice)
    }
}

