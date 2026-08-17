package d5morning;
import java.util.Scanner;
class bank2{
	int accountNumber;
	String accountHolderName;
	Long mobileNumber;
	String accountType;
	double balance;
	bank2(int accountNumber,String accountHolderName,Long mobileNumber,String accountType,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.mobileNumber=mobileNumber;
		this.accountType=accountType;
		this.balance=balance;
	}
	void withdraw(int amount) {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println(accountNumber+" "+accountHolderName+" "+" total balance is:"+balance);
		}
	}
}
public class t2 {
	public static void main(String[] args) {
		bank2 b=new bank2(1001, "Arun", 9876543210l, "Savings", 2500);
		bank2 b1=new bank2(1002, "Kumar", 9876543210l, "Current", 500);
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		b.withdraw(amount);
		b1.withdraw(amount);
	}
}
