import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Encoder-Decoder Game!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.println("Choose an option(1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        if(choice==1){
            String encondedString = encode(input,0);
            System.out.println("Encoded string: "+encondedString);
        } else if (choice ==2) {
            String encondedString = encode(input,0);
            System.out.println("Encoded string: "+encondedString);
        } else{
            System.out.println("Invalid choice");
        }

        sc.close();


    }

    public static String encode(String input, int index){
        //base case
        if (index == input.length()){
            return "";
        }
        char ch = input.charAt(index);
        char encodedChar = atbash(ch);
        //recursive call
        return encodedChar + encode(input,index+1);

    }

    public static char atbash(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch - 'A'));

        } else {
            return ch;
        }
    }
}