package d5morning;
class bank4{
	 private int accountNumber;
	 private String accountHolderName;
	 private Long mobileNumber;
	 String accountType;
	 double balance;
	 bank4(String accountType,double balance){
			this.accountType=accountType;
			this.balance=balance;
		}
	public void setter(int accountNumber,String accountHolderName,Long mobileNumber,String accountType,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.mobileNumber=mobileNumber;
		this.accountType=accountType;
		this.balance=balance;
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
	void display() {
		System.out.println("The account balance is:"+balance);
	}
}
public class t4 {
	public static void main(String[] args) {
		bank4 ba=new bank4("Saving",5000);
		ba.setter(1001, "Arun", 9876543210l, "Savings", 2500);
		System.out.println("New customer entry: "+ba.getnumber()+" Name: "+ba.getname()+" Mobile Number: "+ba.getmobile());
		ba.display();
	}
}
