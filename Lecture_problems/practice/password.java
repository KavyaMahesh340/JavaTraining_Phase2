package practice;
import java.util.Scanner;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String er) {
        super(er);
    }
}
public class password {
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must contain at least 8 characters");
        }
        System.out.println("Password accepted");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        try {
            checkPassword(pass);
        } catch (InvalidPasswordException e) {
            System.out.println("InvalidPasswordException: " + e.getMessage());
        }
    }
}