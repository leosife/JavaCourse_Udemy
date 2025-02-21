public class Main {
    public static void main(String[] args) {

        int[][] arrays= {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        //[0,0],[1,1],[2,2]
        //[0,2],[1,1],[2,0]
        int d1 = 0, d2 = 0;
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(i);
            d1 += arrays[i][i];
            if(i!= arrays.length-1-i){
                d2 += arrays[i][2-i];
            }


        }

        System.out.println(d1);
        System.out.println(d2);

    }
}