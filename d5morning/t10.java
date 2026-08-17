package d5morning;
class bank10{
	private int accountNumber;
	private String accountHolderName;
	private Long mobileNumber;
	private String accountType;
	private double balance;
	public void displayAccountDetails() {
		System.out.println("====================================");
		System.out.println("       MARIAMMAN INDIAN BANK        ");
		System.out.println("====================================");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Mobile Number  : " + mobileNumber);
		System.out.println("Account Type   : " + accountType);
		System.out.println("Balance        : Rs." + (int)balance);
	}
	bank10(int accountNumber, String accountHolderName, Long mobileNumber, String accountType, double balance) {
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
public class t10 {
	public static void main(String[] args) {
		bank10 ba = new bank10(1001, "Arun", 9876543210l, "Savings", 25000);
		ba.displayAccountDetails();
	}
}
