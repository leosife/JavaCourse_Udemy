import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;

    public Question(){
        Random rand = new Random();
        this.operand1 = rand.nextInt(1,100);
        this.operand2 = rand.nextInt(1,100);
        char [] operators = {'+','-','/','*'};
        this.operator = operators[rand.nextInt(4)];
        calculateAnswer();

    }

    private void calculateAnswer(){
        switch (operator){
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;

        }
    }

    public void generateQuestion(){
        System.out.println("What is " +operand1+" "+operator+" "+operand2+" ?");
    }
    // Method to check if the user's answer is correct
    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001; // Allowing a small tolerance for floating-point answers
    }

}
