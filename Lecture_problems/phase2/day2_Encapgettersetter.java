package phase2;
class book{
	private String name;
	private int code;
	public void setter(String name,int code) {
		this.name=name;
		this.code=code;
	}
	public String getname(){
		return name;
	}
	public int getcode() {
		return code;
	}
}
public class day2_Encapgettersetter {
	public static void main(String[] args) {
		book b=new book();
		b.setter("maths", 34);
		System.out.println("Book out of stock:"+b.getname());
		System.out.println("Code:"+b.getcode());

	}

}
