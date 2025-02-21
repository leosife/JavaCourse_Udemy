import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean astroExist;
        String astroName;
        ArrayList<String> astro = new ArrayList<String>();
        ArrayList<String> age = new ArrayList<String>();
        ArrayList<String> status = new ArrayList<String>();
        int choice = 0;

        do {
            System.out.println("Select an option\n\t" +
                    "1 - Add astronaut\n\t" +
                    "2 - Update status\n\t" +
                    "3 - Display astronauts\n\t" +
                    "4 - Close");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println(" -- Astronaut information --");
                    System.out.println("Name: ");
                    astro.add(sc.nextLine());
                    System.out.println("Age: ");
                    age.add(sc.nextLine());
                    System.out.println("Status: ");
                    status.add(sc.nextLine());
                    break;


                case 2:
                    if (astro.isEmpty()){
                        System.out.println("There is no astronaut registered yet\n" +
                                "Please type 1 to add a new astronaut ");
                        break;
                    }
                    System.out.println(" -- Updating information --");
                    System.out.println("Name: ");
                    astroName = sc.nextLine();
                    astroExist = astro.contains(astroName);
                    if (astroExist){
                        System.out.println("New Status: ");
                        status.set(astro.indexOf(astroName),sc.nextLine());
                    } else {
                        System.out.println("The astronaut is not registered in our program" +
                                "\nPlease type 1 to add a new astronaut ");
                    }
                    break;
                case 3:
                    if (astro.isEmpty()){
                        System.out.println("There is no astronaut registered yet\n" +
                                "Please type 1 to add a new astronaut ");
                    } else{
                        System.out.println("List of all astronauts: ");
                        for (int i = 0; i < astro.size() ; i++) {
                            System.out.println(astro.get(i)+"," + age.get(i)+ " - Status: "+ status.get(i));
                        }
                    }

                    break;
                case 4:
                    System.out.println("Bye Bye!");
                default:
                    System.out.println("Please select a valid number");
                    continue;
            }
            System.out.println();

        } while(choice!=4);


        sc.close();
            }
}