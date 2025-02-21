import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,1,2,3,4,3,5,6,7,6,5,4,3,3,2,4,5,6,67,7};

        int[] removed = removeDuplicated(numeros);

        System.out.println("Array with duplicates removed: " + Arrays.toString(removed));




    }

    public static int[] removeDuplicated (int[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean NumEx = false;
            //1
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == array[j]) {
                    NumEx = true;
                    break;
                }

            }
                if (!NumEx){
                    array[i] = arr[i];
            }


            }
        return array;
        }
    }


