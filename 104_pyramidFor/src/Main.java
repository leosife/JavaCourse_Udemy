import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels: ");
        int levels = sc.nextInt();

        for (int i = 0; i <= levels; i++) {
            for (int j = levels; i < j; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
