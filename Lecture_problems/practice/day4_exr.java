package practice;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String error) {
        super(error);
    }
}
class Bank {
    double balance = 5000;
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance: " + balance);
    }
}
public class day4_exr {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.withdraw(2000);
        b.withdraw(5000);
    }
}