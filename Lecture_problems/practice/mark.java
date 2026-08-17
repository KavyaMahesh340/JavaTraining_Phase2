package practice;
import java.util.Scanner;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
public class mark {
    static void checkMarks(int[] marks) throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Mark must be between 0 and 100");
            }
        }
        for (int mark : marks) {
            System.out.println("Mark: " + mark);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        try {
            checkMarks(marks);
        } catch (InvalidMarkException e) {
            System.out.println("InvalidMarkException: " + e.getMessage());
        }
    }
}