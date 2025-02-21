import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arrays = new int[3][3];
        int[][] arrays2= {{1,2,3},{4,15,6},{7,8,9}};
        System.out.println(arrays[2][2]);
        System.out.println(arrays2[2][2]);
        int sum =0;
        int largest = arrays2[0][0];

//        for (int i = 0; i < arrays2.length; i++) {
//            for (int j = 0; j < arrays2.length; j++) {
//                System.out.println(arrays2[i][j]);
//            }
//
//        } o mesmo que :

        for (int[] rows : arrays2) {
            for (int num : rows) {
                System.out.println(num);
                sum+=num;
                if (num > largest){
                    largest = num;
                }
            }

        }
        System.out.println(sum);
        System.out.println(largest);

    }
}