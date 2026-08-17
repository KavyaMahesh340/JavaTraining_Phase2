package d5morning;
class bank12 {
	private int accountNumber;
	private String accountHolderName;
	private Long mobileNumber;
	private String accountType;
	private double balance;
	public void displayAccountDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Mobile Number  : " + mobileNumber);
		System.out.println("Account Type   : " + accountType);
		System.out.println("Balance        : Rs." + (int)balance);
		System.out.println();
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	bank12(int accountNumber, String accountHolderName, Long mobileNumber, String accountType, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.mobileNumber = mobileNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposit amount.");
		} else {
			this.balance += amount;
		}
	}
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			this.balance -= amount;
		}
	}
	public int getnumber() {
		return accountNumber;
	}

	public String getname() {
		return accountHolderName;
	}

	public Long getmobile() {
		return mobileNumber;
	}

	public String gettype() {
		return accountType;
	}

	public double getbalance() {
		return balance;
	}
}

public class t12 {
	public static void main(String[] args) {
		bank12 account1 = new bank12(1001, "Arun", 9876543210l, "Savings", 25000);
		bank12 account2 = new bank12(1002, "Kumar", 9876501234l, "Current", 50000);
		System.out.println(" PERFORMING OPERATIONS FOR ACCOUNT 1");
		System.out.println("1. Initial Account Details:");
		account1.displayAccountDetails();
		System.out.println("2. Depositing Rs.5000");
		account1.deposit(5000);
		System.out.println("3. Updated Balance: Rs." + account1.getbalance());
		System.out.println();
		System.out.println("4. Withdrawing Rs.3000");
		account1.withdraw(3000);
		System.out.println("5. Updated Balance: Rs." + account1.getbalance());
		System.out.println();
		System.out.println("6. Changing mobile number to 9999999999");
		account1.setMobileNumber(9999999999l);
		System.out.println("7. Updated Mobile Number: " + account1.getmobile());
		System.out.println();
		System.out.println("8. Testing negative deposit (Rs.-500):");
		account1.deposit(-500);
		System.out.println();
		System.out.println("9. Testing negative withdrawal (Rs.-200):");
		account1.withdraw(-200);
		System.out.println();
		System.out.println("10. Testing overdraft withdrawal (Rs.40000):");
		account1.withdraw(40000);
		System.out.println();
		System.out.println("PERFORMING OPERATIONS FOR ACCOUNT 2");
		System.out.println("1. Initial Account Details:");
		account2.displayAccountDetails();
		System.out.println("2. Depositing Rs.10000");
		account2.deposit(10000);
		System.out.println("3. Withdrawing Rs.5000");
		account2.withdraw(5000);
		System.out.println();
		System.out.println("4. Final Account Details:");
		account2.displayAccountDetails();
	}
}
