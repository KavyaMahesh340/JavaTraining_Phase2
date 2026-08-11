package hw;
import java.util.Scanner;
class Student {
    int studentId;
    String studentName;
    int mark1, mark2, mark3, mark4, mark5;
    int total;
    double average;
    char grade;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();

        System.out.print("Enter Student Name: ");
        studentName = sc.next();

        System.out.print("Enter marks in 5 subjects: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        mark4 = sc.nextInt();
        mark5 = sc.nextInt();
    }
    void calculateTotalAndAverage() {
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5.0;
    }
    void calculateGrade() {
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else if (average >= 50)
            grade = 'E';
        else
            grade = 'F';
    }
    void displayResult() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + mark1 + " " + mark2 + " " + mark3 + " " + mark4 + " " + mark5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}
public class day1_hw_studentresult {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.acceptDetails();
        s2.acceptDetails();
        s3.acceptDetails();
        s4.acceptDetails();
        s5.acceptDetails();

        s1.calculateTotalAndAverage();
        s1.calculateGrade();

        s2.calculateTotalAndAverage();
        s2.calculateGrade();

        s3.calculateTotalAndAverage();
        s3.calculateGrade();

        s4.calculateTotalAndAverage();
        s4.calculateGrade();

        s5.calculateTotalAndAverage();
        s5.calculateGrade();

        System.out.println("\nSTUDENT RESULTS");
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
        s4.displayResult();
        s5.displayResult();

        Student highest = s1;
        Student lowest = s1;

        if (s2.total > highest.total) highest = s2;
        if (s3.total > highest.total) highest = s3;
        if (s4.total > highest.total) highest = s4;
        if (s5.total > highest.total) highest = s5;

        if (s2.total < lowest.total) lowest = s2;
        if (s3.total < lowest.total) lowest = s3;
        if (s4.total < lowest.total) lowest = s4;
        if (s5.total < lowest.total) lowest = s5;

        double classAverage = (s1.average + s2.average + s3.average + s4.average + s5.average) / 5;

        System.out.println("Highest Total: " + highest.studentName + " - " + highest.total);
        System.out.println("Lowest Total: " + lowest.studentName + " - " + lowest.total);
        System.out.println("Class Average: " + classAverage);
    }
}