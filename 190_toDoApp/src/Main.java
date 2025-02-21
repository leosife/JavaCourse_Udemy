import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> done = new ArrayList<String>();


        do {
            System.out.println("Choose an option:" +
                    "\n\t1 - Add a task" +
                    "\n\t2 - View all tasks" +
                    "\n\t3 - Mark a task as completed" +
                    "\n\t4 - Remove a task" +
                    "\n\t5 - Exit the application"
            );
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Type a task to add: ");
                    list.add(sc.nextLine());
                    done.add("[ ]");
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i+1)+" - " + list.get(i)+" " +done.get(i) );
                    }
                    break;
                case 3:
                    System.out.println("Type the number of the task that is completed");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i+1)+" - " + list.get(i)+" " +done.get(i) );
                    }
                    int completed = sc.nextInt();
                    done.set(completed-1,"[x]");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please, choose a valid option");
            }

        } while(choice != 5);
        sc.close();
    }
}