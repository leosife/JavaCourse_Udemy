import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] wordPool = {"inheritance", "polymorphism", "encapsulation", "abstraction", "interface"};
        String wordToGuess = wordPool[new Random().nextInt(wordPool.length)];

        AdvancedGame game = new AdvancedGame(wordToGuess);
        game.playGame();
    }
}