package phase2;
class BankAccount{
	void deposit(double amt) {
		System.out.println("The amount is:"+amt);
	}
	void deposit(double amt,String des) {
		System.out.println("The amount and its description:"+amt+" "+des);
	}
	void deposit(double amt,String des,int id) {
		System.out.println("The person details are:"+amt+" "+des+" "+id);
	}
}
class savings extends BankAccount{
	void interest(double amt) {
		System.out.println("The interest of 6% is:"+amt*0.06);
	}
	}
class current extends BankAccount{
	void interest(double amt) {
		System.out.println("The interest of 2% is:"+amt*0.02);
	}
}
public class day2_poly {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposit(500);
		b.deposit(200, "Debited");
		b.deposit(200, "Credited",106);
		savings s=new savings();
		s.interest(500);
		current c=new current();
		c.interest(500);

	}

}
