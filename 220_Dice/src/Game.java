public class Game {
    private RollingDice dice1 = new RollingDice(1);
    private RollingDice dice2 = new RollingDice(1);
    private int targetScore, currentScore;
    private int d1,d2;
    boolean gameOver = false;

    // Step 4: Constructor to initialize the game with a target score
    public Game(int currentScore,int targetScore) {
        this.targetScore = targetScore;
        this.currentScore = 0;

    }

    public void rollDice(){
        d1 = dice1.jogar();
        d2 = dice2.jogar();
        System.out.println("Dice 1: " + d1);
        System.out.println("Dice 2: " + d2);
        currentScore = currentScore + d1 + d2;

    }

    public void compareDice(){
        if (d1 == d2){
            currentScore ++;
            System.out.println("You rolled a double! Bonus points added.");

        }
    }

    public void displayScore(){
        System.out.println("Current Score: "+ currentScore);
        System.out.println("Target Score: "+ this.targetScore);
        if(currentScore>targetScore){
            System.out.println("Voce ultrapassou o limite");
            gameOver = true;
            
        }
    }


}
