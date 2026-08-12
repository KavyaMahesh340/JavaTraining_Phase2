package phase2;
class bank{
	int balance;
	int amount;
	bank(int balance,int amount){
		this.balance=balance;
		this.amount=amount;
	}
	void withdraw() {
		if(balance>amount) {
			balance=balance-amount;
		}
		else {
			throw new  RuntimeException("Balance is less than amount");
		}
	}
}
public class day2_exceptionbank {

	public static void main(String[] args) {
		bank b=new bank(5000,5500);
		b.withdraw();
	}
	
	
}
