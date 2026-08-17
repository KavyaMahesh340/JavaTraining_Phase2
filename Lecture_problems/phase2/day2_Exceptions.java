package phase2;
import java.util.Scanner;
public class day2_Exceptions {
    public static void main(String[] args) {
        try {
            int a, b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        try {
        	 int[] arr = new int[3];
        	 System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size is 3");
        }
        try {
        	String str=null;
        	System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null value cannot be accessed");
        }
    }
}