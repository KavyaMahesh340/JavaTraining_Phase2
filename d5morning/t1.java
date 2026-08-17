package d5morning;
class bank{
	String bankName;
	bank(String bankName){
		this.bankName=bankName;
		System.out.println(bankName);
	}
}

public class t1 {	
	static String bankName="Mariamman Indian Bank";
	public static void main(String[] args) {
        bank account1=new bank(bankName);
        bank account2=new bank(bankName);
        bank account3=new bank(bankName);
	}

}
