import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int position1,position2,vazio = 0;

        String[][] space = {
                    {"Empty", "Asteroids", "Planet"},
                {"Alien Ship", "Empty", "Space Station"},
                {"Comet", "Black Hole", "Empty"}};
        String lexi = space[0][0];

        for (int i = 0; i < 5; i++) {
            position1 = rd.nextInt(0,3);
            position2 = rd.nextInt(0,3);
            System.out.println( "Visiting Sector: \n"+space[position1][position2]);
        }
        for (String[] rows : space){
            for(String place:rows){
                if(place.equals("Empty")){
                    vazio ++;
                }
                if (place.compareTo(lexi) > 0){
                    lexi = place;
                }

            }
        }
        System.out.println("Empty places number: "+ vazio);
        System.out.println("Largest place visit: "+ lexi);

    
    }
}