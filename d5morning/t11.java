package d5morning;
class bank11 {
	private int accountNumber;
	private String accountHolderName;
	private Long mobileNumber;
	private String accountType;
	private double balance;
	static String bankName = "Mariamman Indian Bank";
	public void displayAccountDetails() {
		System.out.println("====================================");
		System.out.println("       " + bankName.toUpperCase());
		System.out.println("====================================");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Mobile Number  : " + mobileNumber);
		System.out.println("Account Type   : " + accountType);
		System.out.println("Balance        : Rs." + (int)balance);
		System.out.println();
	}
	bank11(int accountNumber, String accountHolderName, Long mobileNumber, String accountType, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.mobileNumber = mobileNumber;
		this.accountType = accountType;
		this.balance = balance;
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

public class t11{
	static String bankName = "Mariamman Indian Bank";
	public static void main(String[] args) {
		bank11 account1 = new bank11(1001, "Arun", 9876543210l, "Savings", 25000);
		bank11 account2 = new bank11(1002, "Kumar", 9876501234l, "Current", 50000);
		account1.displayAccountDetails();
		account2.displayAccountDetails();
	}
}
