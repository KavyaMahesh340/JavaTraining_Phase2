package hw;

import java.util.Scanner;

class ATM {

    private int atmId;
    private String location;
    private double cashAvailable;

    ATM(int atmId, String location, double cashAvailable) {
        this.atmId = atmId;
        this.location = location;
        this.cashAvailable = cashAvailable;
    }

    void insertCard() {
        System.out.println("Card inserted");
    }

    boolean enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid PIN");
            return false;
        }
    }

    void checkBalance(BankAccount account) {
        System.out.println("Balance: Rs." + account.getBalance());
    }

    void withdrawCash(BankAccount account, double amount) {

        if (amount <= cashAvailable) {
            account.withdraw(amount);
            cashAvailable = cashAvailable - amount;
        } else {
            System.out.println("ATM does not have enough cash");
        }
    }

    void depositCash(BankAccount account, double amount) {
        account.deposit(amount);
        cashAvailable = cashAvailable + amount;
    }

    void accountDetails(BankAccount account) {
        account.displayDetails();
    }

    void exit() {
        System.out.println("Thank you for using ATM");
    }
}

public class day3_atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new SavingsAccount(
                1001,
                "Kavya",
                30000
        );

        ATM atm = new ATM(
                501,
                "Coimbatore",
                100000
        );

        atm.insertCard();

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (accountNumber == account.getAccountNumber()
                && atm.enterPin(pin)) {

            int choice;

            do {
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        atm.checkBalance(account);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double withdrawAmount = sc.nextDouble();

                        System.out.println("Processing...");
                        atm.withdrawCash(account, withdrawAmount);
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        double depositAmount = sc.nextDouble();

                        atm.depositCash(account, depositAmount);
                        break;

                    case 4:
                        atm.accountDetails(account);
                        break;

                    case 5:
                        atm.exit();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 5);
        }
    }
}