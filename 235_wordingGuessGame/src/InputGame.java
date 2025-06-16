import java.util.Scanner;

public class InputGame extends Game{
    protected Scanner sc;
    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.sc = new Scanner(System.in);
    }

    @Override
    public void playGame(){
        super.playGame();
        String userGuess = "";
        while(!userGuess.equalsIgnoreCase(wordToGuess)){
            displayHint();
            System.out.println("Enter your guess: ");
            userGuess = sc.nextLine();
            attempts++;

            if (userGuess.equalsIgnoreCase(wordToGuess)){
                System.out.println("🎉 Congratulations! You've guessed the word in "
                        + attempts + " attempts.");
            } else {
                System.out.println("❌ Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord());
            }
        }
    }
}
