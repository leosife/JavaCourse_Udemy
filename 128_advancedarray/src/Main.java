import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array with 10 integers
        int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};
        int max=0,min=0,sum=0,a,x=0;

        // Display the original array
        System.out.println(Arrays.toString(numbers));
        // Shuffle the array


        for (int i = 0; i < numbers.length; i++) {
            Random rc = new Random();
            a = rc.nextInt(numbers.length);
            x = numbers[i];
            numbers[i] = numbers[a];
            numbers[a] = x;


        }
        System.out.println(Arrays.toString(numbers));

        // Find and display the sum, minimum, and maximum of the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < numbers[0]){
                min = numbers[i];
            } else {
                min = numbers[0];
            }
            if (numbers[i] > numbers[0]){
                max = numbers[i];
            } else {
                max = numbers[0];
            }

        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

        // Sort the array and display the sorted array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //TODO

    }
}