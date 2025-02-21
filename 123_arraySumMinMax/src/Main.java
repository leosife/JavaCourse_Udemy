public class Main {
    public static void main(String[] args) {
        int[] numbers = {15,66,23,13,43};
        int sum = 0, max = numbers[0], min = numbers[0];
        for (int n : numbers){
            sum += n;
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }

        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);

    }
}