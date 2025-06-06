import java.util.Scanner;

public class MathQuiz {
    private int score;

    // Constructor to initialize the score
    public MathQuiz() {
        this.score = 0;
    }

    // Method to start the quiz
    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) { // 5 questions per quiz
            askQuestion(sc);

        }
        System.out.println("Your final score is: " + score + "/5");
        sc.close();
    }


    // Method to generate a question, get user input, and check the answer
    private void askQuestion(Scanner scanner) {
        Question question = new Question();
        question.generateQuestion();
        System.out.println("Your answer: ");
        double  userAnswer = scanner.nextDouble();
        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. ");
        }


    }

}
