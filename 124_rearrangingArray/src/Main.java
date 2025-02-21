public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,1,2,3,4};
        int n = numeros.length/2;
        int[] numerosok = new int[numeros.length];


        for (int i = 0; i < n; i++) {
            numerosok[i*2] = numeros[i];
            numerosok[1+(i*2)] = numeros[i+n];

        }

        for (int i = 0; i < numerosok.length; i++) {
            System.out.println(numerosok[i]);
        }

    }
}