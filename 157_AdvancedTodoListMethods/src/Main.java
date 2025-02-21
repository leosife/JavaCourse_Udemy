import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare a global ArrayList to store the TODO list
        ArrayList<String> todoList = new ArrayList<>();
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the TODO List Application!");

        // Menu loop
        while(choice!= 4){
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Which task would you like to add? ");
                    addTask(sc.nextLine(),todoList);
                    break;
                case 2:
                    removeTask(sc);
                case 3:
                    displayTasks(todoList);
                case 4:
                    System.out.println("Adios");
            }
        }

    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println(
                "\t 1. Add tasks \n" +
                        "\t 2. Remove tasks \n" +
                        "\t 3. Display the lists \n" +
                        "\t 4. Exit");
    }

    // Method to add a task to the TODO list
    public static void addTask(String tarefa,ArrayList list) {
    list.add(tarefa);
    }

    // Method to remove a task from the TODO list
    public static void removeTask(Scanner scanner) {
        // Display the current tasks
        // Remove the task
        //TODO
    }

    // Method to display all tasks in the TODO list
    public static void displayTasks(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        //TODO


    }
}