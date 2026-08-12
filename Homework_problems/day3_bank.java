
package hw;
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount() {
        accountNumber = 0;
        holderName = "Unknown";
        balance = 0;
    }

    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    protected void updateBalance(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= 1000) {
            updateBalance(getBalance() - amount);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Minimum balance of Rs.1000 must be maintained");
        }
    }
}

class CurrentAccount extends BankAccount {

    private double overdraftLimit = 5000;

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            updateBalance(getBalance() - amount);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class day3_bank {

    public static void main(String[] args) {

        BankAccount b1 = new SavingsAccount(1001, "Kavya", 20000);
        BankAccount b2 = new CurrentAccount(1002, "Rahul", 10000);

        b1.deposit(5000);
        b1.withdraw(23000);
        b1.displayDetails();

        System.out.println();

        b2.withdraw(14000);
        b2.displayDetails();
    }
}
