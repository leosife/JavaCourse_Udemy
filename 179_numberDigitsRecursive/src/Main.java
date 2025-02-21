import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert a number: ");
        int num = sc.nextInt();
        System.out.println(numberDigits(num));
        sc.close();

    }

    public static int numberDigits (int n){
        if(n < 10){
            return 1;
        }

        return 1 +  numberDigits(n/10);
    }
}