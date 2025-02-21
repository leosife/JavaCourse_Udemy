public class Main {
    public static void main(String[] args) {

        int age = 16;
        double discount = (age < 18 ? 0.10 : 0.05);
        System.out.println("The discount is : " + discount*100 + "%");

        int score = 85;
        char grade = (score >= 90) ? 'A' : (score >= 70) ? 'B' : (score >= 50) ? 'C': 'D';
        System.out.println(grade);
    }
}