import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you want to enter? ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height (in cm): ");
            double height = sc.nextDouble();

            // Create a new Student object with the provided details
            students[i] = new Student(name, rollNumber, age, height);
        }

        // Compute and display statistics
        calculateAndDisplayStatistics(students);


        sc.close();

    }

    // Method to calculate and display various statistics based on the student array
    public static void calculateAndDisplayStatistics(Student[] students) {
        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;
        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;


        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.height > tallestHeight) {
                tallestHeight = student.height;
                tallestStudent = student.name;
            }

            if (student.age > oldestAge) {
                oldestAge = student.age;
                oldestStudent = student.name;
            }
        }

        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;

        System.out.println("\\n--- Statistics ---");
        System.out.println("Average Age: " + averageAge + " years");
        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Oldest Student: " + oldestStudent + " (Age: " + oldestAge + " years)");
        System.out.println("Tallest Student: " + tallestStudent + " (Height: " + tallestHeight + " cm)");
    }
}