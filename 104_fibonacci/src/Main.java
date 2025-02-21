import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of terms: ");
        int n = sc.nextInt();
        int start = 0;
        int start2 = 1;
        int fina = 0;

        System.out.print(start + " + " + start2 +" + " );
        for (int i = 0; i < n; i++) {
            fina = start + start2;
            System.out.print(fina + " + " );

            start =  start2;
            start2 = fina;
        }




        sc.close();
    }
}