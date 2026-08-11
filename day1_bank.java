package hw;

class BankAccount {
    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    BankAccount(int accountNumber, String customerName, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited into Account " + accountNumber);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }

    void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("₹" + amount + " transferred from Account " + accountNumber
                    + " to Account " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed from Account " + accountNumber);
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: ₹" + balance);
        System.out.println();
    }
}

public class day1_bank{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Kavya", "Savings");
        BankAccount a2 = new BankAccount(102, "Priya", "Savings");
        BankAccount a3 = new BankAccount(103, "Rahul", "Current");

        a1.deposit(10000);
        a2.deposit(5000);

        a1.transfer(a2, 3000);

        a2.withdraw(2000);

        System.out.println("\nFINAL ACCOUNT DETAILS");

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}