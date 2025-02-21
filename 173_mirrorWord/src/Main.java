import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word to see the magic mirror: ");
        String word = sc.nextLine();
        System.out.println(reverseString(word));
        sc.close();

    }


    public static String reverseString(String str){
        //base case
        if (str.isEmpty() || str.length() == 1){
            return  str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }
}