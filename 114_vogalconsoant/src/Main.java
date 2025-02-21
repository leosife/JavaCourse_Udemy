import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vog = {"a","e","i","o","u"};
        String[] con = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","z","w","y"};
        System.out.println("Please, insert a string: ");
        String frase = sc.nextLine().toLowerCase();

        int c = 0,v = 0;
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vog.length; j++) {
                String myString = String.valueOf(frase.charAt(i));
                if (myString.equals(vog[j])) {
                    v++;
                }
            }
            for (int k = 0; k < con.length; k++) {
                String myString = String.valueOf(frase.charAt(i));
                if (myString.equals(con[k])) {
                    c++;
                }
            }
        }

        System.out.println("We have "+v+" vogals and "+c+" consoants");



        sc.close();


    }
}