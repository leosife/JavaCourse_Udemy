import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a integer number to see his factorial number: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial number of "+number+" is "+result);

        sc.close();

    }


    public static int factorial(int n){
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
}