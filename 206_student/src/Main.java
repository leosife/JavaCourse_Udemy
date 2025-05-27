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
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Roll Number: ");
            int roll = sc.nextInt();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();



            // Step 5: Store student details in the array (COMPLETE THIS PART)
            students[i] = new Student(name, roll, age, height);// COMPLETE THIS PART
        }

        // Step 6: Compute and display statistics
        calculateAndDisplayStatistics(students);
        sc.close();

    }
    // Step 7: Method to calculate and display student statistics
    public static void calculateAndDisplayStatistics(Student[] students) {
            String oldestStudent = students[0].name;
            int oldestAge = students[0].age;
            String tallestStudent = students[0].name;
            double tallestHeight = students[0].height;
            double avarageHeight;
            double totalHeight = 0.0;
            int avarageAge = 0;
            int totalAge = 0;

        for (int i = 0; i < students.length; i++) {
            totalAge += students[i].age;
            totalHeight += students[i].height;

            if(students[i].age > oldestAge){
                oldestStudent = students[i].name;
                oldestAge = students[i].age;
            }
            if(students[i].height > tallestHeight){
                tallestStudent = students[i].name;
                tallestHeight = students[i].height;
            }

        }

        avarageAge = totalAge/ students.length;
        avarageHeight = totalHeight/ students.length;
        System.out.println("Average age: " + avarageAge + "years" +
                "\nAverage Height: "+ avarageHeight + "cm" +
                "\nOldest Student: "+ oldestStudent + "years" +
                "\nTallest Student "+ tallestStudent  + "cm");


    }
}