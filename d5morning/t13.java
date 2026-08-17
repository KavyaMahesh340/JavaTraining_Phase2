package d5morning;
import java.util.Scanner;
 class bank13 {
    public static String bankName = "State Bank of India";
    
    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public bank13(String accountNumber, String accountHolderName, String mobileNumber, String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class t13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();

        System.out.print("Enter Account Type: ");
        String type = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = scanner.nextDouble();

       bank13 account = new bank13(accNum, name, mobile, type, bal);

        account.displayAccountDetails();

        System.out.print("Enter amount to deposit: ");
        double depAmount = scanner.nextDouble();
        account.deposit(depAmount);

        System.out.print("Enter amount to withdraw: ");
        double witAmount = scanner.nextDouble();
        account.withdraw(witAmount);

        System.out.println("Updated Details:");
        account.displayAccountDetails();

        scanner.close();
    }
}
