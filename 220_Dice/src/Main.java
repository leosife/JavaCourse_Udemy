import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RollingDice dado = new RollingDice(1);
        System.out.println(dado.jogar());

        System.out.println("Welcome to the Dice game");
        System.out.println("Insert the target points: ");
        int target = sc.nextInt();
        boolean keepPlaying = true;
        String a="",answer = "";
        Game play = new Game(0,target);
        sc.nextLine();
        do {
            play.rollDice();
            play.compareDice();
            play.displayScore();

            if (play.gameOver){
                break;
            }


            System.out.println("Do you want to roll again?[y/n]");
            answer = sc.nextLine().toLowerCase().strip();
            a = answer.substring(0,1);

            if (a.equals("n")){
                System.out.println("Finalizando!");
                keepPlaying = false;
            }
        } while (keepPlaying || play.gameOver);



        sc.close();
    }
}