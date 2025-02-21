import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] wordList = {"magic", "wizard", "spell", "potion", "dragon"};
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String answer = "", word = "", tent = "";
        char x;
        int n = 0, c = 0;


        do {
            System.out.println("Unscramble the magic words to score points");
            word = wordList[rd.nextInt(0, wordList.length)];
            char[] letters = word.toCharArray();

            n = rd.nextInt(letters.length);
            for (int i = 0; i < letters.length; i++) {
                x = letters[i];
                letters[i] = letters[n];
                letters[n] = x;
            }

            for (char letter : letters) {
                System.out.print(letter);
            }
            System.out.println();
            System.out.println("What is the correct word?: ");
            tent = sc.nextLine().trim();
            if (tent.equalsIgnoreCase(word)) {
                c++;
                System.out.println("You got a point\n" +
                        "Total = "+c);
            } else {
                System.out.println("WRONG :(\n" +
                        "Total = "+c);
            }

            System.out.println("Would you like a new word? (yes/no)");
            answer = sc.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Thanks for playing \n" +
                "Total = "+c);


        sc.close();
    }


}