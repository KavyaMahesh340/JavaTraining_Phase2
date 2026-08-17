package d5morning;
class bank6{
	private String mobileNumber;
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
}
public class t6 {
	public static void main(String[] args) {
		bank6 ba=new bank6();
		ba.setMobileNumber("9999999999");
		System.out.println("The mobile Number is:"+ba.getMobileNumber());
	}
}
