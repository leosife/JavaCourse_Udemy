import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int number = sc.nextInt();
       int original = number;
       int sum = 0;

        // Calculate the sum of digits of x
        while (number > 0) {
            sum += number % 10; // Extract the last digit and add to sumOfDigits
            number /= 10; // Remove the last digit from number
        }
        System.out.println(sum);

        if (original % sum == 0){
            System.out.println("The number is a Harshad number");
        } else{
            System.out.println("he number is not a Harshad number");
        }

       sc.close();

    }
}