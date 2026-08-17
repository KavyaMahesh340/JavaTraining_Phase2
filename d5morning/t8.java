package d5morning;
class bank8{
	private int accountNumber;
	private String accountHolderName;
	private Long mobileNumber;
	private String accountType;
	private double balance;
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposit amount.");
		} else {
			this.balance += amount;
		}
	}
	public void initializeAccount(int accountNumber, String accountHolderName, Long mobileNumber, String accountType, double balance) {
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
public class t8 {
	public static void main(String[] args) {
		bank8 ba = new bank8();
		ba.initializeAccount(1001, "Arun", 9876543210l, "Savings", 2500);
		System.out.print("New customer entry: " + ba.getnumber() + " Name: " + ba.getname() + " Mobile Number: " + ba.getmobile());
		System.out.println(" Opened a savings account: " + ba.gettype() + " Acoount balance: " + ba.getbalance());
		ba.deposit(5000);
		System.out.println("Account balance after deposit: " + ba.getbalance());
		ba.deposit(-500);
	}
}
