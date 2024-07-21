import java.util.Scanner;

public class StudentAchievement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Level 10 - Exceptional Achievement");
        } else if (marks >= 80) {
            System.out.println("Level 7 - Outstanding Achievement");
        } else if (marks >= 70) {
            System.out.println("Level 5 - Meritorious Achievement");
        } else if (marks >= 60) {
            System.out.println("Level 3 - Satisfactory Achievement");
        } else {
            System.out.println("Level 1 - Needs Improvement");
        }
    }
}

