import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x =0;
        int[] numeros = {1,1,3,1};
        ArrayList<Integer> num = new ArrayList<>();
        int k = 1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (i==j){
                    num.add(i);
                }
            }
        }

        for (int i = 0; i < num.size(); i++) {
            x = num.get(i);

        }
        System.out.println(x);
        if (x<=k){
            System.out.println("OK");
        }



    }
}