import java.util.Scanner;
public class Gpa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to the GPA Calculator.");
        System.out.print("Enter the number of subjects: ");
        int numsubjects= sc.nextInt();

        double totalGradePoints = 0;
        int totalCreditHours = 0;

        for (int i = 1; i <= numsubjects; i++) {
            System.out.print("Enter grade for subject " + i + " (A, B, C, D, F): ");
            char grade = sc.next().toUpperCase().charAt(0);

            System.out.print("Enter credit hours for subject " + i + ": ");
            int creditHours = sc.nextInt();

            double gradePoint = getGradePoint(grade);
            if (gradePoint == -1) {
                System.out.println("Invalid grade entered. Try again.");
                i--; // Repeat this iteration
                continue;
            }

            totalGradePoints += gradePoint * creditHours;
            totalCreditHours += creditHours;
        }

        double gpa = totalGradePoints / totalCreditHours;
        System.out.printf("Your GPA is: %.2f\n", gpa);
    }

    private static double getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 9.0;
            case 'C':
                return 8.0;
            case 'D':
                return 5.0;
            case 'F':
                return 3.0;
            default:
                return 0; 
        }
    }
}

