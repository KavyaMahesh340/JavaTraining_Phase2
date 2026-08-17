package collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
class customer {
    String id;
    int amount;
    int discount;
    customer(String id, int amount, int discount) {
        this.id = id;
        this.amount = amount;
        this.discount = discount;
    }
}
public class listiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<customer> l = new LinkedList<>();
        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int j = 1; j <= n; j++) {
            System.out.println("\nEnter details for customer " + j + ":");
            System.out.print("Enter Customer ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            System.out.print("Enter Discount: ");
            int discount = sc.nextInt();
            sc.nextLine(); 
            l.add(new customer(id, amount, discount));
        }
        ListIterator<customer> list = l.listIterator();
        while (list.hasNext()) {
            customer cust = list.next();
            System.out.println("ID: " + cust.id + ", Amount: " + cust.amount + ", Discount: " + cust.discount);
        }
    }
}
